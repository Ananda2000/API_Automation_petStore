// HERE WE ARE PASSING SIMPLE JSON REQUEST PAYLOAD....

package dynamically_passingRequestPayload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Simple_dynamicRequest 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmapr= new ObjectMapper();
		String strrr = "{\r\n" + 
				"\"Village\":\"Village12345\",\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99\r\n" + 
				"}";
		
		JsonNode json_node = objmapr.readTree(strrr);
		
		ObjectNode objnd = objmapr.createObjectNode();
		objnd = (ObjectNode) json_node;
		int size= objnd.size();
		
		System.out.println("the object node size ----"+size);
		for(int i=0;i<size;i++)
		{
		
			System.out.println(objnd.get(""));
		}
		System.out.println(objnd);
		objnd.put("email", "email_1234@gmail.com");
		System.out.println(objnd);
		
		json_node = objnd;
		
		//System.out.println("This is jsonNode ---- "+json_node);
		strrr = new ObjectMapper().writeValueAsString(json_node);
		
		//System.out.println("This is strrr ---"+strrr);
		
		int size1 = objnd.size();
		List<String> arr = new ArrayList<String>();
		System.out.println(size1);
		arr =  (List) objnd;
		System.out.println("The value is ----"+arr);
		
	}

}
