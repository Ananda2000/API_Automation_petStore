package payload_via_PojoClass;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MainPojo1 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	{
		System.out.println("This is for testing -----------------=------------------------");
		ObjectMapper objmpr = new ObjectMapper();
		
		File fl = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Request_payload\\heardCoded_requestPayload\\payload.json");
		Pojo1 pj1 = objmpr.readValue(fl, Pojo1.class);
		System.out.println("Testing the last name --"+pj1.getFirstname());
		System.out.println("booking dates "+pj1.getBookingdates().getCheckin());
		Bookingdates bkdate = new Bookingdates();
// Here am changing the setname dynamically....		
		pj1.setFirstname("Ananda");
		bkdate.setCheckin("1998-03-03");
		bkdate.setCheckout("1998-03-03");
		pj1.setBookingdates(bkdate);
		System.out.println(pj1.getBookingdates());
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification reqspec = RestAssured.given();
		reqspec.header("Content-Type","application/json");
		Response resp = reqspec.body(pj1).post();
		
		System.out.println("STATUS CODE --"+resp.statusCode());
		System.out.println("STATUS CODE --"+resp.statusLine());
		System.out.println("response body --------------------------------------");
		System.out.println(resp.getBody().asString());
		System.out.println(pj1.getBookingdates().getCheckin());
		
		
		
	}

}
