// URL ---

package heardCoded_requestPayload;


import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HeardCodaAs_String 
{
	public static void main(String [] args)
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification reqspec = RestAssured.given();
		String payload ="{\r\n" + 
				"    \"firstname\" : \"anand1\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
				"    \"totalprice\" : 111,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}";
		
		Response resp= reqspec.header("Content-Type","application/json").body(payload).post();
		
		int responseCode = resp.getStatusCode();
		String str = resp.getBody().asString();
		
		System.out.println("The response code =="+responseCode);
		System.out.println("The response body is --------------------"+str);
		
		
	}
	
}
