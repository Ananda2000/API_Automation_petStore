package api.Endpoints;


import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import api.Payloads.StorePayload;
//import static io.restassured.RestAssured.given;
import api.Utils.PropertiesFile;

// THIS CLASS WE ARE USING TO CREATE END POINTS FOR STORE MODULE {CREATE, UPDATE,DELETE AND GET  [CRUD]}
public class StoreEndpoint_Methods 
{
	static Response resp ;
	
	
	// CALLING THE GET METHOD IN 
	public static Response Get_method(int id)
	{
		//RestAssured.baseURI=End_point_urls.Get_url;
		
		RequestSpecification respc = RestAssured.given().pathParam("orderID", id);
		resp= respc.get(End_point_urls.Get_url);
		
		//System.out.println(resp.getStatusCode());
		return resp;
		
	}
	// IMPLEMENTING THE POST METHOD...
	public static Response Post_method(StorePayload payload)
	{
		RequestSpecification respss = RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload);
		resp = respss.post(End_point_urls.post_url);
		return resp;
	}

	
	//DELETE METHOD
	public static Response Delete_method(int id)
	{
		RequestSpecification deleresp = RestAssured.given().pathParam("orderID", id);
		resp =  deleresp.delete(End_point_urls.delete_url);
		return resp;
	}
	
	// UPDATE METHOD..
}
