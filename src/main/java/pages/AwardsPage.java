package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class AwardsPage extends ProjectSpecificMethods {

		public AwardsPage expandAwards()
		{ 
			driver.findElement(By.xpath("//button[text()='Awards']")).click();
			return this;
		}
		
		public AwardsPage expandAwardsPersonalLedger()
		{ 
			driver.findElement(By.xpath("//a[@href='awards/personalLedger']")).click();
			return this;
		}
		
		public AwardsPage expandAwardsViewAward()
		{ 
			driver.findElement(By.xpath("//a[@href='awards/viewAward']")).click();
			return this;
		}
		
}
