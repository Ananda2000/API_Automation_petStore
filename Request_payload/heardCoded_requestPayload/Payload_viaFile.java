// Here we are keeing the request payload in a file from there we pass to request payload....
// It is similar to harding coding a string in the programm
package heardCoded_requestPayload;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Payload_viaFile 
{
	public static void main(String [] args)
	{
		RestAssured.baseURI ="https://restful-booker.herokuapp.com/booking";
		
		File fl = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Request_payload\\heardCoded_requestPayload\\payload.json");
		
		RequestSpecification reqspec = RestAssured.given().header("Content-Type","application/json").body(fl);
		Response resp = reqspec.post();
		System.out.println("STATUS CODE --"+resp.getStatusCode());
		System.out.println("STATUS LINE --"+resp.getStatusLine());
		
		
		 
	}

}
