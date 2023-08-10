// THIS PROGRAM ITERATE OVER THE JSON , GET THE KEY AND VLAUES AND 
// ALSO DYNAMICALLY UPDATE THE KEY AND VALUE IN SPECIFIC POSITION...

package readingKeys_AndValuesAndIterating;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.omg.Messaging.SyncScopeHelper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Simple_iterateKeyAndValues_FromJson 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmppr = new ObjectMapper();
		String strrr1 = "{\r\n" + 
				"\"Village\":\"Village12345\",\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99\r\n" + 
				"}";
	
		JsonNode jsnd = objmppr.readTree(strrr1);
		System.out.println(jsnd);
		//ObjectNode objnd = objmppr.createObjectNode();
		// objnd = (ObjectNode) jsnd;
		Iterator<Entry<String, JsonNode>> fields = jsnd.fields();
		
		while(fields.hasNext())
		{
			Entry<String, JsonNode> field = fields.next();
			String fieldname = field.getKey();
			JsonNode fieldvalue =  field.getValue();
			String fieldvalue1 = fieldvalue.asText();
			
			System.out.println(fieldname +"----"+fieldvalue1);
			/*if(fieldname == "age")
			{
				objnd.put("email", "email_1234@gmail.com");
			}
			
			objnd.put(fieldname, fieldvalue1);
			
		*/	
	}
		/*System.out.println("HEre am printing the object node After adding..--------------------------------");
		System.out.println(objnd);
		jsnd = objnd;
		*/
		System.out.println("This is printing from Jsonnode object......");
		
	
	}

}
