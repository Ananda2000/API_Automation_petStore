package traversingJsonNodes;

import java.io.IOException;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Traversing_nestedJsonObjectArrays 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		
		String str1 ="{\r\n" + 
				"\"isbn\": \"123-456-222\",  \r\n" + 
				" \"author\": [\r\n" + 
				"    {\r\n" + 
				"      \"lastname\": \"Doe\",\r\n" + 
				"      \"firstname\": \"Jane\"\r\n" + 
				"    },\r\n" + 
				"	{\r\n" + 
				"      \"lastname\": \"Ananda\",\r\n" + 
				"      \"firstname\": \"Reddy\"\r\n" + 
				"    }\r\n" + 
				"	],\r\n" + 
				"\"editor\": \r\n" + 
				"    {\r\n" + 
				"      \"lastname\": \"Smith\",\r\n" + 
				"      \"firstname\": \"Jane\"\r\n" + 
				"    },\r\n" + 
				"  \"title\": \"The Ultimate Database Study Guide\",  \r\n" + 
				"  \"category\": [\"Non-Fiction\", \"Technology\"]\r\n" + 
				" }";
		
		JsonNode jsond = objmpr.readTree(str1);
		
	// USING THE PATH METHOD FOR READING JSON VALUES...
		boolean value = jsond.path("author").isArray();
		int sizess = jsond.path("author").size();
		System.out.println("====================== the value is ---"+value);
		if(value == true)
		{
			for(int i=0;i<sizess;i++)
		System.out.println(jsond.path("author").path(i).path("lastname"));
		}
		
		boolean value1 =jsond.path("author").path(0).isObject();
		System.out.println("---------------"+value1);
		
		
		System.out.println("----------------------------------------------");
	}

}
