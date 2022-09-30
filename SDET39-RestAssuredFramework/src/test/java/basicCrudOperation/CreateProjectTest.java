package basicCrudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest 
{
     @Test
	public void createprojectTest()
	{
		// step-1 create the pre requiest necessary
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Tushar");
		obj.put("projectName", "SDET39");
		obj.put("status", "On Going");
		obj.put("teamSize", 12);
		
		// step-2  send the request
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		Response rest = request.post("http://localhost:8084/addProject");
		
		//step-3 validate the response
		System.out.println(rest.contentType());
		System.out.println(rest.getStatusCode());
		System.out.println(rest.getStatusLine());
		
		System.out.println(rest.asString());
		System.out.println(rest.prettyPrint());
		
					
	}
}
