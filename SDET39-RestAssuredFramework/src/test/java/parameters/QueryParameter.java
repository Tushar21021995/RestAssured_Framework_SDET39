package parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QueryParameter 
{
    @Test
	public void queryparaTest()
	{
		// step-1 create pre requisties
		baseURI="https://reqres.in";
		
		// step-2 send the request and validate the reponse
		given()
		.queryParam("page", 2)
		.when()
		.get("/api/users")
		.then()
		.assertThat().statusCode(200).log().all();
		
		
		
		
	}
}
