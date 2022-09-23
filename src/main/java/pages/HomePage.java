package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods  {
	
	public void expandOptions() {
		// TODO Auto-generated method stub

	}
	
	public void expandAwards() {
		// TODO Auto-generated method stub

	}
	
	public void expandAccounts() {
		// TODO Auto-generated method stub

	}
	
	public void expandAdministration() {
		// TODO Auto-generated method stub

	}
	
	public void expandReports() {
		// TODO Auto-generated method stub

	}
	
	public void expandHelp() {
		// TODO Auto-generated method stub

	}
	
	public SignInPage clickLogOut() {
		driver.findElement(By.xpath("//button[text()='Log out']")).click();
		return new SignInPage();

	}

}
