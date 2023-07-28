// READING THE JSON ARRAY USING JSONNODE..... FROM STRING...

package treeNodes_reading;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.graph.Traverser;
import com.google.gson.JsonArray;

public class Simple_3 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		String arrayString = "{\r\n" + 
				"\"score in subjects\":[99,84,67]\r\n" + 
				"}";
		
		System.out.println(arrayString);
		
		JsonNode jsnode = objmpr.readTree(arrayString);
		JsonNode jsnode1 = jsnode.path("score in subjects");
		System.out.println(jsnode1.isArray() );
		System.out.println(jsnode1.isValueNode());
		
		
		
		
	}

}

