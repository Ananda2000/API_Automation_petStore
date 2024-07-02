// Here we are automatic simple Get call using rest assured..
// using "https://restful-booker.herokuapp.com/booking" to get all booking ids...

package get_Call;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SimpleGetcall 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		RequestSpecification req_spec = RestAssured.given();
		Response resp = req_spec.get("/booking");
		
		int status_code =resp.getStatusCode();
		int stcode =200;
		System.out.println("This is status code ---"+status_code);
// Here displaying response time...
		System.out.println("REsponse time --"+ resp.getTime());
		//Here we are asserting status code...
		Assert.assertEquals(stcode, status_code);
		if(status_code == stcode)
		{
			System.out.println("valid response---"+status_code);
		}
		else
		{
			System.out.println("Invalid response ---"+status_code);
		}
		
		
		/// Here are displaying response body ...
		System.out.println("  ");
		System.out.println("=================== HERE VALIDATING RESPONSE BODY..======================== ");
		String str1 = resp.getBody().asString();
		System.out.println();
		
		JsonNode jsnd = objmpr.readTree(str1);
		System.out.println(jsnd);
		System.out.println("=========== The Json size is ==============================");
		int sizess = jsnd.size();
		System.out.println("size ---"+sizess);
		System.out.println(jsnd.path(0));
		System.out.println(jsnd.path(0).path("bookingid").asInt());
		
		List<Integer> l1= new ArrayList<Integer>();
		// Here validate a booking id, if present...
		for(int i=0;i<sizess;i++)
		{
			l1.add(jsnd.path(i).path("bookingid").asInt());
		}
		System.out.println(l1.contains(33));
		
		// Here we have to read the headers...
		Headers hr = resp.headers();
		
		for (Header header : hr) 
		{
		System.out.print(header.getName() +"---");
			System.out.println(header.getValue());
			
		}
		
		
	}

}
