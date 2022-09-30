package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.interactions.Pause;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import practice_POJO_SerDse.EmployeeDetailsObject;
import practice_POJO_SerDse.SpouseDetails;

public class SerializationUsingObject
{
	@Test
	public void serializationusingobjectTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] arr = {1234,12345};
	
		SpouseDetails spouse = new SpouseDetails("ABC", "Xylen", 123);
		
		EmployeeDetailsObject emp = new EmployeeDetailsObject(7, "Tushar", arr, spouse, "Pune");
		 ObjectMapper obj = new ObjectMapper();
		 obj.writeValue(new File(".\\SampleObject.json"), emp);
	}
	

}
