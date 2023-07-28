// IN THIS CLASS WE ARE DELETING A NODE / PROPERTY IN JSON..

package treeNodes_reading;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Simple_6 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper ojbmpp_delete = new ObjectMapper();
		String str ="{\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99,\r\n" + 
				"\"score in subjects\":[99,84,67]\r\n" + 
				"}";
		
		JsonNode json = ojbmpp_delete.readTree(str);
		System.out.println("This is 1st json string---------------------------------");
		System.out.println(json);
		ObjectNode jobject = (ObjectNode)json;
		
// WE USED REMOVE METHOD , TO REMOVE A PROPERTY.. || KEY VALUE PAIR..
		jobject.remove("score in subjects");
		json = jobject;
		System.out.println("THIS IS AFTER REMOVING THE FIELD -------------------");
		System.out.println(json);
	}

}
