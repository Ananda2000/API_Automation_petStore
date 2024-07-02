package dynamic_requestPayload;

import org.testng.annotations.DataProvider;

public class Using_Dataprovider_Annotation 
{
	
	@DataProvider (name ="anand")
	public static Object[][] sendData()
	{
		return new Object[][]{{"233423"},{"23232"}};
		
	}

}
