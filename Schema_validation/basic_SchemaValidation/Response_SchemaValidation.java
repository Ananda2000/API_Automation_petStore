package basic_SchemaValidation;

import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.mozilla.javascript.GeneratedClassLoader;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Response_SchemaValidation 
{
	public static void main(String [] args) throws FileNotFoundException
	{
		System.out.println("This is testing...");
		
		String str ="{\r\n" + 
				"    \"firstname\": \"Sally\",\r\n" + 
				"    \"lastname\": \"Brown\",\r\n" + 
				"    \"totalprice\": 111,\r\n" + 
				"    \"depositpaid\": true,\r\n" + 
				"    \"bookingdates\": {\r\n" + 
				"        \"checkin\": \"2013-02-23\",\r\n" + 
				"        \"checkout\": \"2014-10-23\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\": \"Breakfast\"\r\n" + 
				"}";
		String str1="{\r\n" + 
				"	\"definitions\": {},\r\n" + 
				"	\"$schema\": \"http://json-schema.org/draft-07/schema#\", \r\n" + 
				"	\"$id\": \"https://example.com/object1711942636.json\", \r\n" + 
				"	\"title\": \"Root\", \r\n" + 
				"	\"type\": \"object\",\r\n" + 
				"	\"required\": [\r\n" + 
				"		\"bookingid\",\r\n" + 
				"		\"booking\"\r\n" + 
				"	],\r\n" + 
				"	\"properties\": {\r\n" + 
				"		\"bookingid\": {\r\n" + 
				"			\"$id\": \"#root/bookingid\", \r\n" + 
				"			\"title\": \"Bookingid\", \r\n" + 
				"			\"type\": \"integer\",\r\n" + 
				"			\"examples\": [\r\n" + 
				"				1\r\n" + 
				"			],\r\n" + 
				"			\"default\": 0\r\n" + 
				"		},\r\n" + 
				"		\"booking\": {\r\n" + 
				"			\"$id\": \"#root/booking\", \r\n" + 
				"			\"title\": \"Booking\", \r\n" + 
				"			\"type\": \"object\",\r\n" + 
				"			\"required\": [\r\n" + 
				"				\"firstname\",\r\n" + 
				"				\"lastname\",\r\n" + 
				"				\"totalprice\",\r\n" + 
				"				\"depositpaid\",\r\n" + 
				"				\"bookingdates\",\r\n" + 
				"				\"additionalneeds\"\r\n" + 
				"			],\r\n" + 
				"			\"properties\": {\r\n" + 
				"				\"firstname\": {\r\n" + 
				"					\"$id\": \"#root/booking/firstname\", \r\n" + 
				"					\"title\": \"Firstname\", \r\n" + 
				"					\"type\": \"string\",\r\n" + 
				"					\"default\": \"\",\r\n" + 
				"					\"examples\": [\r\n" + 
				"						\"Jim\"\r\n" + 
				"					],\r\n" + 
				"					\"pattern\": \"^.*$\"\r\n" + 
				"				},\r\n" + 
				"				\"lastname\": {\r\n" + 
				"					\"$id\": \"#root/booking/lastname\", \r\n" + 
				"					\"title\": \"Lastname\", \r\n" + 
				"					\"type\": \"string\",\r\n" + 
				"					\"default\": \"\",\r\n" + 
				"					\"examples\": [\r\n" + 
				"						\"Brown\"\r\n" + 
				"					],\r\n" + 
				"					\"pattern\": \"^.*$\"\r\n" + 
				"				},\r\n" + 
				"				\"totalprice\": {\r\n" + 
				"					\"$id\": \"#root/booking/totalprice\", \r\n" + 
				"					\"title\": \"Totalprice\", \r\n" + 
				"					\"type\": \"integer\",\r\n" + 
				"					\"examples\": [\r\n" + 
				"						111\r\n" + 
				"					],\r\n" + 
				"					\"default\": 0\r\n" + 
				"				},\r\n" + 
				"				\"depositpaid\": {\r\n" + 
				"					\"$id\": \"#root/booking/depositpaid\", \r\n" + 
				"					\"title\": \"Depositpaid\", \r\n" + 
				"					\"type\": \"boolean\",\r\n" + 
				"					\"examples\": [\r\n" + 
				"						true\r\n" + 
				"					],\r\n" + 
				"					\"default\": true\r\n" + 
				"				},\r\n" + 
				"				\"bookingdates\": {\r\n" + 
				"					\"$id\": \"#root/booking/bookingdates\", \r\n" + 
				"					\"title\": \"Bookingdates\", \r\n" + 
				"					\"type\": \"object\",\r\n" + 
				"					\"required\": [\r\n" + 
				"						\"checkin\",\r\n" + 
				"						\"checkout\"\r\n" + 
				"					],\r\n" + 
				"					\"properties\": {\r\n" + 
				"						\"checkin\": {\r\n" + 
				"							\"$id\": \"#root/booking/bookingdates/checkin\", \r\n" + 
				"							\"title\": \"Checkin\", \r\n" + 
				"							\"type\": \"string\",\r\n" + 
				"							\"default\": \"\",\r\n" + 
				"							\"examples\": [\r\n" + 
				"								\"2018-01-01\"\r\n" + 
				"							],\r\n" + 
				"							\"pattern\": \"^.*$\"\r\n" + 
				"						},\r\n" + 
				"						\"checkout\": {\r\n" + 
				"							\"$id\": \"#root/booking/bookingdates/checkout\", \r\n" + 
				"							\"title\": \"Checkout\", \r\n" + 
				"							\"type\": \"string\",\r\n" + 
				"							\"default\": \"\",\r\n" + 
				"							\"examples\": [\r\n" + 
				"								\"2019-01-01\"\r\n" + 
				"							],\r\n" + 
				"							\"pattern\": \"^.*$\"\r\n" + 
				"						}\r\n" + 
				"					}\r\n" + 
				"				}\r\n" + 
				",\r\n" + 
				"				\"additionalneeds\": {\r\n" + 
				"					\"$id\": \"#root/booking/additionalneeds\", \r\n" + 
				"					\"title\": \"Additionalneeds\", \r\n" + 
				"					\"type\": \"string\",\r\n" + 
				"					\"default\": \"\",\r\n" + 
				"					\"examples\": [\r\n" + 
				"						\"Breakfast\"\r\n" + 
				"					],\r\n" + 
				"					\"pattern\": \"^.*$\"\r\n" + 
				"				}\r\n" + 
				"			}\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"	}\r\n" + 
				"}\r\n" + 
				"";
		
		//InputStream insp = new FileInputStream("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Schema_validation_jsonFiles\\Response_SchemaValidation.json");
		//File fl1= new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Schema_validation_jsonFiles\\Response_SchemaValidation.json");
		RequestSpecification reqstBody = 
				RestAssured.given().body(str).header("Content-Type","application/json");
			Response resp = reqstBody.post("https://restful-booker.herokuapp.com/booking");
			//resp.js 
			
			System.out.println(resp.statusCode());
			String str2 = resp.body().asString();
			System.out.println("str2 ---"+str2);
			//System.out.println("str1---"+str1);
			boolean value = str1 == str2;
			System.out.println("---------------"+value);
			//Assert.assertEquals(resp.getBody().asString(), matchesJsonSchemaInClasspath(str1));
			System.out.println("This is validator ---"+matchesJsonSchemaInClasspath(str2));
			//Assert.assertEquals(str2, JsonSchemaValidator.matchesJsonSchema(str1));
			Assert.assertEquals(str2, matchesJsonSchemaInClasspath(str1));
			System.out.println("final program end----------");
			
			
			
			//Assert.assertEquals(resp.getBody().asString(), matchesJsonSchemaInClasspath("Response_SchemaValidation.json"));
			
			//Assert.assertEquals("====="+resp.getBody(), matchesJsonSchemaInClasspath("/API_Automation_petStore/Schema_validation_jsonFiles/Response_SchemaValidation.json\r\n" ));
				//Assert.assertEquals(resp.getBody().asString(), matchesJsonSchemaInClasspath("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Schema_validation_jsonFiles\\Response_SchemaValidation.json"));
				
				
			
			
		
	}

}
