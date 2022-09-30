package requestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.Random;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import practice_POJO_SerDse.ProjectLibraray;

public class CreateProjectAndDelete
{
	public void createanddeleteTest()
	{
		// step-1 create pre requisties for post
				baseURI = "http://localhost";
				port =8084;
				
				Random ran = new Random();
				int rannum = ran.nextInt(100);
				
				ProjectLibraray plib = new ProjectLibraray("Tushar", "Qspider"+rannum, "created", 12);
				
				// step-2 send the post request
				Response resp = given()
				.body(plib)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");
				
				// step-3 capture the project id writing json path
				String projectID=resp.jsonPath().get("projectId");
				System.out.println(projectID);
				
				
				// step-4 send the get request with projectid
				when()
				.get("/projects/"+projectID)
				.then()
				.assertThat().statusCode(200).log().all();
			
				// step-5 send the delete request 
				given()
				.delete("/projects/"+projectID)
				.then()
				.assertThat().statusCode(204).log().all();
				//System.out.println(resp.getStatusCode());
				
	}

}
