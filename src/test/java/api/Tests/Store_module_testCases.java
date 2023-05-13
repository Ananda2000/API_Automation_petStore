package api.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.Endpoints.StoreEndpoint_Methods;
import api.ResponseCodes.Statuscodes;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Store_module_testCases 
{
	ObjectMapper objmap = new ObjectMapper();
	@Test(priority=1)
	public void get() throws IOException
	{
		
		Response respss =StoreEndpoint_Methods.Get_method(7);
		System.out.println(respss.getStatusCode());
		
		Assert.assertEquals(respss.getStatusCode(), Statuscodes.Response_status_codes_200, "The Status code is not matching...");
	
			String str = respss.getBody().asString();
			
			JsonNode rootnode = objmap.readTree(str);
			JsonNode jsonid = rootnode.path("id");
			System.out.println(jsonid.asInt());
			Assert.assertEquals(7, jsonid.asInt());
			
			
			System.out.println(str);
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
