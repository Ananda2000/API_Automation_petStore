package Schema_validator_classes;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;

import io.restassured.module.jsv.JsonSchemaValidator;

public class Basic_schema1 
{
	public static void main(String [] args)
	{
		ObjectMapper objmpr = new ObjectMapper();
		
		String str1 = "{\r\n" + 
				"\"id\":1,\r\n" + 
				"\"name\":\"nanda\"\r\n" + 
				"}";
		
			//Assert.assertEquals(str1, JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Schema_validation_jsonFiles\\Basic_schema1.json")));
		MatcherAssert.assertThat(str1, JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\Schema_validation_jsonFiles\\Basic_schema1.json")));
	}

}
