package responseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
public class DynamicResponseValidation
{
	@Test
	public void dynamicresvalTest()
	{
		// step-1 create pre requesties
		baseURI="http://localhost";
		port=8084;
		
		String expData = "TY_PROJ_9614";
		
		// step-2  send the request
		Response resp = when()
				.get("/projects");
		
		// step-3 validate the response
		List<String> list = resp.jsonPath().get("projectId");
		for(String actData:list)
		{
			 Assert.assertEquals(actData, expData);
			System.out.println(actData);
		}
		
		
	}
	
}
