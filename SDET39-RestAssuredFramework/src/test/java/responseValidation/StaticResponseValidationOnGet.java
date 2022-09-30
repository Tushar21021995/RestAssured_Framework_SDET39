package responseValidation;
import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
public class StaticResponseValidationOnGet 

{
	@Test
	public void validationTest()
	{
		String expData = "TY_PROJ_1202";
		baseURI="http://localhost";
		port=8084;
		
		Response resp = when()
				.get("/projects");
		
		String actData = resp.jsonPath().get("[1].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("Data Verfied");
		
		resp.then().log().all();
				
	}
	

}
