package genericLibrary;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * This class will contain basic configuration annotations
 * @author Tushar
 *
 */
public class BaseAPIClass {
	
	public DataBaseLibrary dbLib = new DataBaseLibrary();
	public JavaLibrary jLib = new JavaLibrary();
	public RestAssuredLibrary rLib = new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		dbLib.connecttoDB();
		Reporter.log("====db connection successfull====", true);
		
		baseURI = IConstantLibrary.appURL;
		port = IConstantLibrary.appPort;
		
	}
	
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dbLib.closeDB();
		Reporter.log("====db closed====",true);
	}
	
	

}