// *** here we are paring the complex json string and displaying data via map..

package different_Types_oneByOne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example_4 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objma = new ObjectMapper();
		
		String str = "{\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99,\r\n" + 
				"\"score in subjects\":[99,84,67]\r\n" + 
				"}";
		
		Map<String, Object> map123 = objma.readValue(str, Map.class);
		
		System.out.println(map123);
		
		System.out.println("The json size --"+map123.size());
		for (String string : map123.keySet()) {
			System.out.println(string);
			if(string == "age")
			{
				map123.put("4", "kkk");
				break;
			}
		}
		System.out.println(map123);
		
		for (Object string : map123.values()) {
			Object aaa =string;
			if(aaa instanceof String)
			{
				System.out.println("THIS IS INSTACNE OF OBJECT..");
				System.out.println(string);
			}
			if(aaa instanceof ArrayList)
			{
				System.out.println("THIS IS ARRAY INSTACNE ---------");
				System.out.println(((ArrayList) aaa).size());
				ArrayList<Integer> arlist = (ArrayList<Integer>) aaa;
				for (Integer integer : arlist) 
				{
					System.out.println(integer);
					
				}
			}
			if(aaa instanceof Integer)
			{
				System.out.println("THIS IS INTEGER VALUES ---");
				System.out.println(aaa);
			}
				
		}
		/*for (Map.Entry<Integer, Object> entry : map123.entrySet()) 
		{
			//System.out.println(entry.getKey() +"--"+entry.getValue());
			if(entry.getKey() instanceof Object)
			{
				System.out.println("This is instance of object ---");
				System.out.println(entry.getKey() +"--"+entry.getValue());
			}
			
		}*/
		
	}

}
