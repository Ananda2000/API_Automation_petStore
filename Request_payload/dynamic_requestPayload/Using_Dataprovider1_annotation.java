package dynamic_requestPayload;

import org.testng.annotations.Test;

public class Using_Dataprovider1_annotation 
{
	
	@Test(dataProvider="anand", dataProviderClass=Using_Dataprovider_Annotation.class)
	public void Dynamic_payloadDisplay(String names)
	{
		//String str =Dyna_payload.payload(names);
		Long aa = Long.parseLong(names);
				int aaa = 10;
					String aaas= String.valueOf(aaa);
					System.out.println("This is -----------"+aaa);
		System.out.println(aa);
		
		String str =Dyna_payload.payload(aa);
		System.out.println(str);
		
	}

}
