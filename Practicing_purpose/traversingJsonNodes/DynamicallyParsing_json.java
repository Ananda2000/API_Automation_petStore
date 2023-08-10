package traversingJsonNodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DynamicallyParsing_json 
{
	public static void main(String[] args)
	{
		ObjectMapper objmapp = new ObjectMapper();
		List<String> keys = new ArrayList<String>();
		String str1 = "{\r\n" + 
				"	\"Name\":\"guru 1\",\r\n" + 
				"	\"Village\":\"kethaganahalli 1\",\r\n" + 
				"	\"language\":\"Kannda1\"\r\n" + 
				"}";
		JsonNode jsond = null;
		//ObjectNode jsoboj =objmapp.createObjectNode();
		try {
			jsond = objmapp.readTree(str1);
			traverse(jsond);
			System.out.println(jsond.path("Name"));
			//jsoboj = (ObjectNode)jsond;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void traverse(JsonNode root)
	{
		
	    //System.out.println("----- inside traverse method...");
	    if(root.isObject()){
	        Iterator<String> fieldNames = root.fieldNames();
	        	System.out.println("Inside isobject condition----");
	        while(fieldNames.hasNext()) {
	            String fieldName = fieldNames.next();
	            JsonNode fieldValue = root.get(fieldName);
	            //System.out.println(root.get("Name"));
	            traverse(fieldValue);
	        }
	    } else if(root.isArray()){
	    	System.out.println(" --- INSIDE ISARRAY CONDITION......");
	        ArrayNode arrayNode = (ArrayNode) root;
	        for(int i = 0; i < arrayNode.size(); i++) {
	            JsonNode arrayElement = arrayNode.get(i);
	            System.out.println("----"+arrayElement);
	            traverse(arrayElement);
	        }
	    } else {
	        // JsonNode root represents a single value field - do something with it.
	    	System.out.println(root.path("Name")+"-------------");
	        System.out.println("THIS IS INSIDE ELSE CONDITION....");
	        
	        
	    }
	}

}
