package veryComplex_objectReading;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainPojoClass2 
{
	
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	{
		String str = "{\r\n" + 
				"\r\n" + 
				"              \"dashboard\": \r\n" + 
				"			  { \r\n" + 
				"			  \"purchaseAmount\": 1162,\r\n" + 
				"			  \"website\": \"Hello.com\" \r\n" + 
				"			  },\r\n" + 
				"\r\n" + 
				"              \"courses\": [\r\n" + 
				"\r\n" + 
				"              { \"title\": \"Selenium Python\", \"price\": 50, \"copies\": 6},\r\n" + 
				"\r\n" + 
				"              { \"title\": \"Cypress\", \"price\": 40, \"copies\": 4},\r\n" + 
				"\r\n" + 
				"              { \"title\": \"RPA\", \"price\": 45, \"copies\": 10},\r\n" + 
				"\r\n" + 
				"              { \"title\": \"Appium\", \"price\": 36, \"copies\": 7}]}\";\r\n" + 
				"\r\n" + 
				"              }\r\n" + 
				"\r\n" + 
				"   }";
		
		ObjectMapper objmpr = new ObjectMapper();
		
		PojoClass2 pj2 = objmpr.readValue(str, PojoClass2.class);
		
		System.out.println(pj2.getDashboard().getPurchaseAmount());
		
		
		System.out.println(pj2.getCourses());
		
		
	}
}
