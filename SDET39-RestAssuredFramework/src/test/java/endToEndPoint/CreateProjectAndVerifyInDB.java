package endToEndPoint;

import genericLibrary.BaseAPIClass;
import genericLibrary.EndPointLibrary.EndPointsLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import practice_POJO_SerDse.ProjectLibraray;

public class CreateProjectAndVerifyInDB extends BaseAPIClass
{
	@Test
	public void createProject() throws SQLException
	{
		ProjectLibraray plib = new ProjectLibraray("Tushar", "Bosch"+jLib.getRandomNum(), "Created", 12);


		Response resp = given()
				.body(plib)
				.contentType(ContentType.JSON)
				.when()
				.post(EndPointsLibrary.createProject);

		// step-3 capture the project id

		String expData = rLib.getJsonData(resp, "projectId");
		System.out.println(expData);

		// step-4 verify the project id in db
		String query = "select * from project";

		String actData = dbLib.executeQueryandReturnData(query, 1, expData);
		Assert.assertEquals(actData, expData);
				

	}
}
