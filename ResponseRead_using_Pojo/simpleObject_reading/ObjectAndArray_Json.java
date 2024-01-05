// THIS EXAMPLE CONTAINS BOTH ARRAY AND OBJECT ELEMENTS IN JSON STRING READING IT USING POJO....

package simpleObject_reading;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectAndArray_Json 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		
		String str="{\r\n" + 
				"\"name\":\"ananda K R\",\r\n" + 
				"\"age\":99,\r\n" + 
				"\"score_in_subjects\":[99,84,67]\r\n" + 
				"}\r\n" + 
				"";
		
		ObjectAndArray_Json_POJO ojb = objmpr.readValue(str, ObjectAndArray_Json_POJO.class);
		
		System.out.println(ojb.getAge());
		System.out.println(ojb.getName());
		System.out.println(ojb.getScore_in_subjects());
		
		System.out.println("size of the array list ---"+ ojb.getScore_in_subjects().size());
		
		for (Object ints : ojb.getScore_in_subjects()) 
		{
			System.out.println(ints.toString());
		}
		
		
	}

}
