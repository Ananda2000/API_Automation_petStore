package basic_SchemaValidation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Response_Schemavalidation1 
{
	@Test
	public void jsonSchemaTest() {
	    String payload = "{\n" +
	                "    \"firstname\" : \"Jim\",\n" +
	                "    \"lastname\" : \"Brown\",\n" +
	                "    \"totalprice\" : 111,\n" +
	                "    \"depositpaid\" : true,\n" +
	                "    \"bookingdates\" : {\n" +
	                "        \"checkin\" : \"2018-01-01\",\n" +
	                "        \"checkout\" : \"2019-01-01\"\n" +
	                "    },\n" +
	                "    \"additionalneeds\" : \"Breakfast\"\n" +
	                "}";

	                RestAssured.given().
	                contentType(ContentType.JSON).
	                body(payload).
	                when().
	                post("https://restful-booker.herokuapp.com/booking").
	                then().
	                log().
	                body().
	                assertThat().
	                statusCode(200).
	                body(JsonSchemaValidator.matchesJsonSchemaInClasspath("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Schema_validation\\basic_SchemaValidation\\Response_SchemaValidation.json"));
	    }

}
