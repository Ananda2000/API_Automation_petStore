package simpleObject_reading;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Nested_Json_Array 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		
		String str ="{\r\n" + 
				"\"score_in_subjects\":[[99,84,67],[991,184,11],[\"Sunday\", \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\"]]\r\n" + 
				"}\r\n" + 
				"";
		
		//,[991,184,11]
		
		
		Nest_Json_Array_Pojo nja_obj = objmpr.readValue(str, Nest_Json_Array_Pojo.class);
		
		int sizes =nja_obj.getScore_in_subjects().size();
		
		for(int i=0;i<sizes;i++)
		{
			int arrSize = nja_obj.getScore_in_subjects().get(i).size();
			System.out.println("The array size ----"+arrSize);
 			System.out.println("The array elements -----------------------");
			for(int j=0;j<=arrSize;j++)
			{
				System.out.println(nja_obj.getScore_in_subjects().get(i).get(j));
			}
			
		}
		
		
	}

}
