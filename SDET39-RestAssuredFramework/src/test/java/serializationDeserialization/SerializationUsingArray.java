package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import practice_POJO_SerDse.EmployeeDetailsArray;

public class SerializationUsingArray
{
     @Test
	public void serializationusingarrayTest()  throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] arr= {345,2345};
		EmployeeDetailsArray emp = new EmployeeDetailsArray(1, "Tushar", arr, "Pune");
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File(".\\Sample.json"), emp);

	}

}
