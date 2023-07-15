package reading_JsonFromString;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.hamcrest.core.IsEqual;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Simple1 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper objmap = new ObjectMapper();
	
	/*String str ="{\r\n" + 
			"  \"id\": 0,\r\n" + 
			"  \"petId\": 0,\r\n" + 
			"  \"quantity\": 0,\r\n" + 
			"  \"shipDate\": \"2023-05-15T16:55:09.343Z\",\r\n" + 
			"  \"status\": \"placed\",\r\n" + 
			"  \"complete\": true\r\n" + 
			"}";
	*/
String str = "{\r\n" + 
			"	\"name\":\"guru\",\r\n" + 
			"	\"village\":\"kethaganahalli\",\r\n" + 
			"	\"language\":\"Kannda\"\r\n" + 
			"}";
	
	//Map<String, String> map1 = new HashMap<String, String>();
	Map<String, String> map1 = objmap.readValue(str,Map.class);
	System.out.println("================ THE MAP VALUES ARE =======================");
	System.out.println(map1);
	
	/// HERE WE ARE ITERATING THE MAP..
		// ITERATING ONLY KEYS...
	Set set1 = map1.keySet();
	System.out.println("==================KEY NAMES IN ========================");
	System.out.println(set1);
	System.out.println("=============== CHECK THE KEY PRESENT OR NOT , IF PRESENT PRINT KEY AND VALUE PAIRS ===");
	
	for (Map.Entry<String, String> mapp : map1.entrySet()) 
	{
		if(map1.containsKey("name"))
		{
			System.out.println("This is ----"+mapp.getValue());
		}
		System.out.println(mapp.getKey() +"-------------"+mapp.getValue());
		
	}
	
	
	
	}
}
