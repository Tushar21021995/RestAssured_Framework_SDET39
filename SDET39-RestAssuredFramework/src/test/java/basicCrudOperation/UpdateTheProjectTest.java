package basicCrudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateTheProjectTest 
{
	@Test
	public void updatetheprojectTest()
	{
		// step-1 create the pre requiest necessary
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Tushar");
		obj.put("projectName", "SDET39");
		obj.put("status", "Completed");
		obj.put("teamSize", 12);

		// step2 - send the request
		RequestSpecification req = RestAssured.given();
		
		req.body(obj);
		req.contentType(ContentType.JSON);
		
		Response rest = req.put("http://localhost:8084/projects/TY_PROJ_802");
		
		// step 3:- validate the request
		System.out.println(rest.getStatusCode());
				

	}

}
