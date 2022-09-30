package parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameter 
{
	@Test
	public void pathparameterTest()
	{
		// step-1 create pre requisites
		baseURI="http://localhost";
		port=8084;
		
		// step-2 send the request and validate the response
		given()
		.pathParam("pid", "TY_PROJ_802")
		.when()
		.delete("/projects/{pid}")
		.then()
		.assertThat().statusCode(204).log().all();
		
		
	}
}
