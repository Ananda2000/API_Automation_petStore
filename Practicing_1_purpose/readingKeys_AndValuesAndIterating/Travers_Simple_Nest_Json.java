package readingKeys_AndValuesAndIterating;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Travers_Simple_Nest_Json
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		String str_2 ="\r\n" + 
				"{\r\n" + 
				"  \"identification\" :  {\r\n" + 
				"        \"name\" : \"James\",\r\n" + 
				"        \"ssn\": \"ABC123552\"\r\n" + 
				"    }\r\n" + 
				"}";
		
		JsonNode jsnode = objmpr.readTree(str_2);
		
		
		traverse(jsnode);
		
		
		
	}
	public static void traverse(JsonNode root)
	{
	    
	    if(root.isObject()){
	        Iterator<String> fieldNames = root.fieldNames();

	        while(fieldNames.hasNext()) {
	            String fieldName = fieldNames.next();
	            JsonNode fieldValue = root.get(fieldName);
	            System.out.print(fieldName+"--:");
	            traverse(fieldValue);
	        }
	    } else if(root.isArray()){
	        ArrayNode arrayNode = (ArrayNode) root;
	        for(int i = 0; i < arrayNode.size(); i++) {
	            JsonNode arrayElement = arrayNode.get(i);
	            traverse(arrayElement);
	        }
	    } else {
	        // JsonNode root represents a single value field - do something with it.
	    	//System.out.println(root.fields());
	    	System.out.println(root.asText());
	    	
	    	
	  
	}
	
	
	}
}
