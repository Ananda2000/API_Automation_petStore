package api.ResponseCodes;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.codehaus.groovy.ast.stmt.CatchStatement;

import api.Utils.PropertiesFile;

public class TestingPropertiesFile 
{
	public static void main(String [] args) {
	try {
	String filepath ="C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_petStore\\src\\test\\resources\\property.properites";
	Properties prep = PropertiesFile.readproperites(filepath);
	
	System.out.println(prep.getProperty("username"));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	}
			

}
