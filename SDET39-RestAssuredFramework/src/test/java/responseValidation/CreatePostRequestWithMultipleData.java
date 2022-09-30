package responseValidation;
import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import practice_POJO_SerDse.ProjectLibraray;

public class CreatePostRequestWithMultipleData 
{

	@Test(dataProvider="getData")
	public void createpostrewithmultipledataTest(String createdBy, String projectName, String status, int teamSize)
	{

		baseURI = "http://localhost";
		port = 8084;

		// Step-1 create pre requisites.

		Random ran=new Random();
		int RAN=ran.nextInt(1000);

		ProjectLibraray plib = new ProjectLibraray(createdBy, projectName+RAN, status, teamSize);


		given()
		.body(plib)
		.contentType(ContentType.JSON)
		.post("/addProject")
		.then().log().all();
	}

	@DataProvider(name="getData")
	public Object[][] data()
	{

		Object[][] obj =new Object[10][4];

		obj[0][0]="Tushar";
		obj[0][1]="All States";
		obj[0][2]="Created";
		obj[0][3]=12;

		obj[1][0]="Tushar";
		obj[1][1]="Bei";
		obj[1][2]="Completed";
		obj[1][3]=14;

		obj[2][0]="Tushar";
		obj[2][1]="Galaxy";
		obj[2][2]="Completed";
		obj[2][3]=12;


		obj[3][0]="Tushar";
		obj[3][1]="Watch";
		obj[3][2]="On-Going";
		obj[3][3]=10;

		obj[4][0]="Navnath";
		obj[4][1]="JK-Tyre";
		obj[4][2]="Cmpleted";
		obj[4][3]=13;

		obj[5][0]="Pratik";
		obj[5][1]="Paint";
		obj[5][2]="ON-Going";
		obj[5][3]=14;

		obj[6][0]="Tushar";
		obj[6][1]="Qspider";
		obj[6][2]="ON GOING";
		obj[6][3]=12;

		obj[7][0]="Tushar";
		obj[7][1]="Bank";
		obj[7][2]="Completed";
		obj[7][3]=14;

		obj[8][0]="Vishal";
		obj[8][1]="TYSS";
		obj[8][2]="Completed";
		obj[8][3]=12;

		obj[9][0]="Tushar";
		obj[9][1]="TYSS";
		obj[9][2]="ON-Going";
		obj[9][3]=14;

		return obj;

	}



}
