package dynamically_passingRequestPayload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.omg.CORBA.OBJECT_NOT_EXIST;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Dynamically_UpdatingNestedJson_insideJsonArray 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmppr = new ObjectMapper();
		String age = null;
		int aa = 0;
		JsonNode jsnode;
		ObjectNode objnd;
		String str1 ="{\r\n" + 
				"\"isbn\": \"123-456-222\",  \r\n" + 
				" \"author\": [\r\n" + 
				"    {\r\n" + 
				"      \"lastname\": \"Doe\",\r\n" + 
				"      \"firstname\": \"Jane\"\r\n" + 
				"    }\r\n" + 
				"	]\r\n" + 
				"}";
		
		System.out.println("--------------PRINTING THE JSON STRING..-----------------------------------");
		jsnode = objmppr.readTree(str1);
		System.out.println(jsnode);
		
		objnd = (ObjectNode) jsnode;
		/*System.out.println("");
		System.out.println("");
		System.out.println("--------------PRINTING AFTER UPDATING NEW PROPERTY. -----------------------------------");
		
		objnd.put("kumar", 5);
		System.out.println(objnd);
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------PRINTING AFTER  UPDATING VALUE TO 'KUMAR' KEY....-----------------------------------");
		
		objnd.put("kumar", "gggg");
		System.out.println(objnd);
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------PRINTING AFTER UPDATING NEW PROPERTY. -----------------------------------");
		
		objnd.put("kumar1", "gggg11");
		System.out.println(objnd);
		*/
		
		System.out.println("");
		System.out.println("");
		System.out.println(">>>> WE ARE GOING ITERATE AND INSERTING THE VALUE.. -----------------------------------");
		
		
		traverse(jsnode,age,aa,objnd);
		
	}
		
		//@SuppressWarnings("deprecation")
		public static void traverse(JsonNode root,String age, int aa,ObjectNode objnd)
		{
		   ObjectMapper jsobjnd1 = new ObjectMapper();
		    //ObjectNode objnd = jsobjnd1.createObjectNode();
		    ObjectNode objnd1 = jsobjnd1.createObjectNode();
		    objnd1.put("firstname", "aaaa");
		    objnd1.put("lastname", "jjjj");
		    String fieldName = null ;
		    ArrayNode arrayNode = null ;
		    if(root.isObject()){
		        Iterator<String> fieldNames = root.fieldNames();

		        while(fieldNames.hasNext()) {
		            fieldName = fieldNames.next();
		            JsonNode fieldValue = root.get(fieldName);
		            System.out.print(fieldName+"--:");
		            String aaa =fieldValue.asText();
		           objnd.put(fieldName, aaa);
		            System.out.println(aaa);
		            traverse(fieldValue,age,aa,objnd);
		        }
		    } else if(root.isArray()){
		    	arrayNode = (ArrayNode) root;
		        //lis.add((ArrayNode)objnd1);
		        arrayNode.add(objnd1);
		    	
		       
		        for(int i = 0; i < arrayNode.size(); i++) 
		        {
		            JsonNode arrayElement = arrayNode.get(i);
		            System.out.println(arrayElement);
		            // traverse(arrayElement,age,aa,objnd);
		        }
		          objnd.set(fieldName, arrayNode);
		    } else {
		       
		    	//System.out.println(root.asText());
		}
			System.out.println("=======================This is objnd ============================");
		    System.out.println(objnd);
		   
		    
		
	}
	
	
}
