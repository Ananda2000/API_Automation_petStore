package readingKeys_AndValuesAndIterating;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Iterate_Over_Nested_1_Json 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmappr = new ObjectMapper();
		
		String str ="{\r\n" + 
				"\"isbn\": \"123-456-222\",  \r\n" + 
				" \"author\": [\r\n" + 
				"    {\r\n" + 
				"      \"lastname\": \"Doe\",\r\n" + 
				"      \"firstname\": \"Jane\"\r\n" + 
				"    },\r\n" + 
				"	{\r\n" + 
				"      \"lastname\": \"Ananda\",\r\n" + 
				"      \"firstname\": \"Reddy\"\r\n" + 
				"    }\r\n" + 
				"	]\r\n" + 
				"}";
		
		JsonNode jsnd = objmappr.readTree(str);
		
		System.out.println("These are iterators..---"+jsnd);
		Iterator<Entry<String, JsonNode>> itr = jsnd.fields();
		
		while(itr.hasNext())
		{
			Entry<String, JsonNode> aa = itr.next();
			System.out.println(aa.getKey() +"----"+aa.getValue());
						
			if(aa.getValue().isArray())
			{
				
				
				System.out.println("Inside Json array...");
				System.out.println(aa.getValue().size());
				int sizess = aa.getValue().size();
				//System.out.println(aa.getKey()+"----- "+aa.getValue().get(0));
				//System.out.println(aa.getKey()+"----- "+aa.getValue().get(1));
				for(int i=0;i<sizess;i++)
				{
				JsonNode jsnod11 = aa.getValue().get(i);
				System.out.println("1st index --- "+jsnod11);
				Iterator<Entry<String, JsonNode>> itr1 = jsnod11.fields();
				while(itr1.hasNext())
				{
				Entry<String, JsonNode> ggg = itr1.next();
				System.out.println(ggg.getKey() +"---------"+ggg.getValue());
				
				}
				}
				/*jsnod11 =aa.getValue().get(1);
				
				System.out.println("2nd Index ---  "+jsnod11);
*/
				}
		}
		
	}

}
