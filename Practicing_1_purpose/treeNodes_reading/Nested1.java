// HERE WE ARE READING THE NESTED/COMPLEX JSON EACH NODE AND GETTING THE VALUES...
// TRAVERSING THE NODES IN NESTED OR COMPLEX JSON

package treeNodes_reading;

import java.io.IOException;
import java.util.Iterator;

import org.hamcrest.collection.IsArray;
import org.omg.PortableInterceptor.ObjectReferenceTemplateHolder;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Nested1 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmppr = new ObjectMapper();
			
		String str1 ="{\r\n" + 
				"	\"Name\":\"guru\",\r\n" + 
				"	\"Village\":\"kethaganahalli\",\r\n" + 
				"	\"language\":\"Kannda\"\r\n" + 
				"}";
	
			
			JsonNode js_node = objmppr.readTree(str1);
			
			
			Iterator<String> fieldnames = js_node.fieldNames();
			
			while(fieldnames.hasNext())
			{
				if(fieldnames instanceof IsArray)
				{
					System.out.println(fieldnames.next());
				}
				
			}
		
	}

}
