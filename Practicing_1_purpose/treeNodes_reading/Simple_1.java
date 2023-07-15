// HERE AM READING THE SIMPLE , json object by passing through the rootnode...

package treeNodes_reading;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Simple_1 
{
	public static void main(String [] args) throws IOException
	{
// CREATING OBJECT MAPPER CLASS...
		ObjectMapper objmpr = new ObjectMapper();
		
		String str ="{\r\n" + 
				"	\"Name\":\"guru\",\r\n" + 
				"	\"Village\":\"kethaganahalli\",\r\n" + 
				"	\"language\":\"Kannda\"\r\n" + 
				"}";
		JsonNode node =objmpr.readTree(str);
		
		String name = node.path("Name").asText();
		String VillageName = node.path("Village").textValue();
		String language =node.path("language").asText();

		System.out.println("This is village name --"+name);
		System.out.println("This is village name --"+VillageName);
		System.out.println("This is language --"+language);
	}

}
