package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import practice_POJO_SerDse.EmployeeDetails;

public class Deserialization 
{
	@Test
     public void deserializationTest() throws JsonParseException, JsonMappingException, IOException
     {
    	 // create object of Object Mapper
    	 ObjectMapper obj = new ObjectMapper();
    	 
    	
    	 // read the value from object mapper class
    	 EmployeeDetails emp = obj.readValue(new File(".\\Data.json"), EmployeeDetails.class);
    	 
    	 
    	  
    	  // access the value using reference
    	  System.out.println(emp.getEmail());
    	  System.out.println(emp.getName());
    	  emp.setName("SDET");
     }
}
