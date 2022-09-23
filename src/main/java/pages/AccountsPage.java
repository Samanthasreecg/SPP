package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class AccountsPage extends ProjectSpecificMethods {

		public AccountsPage expandAccounts()
		{ 
			
			driver.findElement(By.xpath("//button[text()='Accounts']")).click();
			return this;
		}	
		
		public AccountsPage expandAccountsUserProfile()
		{ 
			driver.findElement(By.xpath("//a[@href='/accounts/profile']")).click();
			return this;
		}
		
		public AccountsPage expandAccountsChangePassword()
		{ 
			driver.findElement(By.xpath("//a[@href='/accounts/changePassword']")).click();
			return this;
		}
		
		public AccountsPage expandAccountsRegisterMFA()
		{ 
			driver.findElement(By.xpath("//a[@href='/accounts/RegisterMFA']")).click();
			return this;
		}	
}
