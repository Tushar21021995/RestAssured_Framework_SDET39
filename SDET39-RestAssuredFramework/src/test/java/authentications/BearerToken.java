package authentications;

import static  io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken 
{
	@Test
	public void bearertokenTest()
	{
		baseURI = "https://github.com";
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "SDET-Rest");
		jobj.put("description", "hybrid framweork");
		
		given()
		.auth()
		.oauth2("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")
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/user/repos")
		.then()
		.log().all();
		
		
		
	}

}
