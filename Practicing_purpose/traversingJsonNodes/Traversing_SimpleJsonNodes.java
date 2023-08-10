// traversing simple json data....

package traversingJsonNodes;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Traversing_SimpleJsonNodes 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		
		String str = 	"{\r\n" + 
				"  \"identification\" :  {\r\n" + 
				"        \"name\" : \"James\",\r\n" + 
				"        \"ssn\": \"ABC123552\"\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"";
		
		String at_path ="/identification/name";
		JsonNode json = objmpr.readTree(str);
// HERE WE ARE USING SIMPLE PATH METHOD TO READ THE VALUES FROM JSON VALUES///
		System.out.println("Here we are using path() method to read the value .............");
		System.out.println(json.path("identification").path("name"));
		System.out.println("---------------------------------------------------------------");
		
// DIRECTLY READ THE ANY VALUE SUSING  "AT() METHOD".......................
		System.out.println("--- here we are using AT() method to read the values -------");
		System.out.println(json.at("/identification/name"));
		System.out.println(json.at(at_path));
		System.out.println("---------------------------------------------------------------");
		
	}

}
