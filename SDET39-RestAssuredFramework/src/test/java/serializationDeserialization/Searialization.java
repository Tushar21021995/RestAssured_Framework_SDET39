package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import practice_POJO_SerDse.EmployeeDetails;

public class Searialization {

	@Test
	public void serializationTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		// step-1
             EmployeeDetails emp = new EmployeeDetails("Tushar", 12345, "TY-1", "", true);
             
             // step-2 create object for mapper
             
             ObjectMapper obj = new ObjectMapper();
             obj.writeValue(new File(".\\Data.json"), emp);
	}

}
