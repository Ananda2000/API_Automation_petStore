// READING THE NESTED JSON NOTES.. LIKE JOSN ARRAY ...

package treeNodes_reading;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Simple_2 
{
	public static void main(String [] args) throws IOException
	{
		
		ObjectMapper objmap1 = new ObjectMapper();
		
		String str1 = "{\r\n" + 
				"\"products\": \r\n" + 
				"[\r\n" + 
				"    {\r\n" + 
				"	\"name\":\"guru\",\r\n" + 
				"	\"village\":\"kethaganahalli\",\r\n" + 
				"	\"language\":\"Kannda\"\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"	\"name\":\"guru 1\",\r\n" + 
				"	\"village\":\"kethaganahalli 1\",\r\n" + 
				"	\"language\":\"Kannda1\"\r\n" + 
				"}\r\n" + 
				"]\r\n" + 
				"}\r\n" + 
				"";
		
		JsonNode rootnode = objmap1.readTree(str1);
		
		int name =  rootnode.path("products").size();
		System.out.println("The size is ---"+name);
		
	}

}
