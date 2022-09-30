package badCrudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest 
{
	@Test
	public void createprojectTest()
	{
		baseURI = "http://localhost";
		port = 8084;


		JSONObject obj = new JSONObject();
		obj.put("createdBY", "Tushar");
		obj.put("projectName", "SDET-ONLINE");
		obj.put("status", "Ongoing");
		obj.put("teamSize", 12);


		//send the request

		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addproject")
		.then()
		.assertThat().statusCode(201)
		.log().all();



	}
}
