// HERE WE ARE DOING Traverse JsonNode Graph .. ALL THE WAY...

package treeNodes_reading;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Nested_2 
{
	public static void main(String [] args) throws IOException

	{
		ObjectMapper objmper = new ObjectMapper();
		String stt = "{\r\n" + 
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
		
		JsonNode js_node = objmper.readTree(stt);
		
		Nest_2_Method.traverse(js_node);
		
	}
}
