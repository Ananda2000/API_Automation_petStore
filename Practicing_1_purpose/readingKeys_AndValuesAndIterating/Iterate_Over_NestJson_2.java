package readingKeys_AndValuesAndIterating;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Iterate_Over_NestJson_2 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmppr = new ObjectMapper();
		List<String> arlist = new ArrayList<String>();
		String str2="{\r\n" + 
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
				"  \"category\": [1,2,3]\r\n" + 
				" }";
		
		
		String name ="lastname";
		JsonNode jsnd = objmppr.readTree(str2);
	List<String> lll=	traverse(jsnd, name,arlist);
		
	System.out.println("this is from main method -----"+lll);
	
		System.out.println(lll.contains("Ananda"));
	}
	
	public static List<String> traverse(JsonNode root, String name1,List<String> arlist){
		String fieldName;
		//List<String> arlist = new ArrayList<String>();
	    if(root.isObject()){
	        Iterator<String> fieldNames = root.fieldNames();

	        while(fieldNames.hasNext()) {
	             fieldName = fieldNames.next();
	            System.out.print(fieldName +"----");
	            JsonNode fieldValue = root.get(fieldName);
	            System.out.println(fieldValue.asText());
	            if(fieldName == name1)
	            {
	            	System.out.println(fieldName +"----"+name1);
	            	arlist.add(fieldValue.asText());
		            System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+arlist);
	            }
	            traverse(fieldValue, name1,arlist);
	        }
	    } else if(root.isArray()){
	        ArrayNode arrayNode = (ArrayNode) root;
	        
	        for(int i = 0; i < arrayNode.size(); i++) 
	        {
	        	System.out.println("this is inside array");
	            JsonNode arrayElement = arrayNode.get(i);
	            System.out.println(arrayElement.asText());
	            traverse(arrayElement,name1,arlist);
	        }
	    } 
	    else {
	    	
	    }
	    //System.out.println(arlist.get(0));
		return arlist;
	}
	
	
	

}
