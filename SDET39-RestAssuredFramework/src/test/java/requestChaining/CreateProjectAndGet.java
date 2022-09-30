package requestChaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import practice_POJO_SerDse.ProjectLibraray;

public class CreateProjectAndGet
{
	@Test
	public void createproandgetTest()
	{
		// step-1 create pre requisties for post
		baseURI = "http://localhost";
		port =8084;
		
		Random ran = new Random();
		int rannum = ran.nextInt(100);
		
		ProjectLibraray plib = new ProjectLibraray("Tushar", "Qspider"+rannum, "created", 12);
		
		// step-2 send the post request
		Response resp = given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		
		// step-3 capture the project id writing json path
		String projectID=resp.jsonPath().get("projectId");
		System.out.println(projectID);
		
		
		// step-4 send the get request with projectid
		when()
		.get("/projects/"+projectID)
		.then()
		.assertThat().statusCode(200).log().all();
	
		
	}

}
