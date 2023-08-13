// HERE AM USING THE OBJECTNODE TO EDIT THT EJSON , AND MAKE IT DYNAMIC.. 

package treeNodes_reading;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Simple_4 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmppr = new ObjectMapper();
		String str ="{\r\n" + 
				"	\"Name\":\"guru\",\r\n" + 
				"	\"Village\":\"kethaganahalli\",\r\n" + 
				"	\"language\":\"Kannda\"\r\n" + 
				"}";
		
			JsonNode jnnode = objmppr.readTree(str);
				ObjectNode objnode= objmppr.createObjectNode();
				//objnode.putAll((Map<String, ? extends JsonNode>) jnnode);
				
				objnode=(ObjectNode)jnnode;
				System.out.println(objnode);
				objnode.remove("Name");
				
				System.out.println(objnode);
				objnode.put("age", 33);
				
				System.out.println(objnode);
				//objnode.replace("Village", "Village12value");	
				String str22 = objnode.toString();
				System.out.println("----"+str22);
				
				String str234 = "Village1234";
				JsonNode jsss= objmppr.readTree(str234);
				objnode.set("Village", jsss);
				
				System.out.println("====="+objnode);
				
				
						
	}

}
