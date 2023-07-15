package json_TreeModel;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Simple_jsonString 
{
	public static void main(String [] args)
	{
		ObjectMapper objmpp = new ObjectMapper();
		
		String str = "{\r\n" + 
				"	\"name\":\"guru\",\r\n" + 
				"	\"village\":\"kethaganahalli\",\r\n" + 
				"	\"language\":\"Kannda\"\r\n" + 
				"}";
		
		String str1 = "{\r\n" + 
				"	'name': 'Nanda',\r\n" + 
				"	'village':'s.v.pur',\r\n" + 
				"	'language':'telugu'\r\n" + 
				"}";
		
		
		try {
			JsonNode rootnode = objmpp.readTree(str1);
			JsonNode nameid =rootnode.path("name");
			System.out.println(nameid.textValue());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
