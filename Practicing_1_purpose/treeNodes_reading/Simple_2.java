// READING THE NESTED JSON NOTES.. LIKE JOSN ARRAY ...

package treeNodes_reading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Simple_2 
{
	public static void main(String [] args) throws IOException
	{
		
		ObjectMapper objmap1 = new ObjectMapper();
		
		String str1 = "{\r\n" + 
				"\"products\": \r\n" + 
				"[\r\n" + 
				"    {\r\n" + 
				"	\"name\":\"guru\",\r\n" + 
				"	\"village\":\"kethaganahalli\",\r\n" + 
				"	\"language\":\"Kannda\"\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"	\"name\":\"guru 1\",\r\n" + 
				"	\"village\":\"kethaganahalli 1\",\r\n" + 
				"	\"language\":\"Kannda1\"\r\n" + 
				"}\r\n" + 
				"]\r\n" + 
				"}\r\n" + 
				"";
		
		JsonNode rootnode = objmap1.readTree(str1);
		
		int name =  rootnode.path("products").size();
		System.out.println("The size is ---"+name);
		//JsonNode lkslkd = ;
			JsonNode node1 = rootnode.path("products");
			
			List<String> names = new ArrayList<String>(); 
			int sizes = node1.size();
			for (JsonNode jsonNode : node1) {
				JsonNode node1_1 = jsonNode.get(0);
				
				
				JsonNode node1_1_1 = jsonNode.path("name");
				String s1 = node1_1_1.asText();
				//System.out.println(s1);
				names.add(s1);
				
			}
			
			System.out.println(names);
			System.out.println(names.contains("guru"));
			
			for (String string123 : names) 
			{
				System.out.println(string123);
			}
	}

}
