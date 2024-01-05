package simpleObject_reading;

import java.io.IOException;

import org.codehaus.groovy.runtime.dgmimpl.arrays.IntegerArrayGetAtMetaMethod;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Simple_Json_array 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmppr = new ObjectMapper();
		
		String str ="{\r\n" +  
				"\"score_in_subjects\":[99,84,67]\r\n" + 
				"}";
		
		
		Simple_Json_array_pojo  s_j_pojo = objmppr.readValue(str, Simple_Json_array_pojo.class);
		System.out.println(s_j_pojo.getScore_in_subjects());
		
		System.out.println("Here am iterating the arraylist");
		
		for (Integer aaa : s_j_pojo.getScore_in_subjects()) 
		{
			
			System.out.println(aaa);
		}
		
	}

}
