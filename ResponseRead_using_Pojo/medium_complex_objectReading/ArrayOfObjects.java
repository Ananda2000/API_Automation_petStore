package medium_complex_objectReading;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ArrayOfObjects 
{
	public static void main(String [] args)
	{
		ObjectMapper objmpr = new ObjectMapper();
		String str ="{\r\n" + 
				"  \"companyName\": \"QAAutomation\",\r\n" + 
				"  \"companyEmailId\": \"qaautomation@org.com\",\r\n" + 
				"  \"companyNumber\": \"+353891234121\", \r\n" + 
				"  \"companyAddress\": \"12, HeneryStreet, Dublin, D12PW20\", \r\n" + 
				"  \"supportedSalaryBanks\": [\r\n" + 
				"    \"AIB\",\r\n" + 
				"    \"BOI\",\r\n" + 
				"    \"PSB\"\r\n" + 
				"  ],\r\n" + 
				"  \"employee\": [\r\n" + 
				"    { \r\n" + 
				"      \"firstName\" : \"Vibha\",\r\n" + 
				"      \"lastName\" : \"Singh\",\r\n" + 
				"      \"age\" : 30,\r\n" + 
				"      \"salary\" : 75000.0,\r\n" + 
				"      \"designation\" : \"Manager\",\r\n" + 
				"      \"contactNumber\" : \"+919999988822\",\r\n" + 
				"      \"emailId\" : \"abc@test.com\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstName\" : \"Neha\",\r\n" + 
				"      \"lastName\" : \"Verma\",\r\n" + 
				"      \"age\" : 25,\r\n" + 
				"      \"salary\" : 60000.0,\r\n" + 
				"      \"designation\" : \"Lead\",\r\n" + 
				"      \"contactNumber\" : \"+914442266221\",\r\n" + 
				"      \"emailId\" : \"xyz@test.com\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstName\" : \"Rajesh\",\r\n" + 
				"      \"lastName\" : \"Gupta\",\r\n" + 
				"      \"age\" : 20,\r\n" + 
				"      \"salary\" : 40000.0,\r\n" + 
				"      \"designation\" : \"Intern\",\r\n" + 
				"      \"contactNumber\" : \"+919933384422\",\r\n" + 
				"      \"emailId\" : \"pqr@test.com\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"contractors\": [\r\n" + 
				"    {\r\n" + 
				"      \"firstName\": \"John\",\r\n" + 
				"      \"lastName\": \"Mathew\",\r\n" + 
				"      \"contractFrom\": \"Jan-2018\",\r\n" + 
				"      \"contractTo\": \"Aug-2022\",\r\n" + 
				"      \"contactNumber\" : \"+919631384422\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstName\": \"Seema\",\r\n" + 
				"      \"lastName\": \"Prasad\",\r\n" + 
				"      \"contractFrom\": \"Jun-2019\",\r\n" + 
				"      \"contractTo\": \"Jun-2023\"\r\n" + 
				"      \"contactNumber\" : \"+919688881422\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"companyPFDeails\": {\r\n" + 
				"    \"pfName\": \"XYZ\",\r\n" + 
				"    \"pfYear\": 2020,\r\n" + 
				"    \"noOfEmployees\": 100\r\n" + 
				"  }\r\n" + 
				"}";
	
		
		
	
	
	}

}
