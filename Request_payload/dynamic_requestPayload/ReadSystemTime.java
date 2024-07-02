package dynamic_requestPayload;

import java.util.Date;

import org.joda.time.DateTime;

public class ReadSystemTime 
{

		public static long date_time()
		{
			Date dt = new Date();
			DateTime tdd = new DateTime();
			System.out.println(dt);
			long str = dt.getTime();
			System.out.println(str);
			
			return str;
		}
	
	

	
}
