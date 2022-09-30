package parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class FormParameter 
{
	@Test
	public void formparaTest()
	{
		// step-1 create the pre requisites
		baseURI="http://localhost";
		port=8084;
		
		// step-2 send the response and validate
		given()
		.formParam("createdBy", "Tushar")
		.formParam("projectName", "ASS")
		.formParam("status", "Created")
		.formParam("teamSize", 12)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
	
	}

}
