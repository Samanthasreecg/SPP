package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ReportsPage extends ProjectSpecificMethods {

			public ReportsPage expandReports()
		{ 
			driver.findElement(By.xpath("//button[text()='Reports']")).click();
			return this;
		}
		
		public ReportsPage expandReportsESOPPersonalLedger()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/esopPersonalLedger']")).click();
			return this;
		}
		
		public ReportsPage expandReportsPSPRSPPersonalLedger()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/pspPersonalLedger']")).click();
			return this;
		}
		
		public ReportsPage expandReportsESOPGrantOfferReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/esopGrantOffer']")).click();
			return this;
		}
		
		public ReportsPage expandReportsESOPGrantSummaryReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/esopGrantSummary']")).click();
			return this;
		}
		
		public ReportsPage expandReportsESOPMasterOptionReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/esopMasterOption']")).click();
			return this;
		}
		
		public ReportsPage expandReportsESOPExerciseReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/esopExcercise']")).click();
			return this;
		}
		
		public ReportsPage expandReportsESOPExpenseReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/esopExpense']")).click();
			return this;
		}
		
		public ReportsPage expandReportsPSPRSPMasterShareReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/pspMasterShare']")).click();
			return this;
		}
		
		public ReportsPage expandReportsPSPRSPAwardSummaryReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/pspAwardSummary']")).click();
			return this;
		}
		
		public ReportsPage expandReportsPSPRSPVestingReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/pspVesting']")).click();
			return this;
		}
		
		public ReportsPage expandReportsPSPRSPAllotmentReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/pspAllotment']")).click();
			return this;
		}
		
		public ReportsPage expandReportsPSPRSPExpenseReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/pspExpense']")).click();
			return this;
		}
		
		public ReportsPage expandReportsUserDetailsReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/userDetails']")).click();
			return this;
		}
		
		public ReportsPage expandReportsLapseReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/lapse']")).click();
			return this;
		}
		
		public ReportsPage expandReportsGainsReport()
		{ 
			driver.findElement(By.xpath("//a[@href='/Reports/gains']")).click();
			return this;
		}
		
}
