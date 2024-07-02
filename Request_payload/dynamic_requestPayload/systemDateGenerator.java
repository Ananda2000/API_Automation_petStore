package dynamic_requestPayload;

import java.util.Date;

public class systemDateGenerator 
{
	public static void main(String[] args)
	{
		long str = System.currentTimeMillis();
		System.out.println(str);
		String str1 = Long.toString(str);
		
		int sizes =str1.length();
		System.out.println(sizes);
		char [] gg = str1.toCharArray();
		/*for (char c : gg) 
		{
			System.out.println(c);
			
		}*/
		
		String strsub = str1.substring(3, 13);
		System.out.println(strsub);
		Date ddt =new Date();
		System.out.println(ddt.toGMTString());
		String str2 = ddt.toGMTString();
		System.out.println(str2);
		
		String[] wiiwe =str2.split(" ");
		for (String string123 : wiiwe) 
		{
			System.out.println(string123);
		}
	}
	

}
