package json_IgnoreProperties_used;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dynamic_requestPayload.Dyna_payload;
import dynamic_requestPayload.ReadSystemTime;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Main_program 
{
	
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	{
		String str ="{\r\n" + 
				"    \"firstname\" : \"Jim\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
				"    \"totalprice\" : 1234,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
								"}";
		ObjectMapper objmppr = new ObjectMapper();
		objmppr.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		//objmppr.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		 RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		 RequestSpecification reqSpec = RestAssured.given().header("Content-Type","application/json");
		 reqSpec.body(str);
		 
		 Response resp = reqSpec.post();
		 System.out.println(resp.getStatusCode());
		 
		 System.out.println("The response body is -------------");
		 String str1 = resp.getBody().asString();
		 System.out.println(str1);
		 Pojoclass_jsonIgnoreProperty aa =objmppr.readValue(str, Pojoclass_jsonIgnoreProperty.class);
		 System.out.println(aa.getFirstname()+"  --first name-----------");
		 
		 //Pojoclass_jsonIgnoreProperty pojjj = objmppr.readva;
		// System.out.println(pojjj.getFirstname());
		 
		 
		 
	}

}
