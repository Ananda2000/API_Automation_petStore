// THIS PROGRAM WE SIMPLY UPDATING THE DYNAMIC JSON , BY ADDING NEW KEY AND VALUE FOR 
//A SPCIFIC LOCATION.. IN MEAN IN BETWEEN ANY PLACE..

package dynamically_passingRequestPayload;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Dynamically_updating_NODE
{

	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmppr = new ObjectMapper();
		String strrr1 = "{\r\n" + 
				"\"Village\":\"Village12345\",\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99\r\n" + 
				"}";
	
			JsonNode jsnode = objmppr.readTree(strrr1);
			ObjectNode objnode = objmppr.createObjectNode();
			Iterator<Map.Entry<String, JsonNode>> mpa1 = jsnode.fields();
			
			while(mpa1.hasNext())
			{
				Entry<String, JsonNode> mpp = mpa1.next();
				String key_name = mpp.getKey();
				String value_name = mpp.getValue().asText();
				
				if(key_name =="Name")
				{
					objnode.put("email", "email_1234@gmail.com");
				}
				objnode.put(key_name, value_name);
				System.out.println(key_name +"--------"+value_name);
			}
		System.out.println("This is printing after updating json structure------");
			System.out.println(objnode);
		
	}
	
}
