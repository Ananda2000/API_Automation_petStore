package Automation_practicing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPRacticing 
{
	@BeforeMethod
	public void before_method()
	{
		System.out.println("This is before method");
	}

	@BeforeTest
	public void before_test()
	{
		System.out.println("Before Test");
	}
	
	@Test
	public void this_is_test()
	{
		System.out.println("this is test 1");
		
	}
	
	@Test
	public void this_is_test1()
	{
		System.out.println("this is test 2");
		
	}
}
