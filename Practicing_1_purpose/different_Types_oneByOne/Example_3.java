package different_Types_oneByOne;

import java.io.IOException;
import java.util.Map;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo_different_Types_oneByOne.Example_3_pojo;

public class Example_3 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		String str_3 ="{\r\n" + 
				"	\"color\": \"red\",\r\n" + 
				"	\"value\": \"#f00\"\r\n" + 
				"}";
	
		ObjectMapper objmapp_3 = new ObjectMapper();
		
		/*Map<String, String> mpa1= objmapp_3.readValue(str_3, Map.class);
		//System.out.println(mpa1.get("color"));
		System.out.println(mpa1.get("color"));
		*/
		Example_3_pojo e3_obj= objmapp_3.readValue(str_3, Example_3_pojo.class);
		System.out.println(e3_obj);
		System.out.println(e3_obj.getColor());
		System.out.println(e3_obj.getValue());
	
		// convert java object to json...
		 String json4 = objmapp_3.writerWithDefaultPrettyPrinter().writeValueAsString(e3_obj);
		 System.out.println("This is json string after converting from Java object....---");
		 System.out.println(json4);
		 
		 String str_4 ="{\r\n" + 
		 		"\"name\":\"Ananda\"\r\n" + 
		 		"}";
		 System.out.println(str_4);
		  str_3 = str_3.concat(json4);
		  System.out.println("This is after appending the values--------");
		  System.out.println(str_3);
		  
}

}
