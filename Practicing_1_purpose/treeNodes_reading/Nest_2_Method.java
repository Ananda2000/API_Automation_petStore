package treeNodes_reading;

import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Nest_2_Method 
{
	public static void traverse(JsonNode root){
	    
	    if(root.isObject()){
	        Iterator<String> fieldNames = root.fieldNames();

	        while(fieldNames.hasNext()) {
	            String fieldName = fieldNames.next();
	            JsonNode fieldValue = root.get(fieldName);
	           
	            System.out.println(fieldValue.asText());
	            traverse(fieldValue);
	        }
	    } else if(root.isArray())
	    {
	        ArrayNode arrayNode = (ArrayNode) root;
	        System.out.println(arrayNode.size());
	        for(int i = 0; i < arrayNode.size(); i++) {
	        	System.out.println(arrayNode.get(i));
	            JsonNode arrayElement = arrayNode.get(i);
	            //System.out.println(arrayElement.get(i));
	            traverse(arrayElement);
	        }
	    } else {
	        // JsonNode root represents a single value field - do something with it.
	        
	    }
	}

}
