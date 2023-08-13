package dynamically_RequestPayload;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Adding_property_Dynamically_BasicRequest 
{
	public static void main(String[] args) throws IOException
	{
		
		ObjectMapper objmapper = new ObjectMapper();
		String str_1 ="{\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99,\r\n" + 
				"\"score in subjects\":[99,84,67]\r\n" + 
				"}\r\n" + 
				"";
		
		
		System.out.println("------------"+str_1);
		
		JsonNode json = objmapper.readTree(str_1);
		ObjectNode objectnd = objmapper.createObjectNode();
		objectnd = (ObjectNode) json;
		
		System.out.println(">>>>>   :-"+objectnd);
// ADDING THE NEW PROPERTY INTO THE JSON... DYNAMICALLY..
		objectnd.put("nickname", "007_bond");
		
		System.out.println("ADDING NEW PROPERTY TO JSON REQUEST BODY...---");
		System.out.println("<<<<<<<<  - :"+objectnd);
		json = objectnd;
		System.out.println("prinint json node ---"+json);
// UPDATING THE VALUES IN REQUEST BODY FOR KEY 'NAME'
		System.out.println("UPDATING THE VALUES IN REQUEST BODY FOR KEY NAME ");
//
		((ObjectNode)json).put("Name","gooda..");
		System.out.println(json);
		
		
// REMOVE THE PROPERTY FROM JSON NODE....-----------------
		
	System.out.println("REMOVING THE FIELD FROM JSON.....");
		((ObjectNode)json).remove("Name");
		System.out.println(json);
		
		
	}
	

}
