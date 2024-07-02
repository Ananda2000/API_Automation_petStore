package dynamic_requestPayload;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MainPojo1 
{
	public static void main(String [] args)
	{
		System.out.println(" Main method working fine -------------------------=========================");
		
		ObjectMapper objmpr = new ObjectMapper();
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		
		RequestSpecification reqspec = RestAssured.given().header("Content-Type","application/json");
		
		reqspec.body(Dyna_payload.payload(ReadSystemTime.date_time()));
		Response resp = reqspec.post();
		
		
		System.out.println(resp.statusCode());
		System.out.println(resp.getBody().prettyPrint());
		
		
		
		
	}

}
