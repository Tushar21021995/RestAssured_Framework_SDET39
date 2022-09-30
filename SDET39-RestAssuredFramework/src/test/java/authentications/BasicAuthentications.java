package authentications;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuthentications 
{
	@Test
	public void basicauthTest()
	{
		baseURI = "http://localhost";
		port = 8084;

		// create pre requisties
		given()
		.auth()
		.basic("rmgyantra", "rmg@9999")
		.when()
		.get("./login")
		.then()
		.log().all();
	}
}
