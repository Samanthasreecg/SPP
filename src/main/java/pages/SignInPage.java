package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.ProjectSpecificMethods;

public class SignInPage extends ProjectSpecificMethods {
 	
	public SignInPage enterUserName() {
		driver.findElement(By.id("userid")).sendKeys("admin");
		return this;
	}
	
	
	public SignInPage enterPassWord() {
		driver.findElement(By.id("password")).sendKeys("Password0");
		return this;
	}
	
	public HomePage clickSignIn() {
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	return new HomePage();
	}
	
	public ForgetPassword clickForgetPassWord() {	
	driver.findElement(By.xpath("//a[@href='/forgotpasswrd']")).click();
	return new ForgetPassword();
	}




}
