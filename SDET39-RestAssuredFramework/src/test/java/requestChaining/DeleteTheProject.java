package requestChaining;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteTheProject
{
	@Test
	public void deletetheprojectTest()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		// step-2 send the request
		given()
		.pathParam("pid", "TY_PROJ_1607")
		.when()
		.delete("/projects/{pid}")
		.then()
		.assertThat().statusCode(204).log().all();
	}

}
