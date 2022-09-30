package basicCrudOperation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectsTest
{
	@Test
	public void getallprojectsTest()
	{
		// step-1 create pre requistes

		// step-2 send the request
		Response rest = RestAssured.get("http://localhost:8084/projects");

		// step 3-  validate the response
		int expStatus = 200;
		int actStatus = rest.getStatusCode();
		Assert.assertEquals(actStatus, expStatus);

	}
}
