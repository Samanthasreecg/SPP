//Automated By Samanthasree CG

package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class AdministrationPage extends ProjectSpecificMethods {
	
//===============================================================================================
//Administration
		
		public AdministrationPage expandAdministration()
		{ 
			driver.findElement(By.xpath("//button[text()='Administration']")).click();
			return this;
		}
		
		
//===============================================================================================
//ESOP - Grant
		
		public AdministrationPage expandAdministrationESOPGrant() {
			driver.findElement(By.xpath("//button[text()='ESOP - Grant']")).click();
			return this;
		}
		
//-->Create New Grant
		public AdministrationPage expandAdministrationCreateNewGrant() {
			driver.findElement(By.xpath("/Administrator/EsopGrant/createGrant")).click();
			return this;
		}
		
//-->Maintain Grant
		public AdministrationPage expandAdministrationMaintainGrant() {
			driver.findElement(By.xpath("/Administrator/EsopGrant/maintainGrant")).click();
			return this;
		}
		
//-->Send Grant for Approval
		public AdministrationPage expandAdministrationSendGrantforApproval() {
			driver.findElement(By.xpath("/Administrator/EsopGrant/sendGrant")).click();
			return this;
		}
		
//-->Generate Offer Letter
				public AdministrationPage expandAdministrationGenerateOfferLetter() {
					driver.findElement(By.xpath("/Administrator/EsopGrant/generateOffer")).click();
					return this;
				}
		
//-->Manual Acceptance
				
				public AdministrationPage expandAdministrationManualAcceptance() {
					driver.findElement(By.xpath("/Administrator/EsopGrant/manualAcceptance")).click();
					return this;
				}
		
				
//===============================================================================================		
//ESOP - Upload
			public AdministrationPage expandAdministrationESOPUpload() {
			driver.findElement(By.xpath("//button[text()='ESOP - Upload']")).click();
			return this;
		}
		
//-->Upload Grant List
				public AdministrationPage expandAdministrationUploadGrantList() {
					driver.findElement(By.xpath("/Administrator/EsopUpload/uploadGrant")).click();
					return this;
				}		
			
				
//===============================================================================================	
//ESOP - Option
		
		public AdministrationPage expandAdministrationESOPOption() {
			driver.findElement(By.xpath("//button[text()='ESOP - Option']")).click();
			return this;
		}
		
//-->Enter Blackout Period
		
		public AdministrationPage expandAdministrationEnterBlackoutPeriod() {
			driver.findElement(By.xpath("/Administrator/EsopOption/blackoutPeriod")).click();
			return this;
		}
		
//-->Manual Exercise
		
		public AdministrationPage expandAdministrationManualExercise() {
			driver.findElement(By.xpath("/Administrator/EsopOption/manualExercise")).click();
			return this;
		}	
		
		
//-->Enter Payment
		public AdministrationPage expandAdministrationEnterPayment() {
			driver.findElement(By.xpath("/Administrator/EsopOption/enterPayment")).click();
			return this;
		}	
		
//-->>Exercise Process
		public AdministrationPage expandAdministrationExerciseProcess() {
			driver.findElement(By.xpath("/Administrator/EsopOption/exerciseProcess")).click();
			return this;
		}	
		
//-->Enter Listing/Crediting/Net Asset Value Date
		
		public AdministrationPage expandAdministrationEnterListingCreditingNetAssetValueDate() {
			driver.findElement(By.xpath("/Administrator/EsopOption/assetValue")).click();
			return this;
		}	
		
		
//==============================================================================================		
//PSP/RSP - Award		
		
		public AdministrationPage expandAdministrationPSPRSPAward() {
			driver.findElement(By.xpath("//button[text()='PSP/RSP - Award']")).click();
			return this;
		}
		
//-->Create New Award
		
				public AdministrationPage expandAdministrationUploadCreateNewAward() {
					driver.findElement(By.xpath("/Administrator/PspAward/createAward")).click();
					return this;
				}
				
//-->Maintain Award
				
				public AdministrationPage expandAdministrationMaintainAward() {
					driver.findElement(By.xpath("/Administrator/PspAward/maintainAward	")).click();
					return this;
				}
				
//-->Send Award For Approval
				
				public AdministrationPage expandAdministrationSendAwardForApproval() {
					driver.findElement(By.xpath("/Administrator/PspAward/sendAward")).click();
					return this;
				}
				
//-->Generate Award Email
				public AdministrationPage expandAdministrationGenerateAwardEmail() {
					driver.findElement(By.xpath("/Administrator/PspAward/generateAward")).click();
					return this;
				}
				
//-->Enter Award Factor	
				public AdministrationPage expandAdministrationEnterAwardFactor() {
					driver.findElement(By.xpath("/Administrator/PspAward/awardFactor")).click();
					return this;
				}
				
//==============================================================================================		
//PSP/RSP - Upload	
		
		public AdministrationPage expandAdministrationPSPRSPUpload() {
			driver.findElement(By.xpath("//button[text()='PSP/RSP - Upload']")).click();
			return this;
		}
		
//--> Upload Award List
		
		public AdministrationPage expandAdministrationUploadAwardList() {
			driver.findElement(By.xpath("/Administrator/PspUpload/uploadAward]")).click();
			return this;
		}
//==============================================================================================
//PSP/RSP - Share
		
		public AdministrationPage expandAdministrationPSPRSPShare() {
			driver.findElement(By.xpath("//button[text()='PSP/RSP - Share']")).click();
			return this;
		}

//--> Crediting Process
		
		public AdministrationPage expandAdministrationCreditingProcess() {
			driver.findElement(By.xpath("//a[@href='/Administrator/PspShare/creditingProcess']")).click();
			return this;
		}
		
		
//--> Enter Listing/Crediting Date	
		public AdministrationPage expandAdministrationEnterListingCreditingDate() {
			driver.findElement(By.xpath("//a[@href='/Administrator/PspShare/creditingDate']")).click();
			return this;
		}
		
//-->	Enter Payment Date
		
		public AdministrationPage expandAdministrationEnterPaymentDate() {
			driver.findElement(By.xpath("//a[@href='/Administrator/PspShare/paymentDate']")).click();
			return this;
		}
//=============================================================================================================		
//System	
		public AdministrationPage expandAdministrationSystem() {
			driver.findElement(By.xpath("//button[text()='System']")).click();
			return this;
		}
		
		
//--> Upload User Profile
		public AdministrationPage expandAdministrationUploadUserProfile() {
			driver.findElement(By.xpath("//a[@href='/Administrator/System/uploadProfile']")).click();
			return this;
		}
			
//--> Manage User Profile		
		
		public AdministrationPage enterManageUserProfileFullName() {
			driver.findElement(By.id("fullname")).sendKeys("Tha");
		
			return this;
		}
		
//--> Manage User Profile//-->Search User		
		
		public AdministrationPage enterManageUserProfileUserID() {
			driver.findElement(By.id("userID")).sendKeys("user10");
			return this;
		}
			
		public HomePage clickSearch() {
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		return new HomePage();
		}
		
		public HomePage clickNewUser() {
			driver.findElement(By.xpath("//button[text()='New User']")).click();
			return new HomePage();		
		}
		
//--> Manage User Profile//--> New User Profile		
		
		public AdministrationPage enterManageUserProfileProfileUserID() {
			driver.findElement(By.id("profileUserID")).sendKeys("TestSam");
			return this;	
		}
		
		public AdministrationPage enterManageUserProfileNRICFINPassportNo() {
			driver.findElement(By.id("nric")).sendKeys("12345678910");
			return this;	
		}
		
		public AdministrationPage enterManageUserProfileName() {
			driver.findElement(By.id("nric")).sendKeys("12345678910");
			return this;	
		}
		
		public AdministrationPage enterManageUserProfileAddress1() {
			driver.findElement(By.id("nric")).sendKeys("12345678910");
			return this;	
		}
		
		public AdministrationPage enterManageUserProfileAddress2() {
			driver.findElement(By.id("nric")).sendKeys("12345678910");
			return this;	
		}
		
		public AdministrationPage enterManageUserProfileAddress3() {
			driver.findElement(By.id("nric")).sendKeys("12345678910");
			return this;	
		}
		
		public AdministrationPage enterManageUserProfileAddress4() {
			driver.findElement(By.id("nric")).sendKeys("12345678910");
			return this;	
		}
		
		
			public AdministrationPage enterManageUserProfilePostalCode() {
			driver.findElement(By.id("nric")).sendKeys("12345678910");
			return this;	
		}
			
			public AdministrationPage enterManageUserProfileCountry() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileMobileTel() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileHomeTel() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileOfficeTel() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileEmail() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileEmployeeID() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileCompany() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileDepartmentDivisio() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileCostCenter() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileDesignation() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileJobGrade() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileDateJoin() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;
				
			}
			public AdministrationPage enterManageUserProfileTenderDate() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
	
			public AdministrationPage enterManageUserProfileLastDayofService() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileLapseDate() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileTerminationReason() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileAccountName() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileNationality() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
			
			public AdministrationPage enterManageUserProfileSingaporePermanentResident() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
	
			
				public AdministrationPage enterManageUserProfileCDPAccountNumber() {
				driver.findElement(By.id("nric")).sendKeys("12345678910");
				return this;	
			}
				
					public AdministrationPage enterManageUserProfileDepositoryAgent() {
					driver.findElement(By.id("nric")).sendKeys("12345678910");
					return this;	
				}
			
					
					
					public AdministrationPage enterManageUserProfileDepositoryAgentAccountNumber() {
						driver.findElement(By.id("nric")).sendKeys("12345678910");
						return this;	
					}
					
					public AdministrationPage enterManageUserProfileAgentBank() {
						driver.findElement(By.id("nric")).sendKeys("12345678910");
						return this;	
					}
					
					public AdministrationPage enterManageUserProfileCPFInvestmentAccountNumber() {
						driver.findElement(By.id("nric")).sendKeys("12345678910");
						return this;	
					}
					
					public AdministrationPage enterManageUserProfileRole() {
						driver.findElement(By.id("nric")).sendKeys("12345678910");
						return this;	
					}
					
					public AdministrationPage enterManageUserProfileEmploymentStatus() {
						driver.findElement(By.id("nric")).sendKeys("12345678910");
						return this;	
					}
					
					public AdministrationPage enterManageUserProfileAccountStatus() {
						driver.findElement(By.id("nric")).sendKeys("12345678910");
						return this;	
					}
					
					public AdministrationPage enterManageUserProfileRemarks() {
						driver.findElement(By.id("nric")).sendKeys("12345678910");
						return this;	
					}
										
					public HomePage clickSubmit() {
						driver.findElement(By.xpath("//button[text()='Submit']")).click();
						return new HomePage();
						}
					
					public HomePage clickNewSearch() {
						driver.findElement(By.xpath("//button[text()='New Search']")).click();
						return new HomePage();
						}
					
					public HomePage clickResetPassword() {
						driver.findElement(By.xpath("//button[text()='Reset Password']")).click();
						return new HomePage();
						}
				
					
					
//--> Manage Lookup Table
		public AdministrationPage expandAccountsRegisterMFA()
		{ 
			driver.findElement(By.xpath("//a[@href='/Administrator/System/manageLookup']")).click();
			return this;
		}
				

		
}
