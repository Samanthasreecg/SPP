package TestCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.AdministrationPage;
import pages.SignInPage;

public class SPMD_TC_2 extends ProjectSpecificMethods {
	
	@Test

	public void CreateUser() {
		SignInPage sp = new SignInPage();
		AdministrationPage ap = new AdministrationPage();
	
		sp.enterUserName().enterPassWord().clickSignIn();
		ap.enterManageUserProfileUserID().enterManageUserProfileNRICFINPassportNo().enterManageUserProfileName().
		enterManageUserProfileAddress1().enterManageUserProfileAddress2().enterManageUserProfileAddress3().
		enterManageUserProfileAddress4().enterManageUserProfilePostalCode().enterManageUserProfileCountry()
		.enterManageUserProfileMobileTel().enterManageUserProfileHomeTel().enterManageUserProfileOfficeTel()
		.enterManageUserProfileEmail().enterManageUserProfileEmployeeID().enterManageUserProfileCompany()
		.enterManageUserProfileDepartmentDivisio()
		.enterManageUserProfileCostCenter().enterManageUserProfileDesignation().enterManageUserProfileJobGrade()
		.enterManageUserProfileDateJoin();
	}

}
