package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		//Setup the file path
		FileInputStream fis = new FileInputStream(new File("./src/main/resources/application.properties"));

		prop.load(fis);
		String url =  prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
