package api.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;

import api.Endpoints.StoreEndpoint_Methods;
import api.Payloads.StorePayload;
import api.ResponseCodes.Statuscodes;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Store_module_testCases 
{
	ObjectMapper objmap = new ObjectMapper();
	@Test(priority=1,enabled=true)
	public void get() throws IOException
	{
		int storeid = 9;
		Response respss =StoreEndpoint_Methods.Get_method(storeid);
		System.out.println(respss.getStatusCode());
		
		Assert.assertEquals(respss.getStatusCode(), Statuscodes.Response_status_codes_200, "The Status code is not matching...");
		String str = respss.getBody().asString();
		JsonNode rootnode = objmap.readTree(str);
		JsonNode jsonid = rootnode.path("id");
		System.out.println(jsonid.asInt());
		Assert.assertEquals(storeid, jsonid.asInt());
		System.out.println(str);
	/*	RestAssured.baseURI="https://petstore.swagger.io/v2/store/order/3";
		
		RequestSpecification request = RestAssured.given();
		Response resp = request.get();
	
		System.out.println(resp.getStatusCode());
		*/
		
	}
	
// THE BELOW METHOD IS USED TO POST THE DATA
	@Test(priority=1, enabled=false)
	public void get_postmethod() throws JsonParseException, JsonMappingException, IOException
	{
		File file =  new File("JosnFiles/Store_pet.json");
		FileInputStream filin = new FileInputStream(file);
	
		
		/*String strrr ="{\r\n" + 
				"  \"id\": 99,\r\n" + 
				"  \"petId\": 0,\r\n" + 
				"  \"quantity\": 0,\r\n" + 
				"  \"shipDate\": \"2023-05-15T16:55:09.343Z\",\r\n" + 
				"  \"status\": \"placed\",\r\n" + 
				"  \"complete\": true\r\n" + 
				"}";
		*/
		StorePayload payloadd = new StorePayload();
		 payloadd = objmap.readValue(filin, StorePayload.class);
		System.out.println(payloadd.getId());
		Response respns= StoreEndpoint_Methods.Post_method(payloadd);
	//System.out.println("The status code --"+respns.getStatusCode());
		String responsess =respns.asString();
		JsonNode rootnote = objmap.readTree(responsess);
		
		System.out.println("id :"+rootnote.path("id"));
		System.out.println("petId :"+rootnote.path("petId"));
		System.out.println("quantity :"+rootnote.path("quantity"));
		System.out.println("shipDate :"+rootnote.path("shipDate"));
		String status = rootnote.path("status").asText();
		Assert.assertEquals(status, "placed");
		boolean completedstatus =rootnote.path("complete").booleanValue();
		Assert.assertEquals(completedstatus, true);
		
		
	
		
	}
	
	@Test(priority=3, enabled =false)
	public void Use_Delete_method()
	{
		
		
	}
}
