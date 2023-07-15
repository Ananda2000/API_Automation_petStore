package different_Types_oneByOne;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;

import pojo_different_Types_oneByOne.Example_3_1_pojo;

public class Example_3_1 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj_3_1 = new ObjectMapper();
		String str ="{\r\n" + 
				"\"isbn\": \"123-456-222\",  \r\n" + 
				" \"author\": [\r\n" + 
				"    {\r\n" + 
				"      \"lastname1\": \"Doe\",\r\n" + 
				"      \"firstname1\": \"Jane\"\r\n" + 
				"    },\r\n" + 
				"	{\r\n" + 
				"      \"lastname1\": \"Ananda\",\r\n" + 
				"      \"firstname1\": \"Reddy\"\r\n" + 
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
		
		JsonNode json = obj_3_1.readTree(str);
		
		Example_3_1_pojo readnestedJson = obj_3_1.readValue(str, Example_3_1_pojo.class);
		System.out.println("isbn ---"+readnestedJson.getIsbn());
		System.out.println(readnestedJson.getAuthor() instanceof ArrayList);
		System.out.println(readnestedJson.getAuthor().get(1) instanceof Object);
		System.out.println(readnestedJson.getCategory() instanceof ArrayList);
		
	}
	
}
