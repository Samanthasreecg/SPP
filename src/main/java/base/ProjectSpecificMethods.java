package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	public static ChromeDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void preCondition() throws IOException {
		
		if 
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Properties prop = new Properties();
		
		//Setup the file path
		FileInputStream fis = new FileInputStream(new File("./src/main/resources/application.properties"));
		prop.load(fis);
		String url =  prop.getProperty("url");
		driver.get(url); 
	}
	
	@AfterMethod
	public void PostCondition() {
		driver.close();
	}
	
}
