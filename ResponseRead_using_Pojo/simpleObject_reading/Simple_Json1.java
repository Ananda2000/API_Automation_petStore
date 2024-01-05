package simpleObject_reading;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Simple_Json1 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	
	{
		ObjectMapper objmpr = new ObjectMapper();
		Simple_Json1_pojo  pojo_object = new Simple_Json1_pojo();
		
		String str ="{\r\n" + 
				"\"village\":\"Village12345\",\r\n" + 
				"\"name\":\"ananda K R\",\r\n" + 
				"\"age\":99\r\n" + 
				"}";
		
		Simple_Json1_pojo list = objmpr.readValue(str, Simple_Json1_pojo.class);
		
		System.out.println(list.toString());
		
		
		
	}
}
