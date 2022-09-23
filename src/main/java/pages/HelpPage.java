package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class HelpPage extends ProjectSpecificMethods {

		public HelpPage expandHelp()
		{ 
			driver.findElement(By.xpath("//button[text()='Help']")).click();
			return this;
		}
		
		public HelpPage expandHelpContactUs()
		{ 
			driver.findElement(By.xpath("//a[@href='/help/contactUs']")).click();
			return this;
		}
		
		public HelpPage expandHelpPlanRules()
		{ 
			driver.findElement(By.xpath("//a[@href='/help/planRules']")).click();
			return this;
		}
			
}
