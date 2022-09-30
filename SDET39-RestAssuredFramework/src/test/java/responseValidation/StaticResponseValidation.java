package responseValidation;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StaticResponseValidation
{
     @Test
	public void staticresponsevalidationTest()
	{
		// step-1- Create pre requeiest
	        baseURI="http://localhost";
	        port=8084;
	        
	        JSONObject obj = new JSONObject();
	        obj.put("createdBy", "Tushar");
	        obj.put("projectName", "SDET-Online");
	        obj.put("status", "Ongoing");
	        obj.put("teamSize", "12");
	        
	        String expData = "SDET-Online";
	        
	        
	        // step-2 Send the request
	       Response req = given()
	    		   .body(obj)
	    		   .contentType(ContentType.JSON)
	    		   .when()
	    		   .post("/addProject");
	       
	       // step-3 Validate the response
	       String actData = req.jsonPath().get("projectName");
	      Assert.assertEquals(expData, actData);
	      
	    		   
	}
}
