package Reading_responseAndDisplayData;

import org.omg.CORBA.Request;

import api.ResponseCodes.Statuscodes;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getcall_pets_api 
{
	public static void main(String[] args)
	{
		
		
		RequestSpecification reqsp = RestAssured.given();
		
		Response resp = reqsp.get("https://petstore.swagger.io/v2/pet/2");
		
		int statuscode = resp.getStatusCode();
		
		if(statuscode == 200)
		{
			System.out.println("Displaying wrong status code ----"+statuscode);
			System.out.println(resp.headers());
							
		}
		else
		{
			System.out.println("Displaying wrong status code ----"+statuscode);
			
			
			
		}
	}
	

}
