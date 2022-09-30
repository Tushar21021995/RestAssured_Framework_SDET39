package basicCrudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest 
{
	@Test
	public void deleteprojectTest()
	{
		// step-1:- create pre requiest
		
		//step-2:- send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_802");
		
		// step-3:- validate the response
		System.out.println(resp.getStatusCode());
	}

}
