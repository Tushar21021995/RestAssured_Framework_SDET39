package genericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

/**
 * This class consist of genric method related to data base
 * @author Tushar
 */
public class DataBaseLibrary
{
	Driver driverref;
	Connection con;

	/**
	 * This method will established the connection with data base
	 * @author Tushar
	 * @throws SQLException 
	 */

	public void connecttoDB() throws SQLException
	{
		driverref =new Driver();
		DriverManager.registerDriver(driverref);
		DriverManager.getConnection(IConstantLibrary.dbURL, IConstantLibrary.dbUsername, IConstantLibrary.dbPassword);
		
	}
	
	/**
	 * This method will close the data base connection
	 * @author Tushar
	 * @throws SQLException 
	 */
	
	public void closeDB() throws SQLException
	{
		con.close();
		
	}
	
	/**
	 * This method will execute a query, fetch the data and verify the data in database with exp data from the caller
	 * @author Tushar
	 * @throws SQLException 
	 */
	
	public String executeQueryandReturnData(String query,int columnIndex, String expData) throws SQLException
	{
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag = false;
		
		while(result.next())
		{
			String actData = result.getString(columnIndex);
			if(expData.equalsIgnoreCase(actData))
			{
				flag = true;
				break;
			}
			
		}
		
		if(flag)
		{
			System.out.println("The data is verified");
			return expData;
		}
		else
		{
			System.out.println("The data is not verified");
			return "";
		}
		
	}




}
