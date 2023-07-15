package readingHeaders;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Read_HeaderOnebyOne 
{
	public static void main(String[] args)
	{
	String str ="https://petstore.swagger.io/v2/store/order/2";
	
	RequestSpecification reque =RestAssured.given();
	Response respon = reque.get(str);
	
	System.out.println(respon.body().asString());
	System.out.println(respon.headers());
	
	Headers hrs = respon.headers();
	
	System.out.println("The headers size is ------------"+hrs.size());
	System.out.println("-----------------------------this is inside header for loop");
	
	
	for (Header header : hrs) 
	{
		System.out.print(header.getName()+"--");
		System.out.println(header.getValue());
		
	}
	
	
	}

}
