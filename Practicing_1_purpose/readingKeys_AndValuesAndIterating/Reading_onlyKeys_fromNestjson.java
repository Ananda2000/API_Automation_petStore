package readingKeys_AndValuesAndIterating;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Reading_onlyKeys_fromNestjson 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmappr = new ObjectMapper();
		List<String> Key_namesList = new ArrayList<String>();
		JsonNode jsnd ;
		
		String nesJson_String ="{\r\n" + 
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
				"	],\r\n" + 
				"\"editor\": \r\n" + 
				"    {\r\n" + 
				"      \"lastname\": \"Smith\",\r\n" + 
				"      \"firstname\": \"Jane\"\r\n" + 
				"    },\r\n" + 
				"  \"title\": \"The Ultimate Database Study Guide\",  \r\n" + 
				"  \"category\": [1,2,3]\r\n" + 
				" }";
		jsnd = objmappr.readTree(nesJson_String);
		Iterator<String> str11 = jsnd.fieldNames();
		
		while(str11.hasNext())
		{
			
			String aaaa = str11.next();
			
			Key_namesList.add(aaaa);
		}
		
		System.out.println(Key_namesList);
		
	}

}
