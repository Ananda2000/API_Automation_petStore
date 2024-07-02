package dynamic_PayloadUsingPojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import payload_via_PojoClass.Bookingdates;

public class Mainclass_dynamicPojo 
{
	public static void main(String []args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		File fil = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Request_payload\\heardCoded_requestPayload\\payload.json");
		
		PojoClass1 pj1 = objmpr.readValue(fil, PojoClass1.class);
		System.out.println(pj1.getBookingdates().getCheckin());
		System.out.println("This is before update ---"+pj1.getAdditionalneeds());
		pj1.setAdditionalneeds("Brunch");
	
		//pj1.setBookingdates(Bookingdates);
		System.out.println("After updating ---"+pj1.getAdditionalneeds());
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification resp = RestAssured.given();
		resp.header("Content-Type","application/json").body(pj1);
		Response respss = resp.post();
		System.out.println("responscode ---"+respss.getStatusCode());
		
		
		
	}

}
