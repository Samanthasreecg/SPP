package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class OptionsPage extends ProjectSpecificMethods  {
	
		public OptionsPage expandOptions()
		{ 
			driver.findElement(By.xpath("//button[text()='Options']")).click();
			return this;
		}
		
		public OptionsPage expandOptionsPersonalLedger()
		{ 
			driver.findElement(By.xpath("//a[@href='/options/personalLedger']")).click();
			return this;
		}
		
		public OptionsPage expandOptionsAcceptOffer()
		{ 
			driver.findElement(By.xpath("//a[@href='/options/acceptOffer']")).click();
			return this;
		}
		
		public OptionsPage expandOptionsExerciseOption()
		{ 
			driver.findElement(By.xpath("//a[@href='/options/exerciseOption']")).click();
			return this;
		}

}
