package api.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile
{
	
	public static Properties readproperites(String path) throws FileNotFoundException 
	{
		FileInputStream fi_inp_stream = null;
		Properties prop =null;
		
		try {
			fi_inp_stream = new FileInputStream(path);

			prop =new Properties();
			
				prop.load(fi_inp_stream);
		}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
		return prop;
		
		
		
	}

}
