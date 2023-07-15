//If the JSON data describes an array, and each element of that array is of a basic type (number, string, boolean, or null):

// josn data  --- [ 100, 500, 300, 200, 400 ]
package different_Types_oneByOne;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example1 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmp = new ObjectMapper();
		String aa ="[ 100, 500, 300, 200, 400 ]";
		
		System.out.println(aa.length());
		
			JsonNode jsonarray = objmp.readTree(aa);
		
			for (JsonNode jsonNode : jsonarray) 
			{
				int aaa= jsonNode.asInt();
				if(aaa ==100)
				System.out.println(jsonNode);
				
				
			}
	}

}
