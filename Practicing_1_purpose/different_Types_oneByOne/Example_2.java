package different_Types_oneByOne;

import java.io.IOException;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;

import pojo_different_Types_oneByOne.Example_2_pojo;

public class Example_2 
{
	public static void main(String[] args) throws IOException
	{
		ObjectMapper objmapp= new ObjectMapper();
		
		String ex_2="[\r\n" + 
				"	{\r\n" + 
				"		\"color\": \"red\",\r\n" + 
				"		\"value\": \"#f00\"\r\n" + 
				"	},\r\n" + 
				"	{\r\n" + 
				"		\"color\": \"green\",\r\n" + 
				"		\"value\": \"#0f0\"\r\n" + 
				"	}\r\n" + 
				"]";
	
		
		
		Example_2_pojo[] json_array_object = objmapp.readValue(ex_2, Example_2_pojo[].class);
		System.out.println(json_array_object.length);	
		
		for (int i = 0; i < json_array_object.length; i++) 
		{
			System.out.println(json_array_object[i].getColor());
			System.out.println(json_array_object[i].getValue());
			
		}
		{
			
		}
	}

}
