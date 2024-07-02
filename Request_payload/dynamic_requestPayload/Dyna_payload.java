package dynamic_requestPayload;

public class Dyna_payload 
{
	public static String payload(long l)
	{
		String str = "{\r\n" + 
				"    \"firstname\" : \"kumar\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
				"    \"totalprice\" : \""+l+"\",\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}";
		return str;
	}
}


