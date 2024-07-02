package simpleObject_reading;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Nest_Objects 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper objmppr = new ObjectMapper();
	
	String str ="{\r\n" + 
			"  \"companyName\": \"QAAutomation\",\r\n" + 
			"  \"companyEmailId\": \"qaautomation@org.com\",\r\n" + 
			"  \"companyNumber\": \"+353891234121\",\r\n" + 
			"  \"companyPFDeails\": {\r\n" + 
			"    \"pfName\": \"XYZ\",\r\n" + 
			"    \"pfYear\": 2020\r\n" + 
			"	}\r\n" + 
			"}";
	
	Nested_objects_pojo nspojo_obj = objmppr.readValue(str, Nested_objects_pojo.class);
	System.out.println(nspojo_obj.getCompanyPFDeails().pfYear);
	
	
	
	

}
}