package api.Endpoints;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import static io.restassured.RestAssured.given;

// THIS CLASS WE ARE USING TO CREATE END POINTS FOR STORE MODULE {CREATE, UPDATE,DELETE AND GET  [CRUD]}
public class StoreEndpoint_Methods 
{
	static Response resp ;
	public static Response Get_method(int id)
	{
		//RestAssured.baseURI=End_point_urls.Get_url;
		
		RequestSpecification respc = RestAssured.given().pathParam("orderID", id);
		resp= respc.get(End_point_urls.Get_url);
		
		System.out.println(resp.getStatusCode());
		return resp;
		
	}

}
