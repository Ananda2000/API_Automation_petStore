// THIS IS SIMPLE JSON ITERATION.....

package readingKeys_AndValuesAndIterating;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;

// HERE WE ARE ITERATING OVER SIMPLE JSON, CHECK THE JSON STRING IN LINE NUMBER 24...

public class Iterate_OverJsonNode 
{
	public static void main(String [] args) throws IOException
	{
		
		ObjectMapper mpper = new ObjectMapper();
		
		String str = "{\r\n" + 
				"\"Village\":\"Village12345\",\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99\r\n" + 
				"}";
		
		
		JsonNode jsnd = mpper.readTree(str);
		ObjectNode objnd = mpper.createObjectNode();
		
		Iterator<Entry<String, JsonNode>> iterjsnd = jsnd.fields();
		
		while(iterjsnd.hasNext())
		{
			Entry<String, JsonNode> mpps = iterjsnd.next();
			String key_name = mpps.getKey();
			String value_name = mpps.getValue().asText();
			System.out.println(key_name +"----"+value_name);
		}
	}

}
