// HERE WE ARE USING TO UPDATE THE VALUES FOR THE JSON KEYS...

package treeNodes_reading;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Simple_5 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmpp = new ObjectMapper();
		String str ="{\r\n" + 
				"	\"Name\":\"guru\",\r\n" + 
				"	\"Village\":\"kethaganahalli\",\r\n" + 
				"	\"language\":\"Kannda\"\r\n" + 
				"}";
		
		
		String str2 ="{\r\n" + 
				"\"Village\":\"Village12345\"\r\n" + 
				"}";
		JsonNode jsonone = objmpp.readTree(str);
		JsonNode jsontwo = objmpp.readTree(str2);
		System.out.println("This is before update -------");
		System.out.println(jsonone);
		ObjectNode objnode = (ObjectNode) jsonone;
		JsonNode findnode =jsontwo.get("Village");
// HERE AM UPDATING THE VALUES IN JSON NODE BY USING REPLACE METHOD....
		objnode.replace("Village", findnode);
		System.out.println("This is after update ---------------");
		System.out.println(objnode);
		
		
	}

}
