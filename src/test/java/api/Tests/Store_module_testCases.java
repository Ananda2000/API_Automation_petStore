package api.Tests;

import org.testng.annotations.Test;

import api.Endpoints.StoreEndpoint_Methods;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Store_module_testCases 
{
	@Test(priority=1)
	public void get()
	{
		
		Response respss =StoreEndpoint_Methods.Get_method(3);
		System.out.println(respss.getStatusCode());
		System.out.println(respss.getBody().asString());
		System.out.println(respss.getHeaders());
	
	/*	RestAssured.baseURI="https://petstore.swagger.io/v2/store/order/3";
		
		RequestSpecification request = RestAssured.given();
		Response resp = request.get();
	
		System.out.println(resp.getStatusCode());
		*/
		
	}

	
	/*public static void main(String [] args)
	{
		System.out.println("This is for testing");
	}*/
}
