package TestCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.AdministrationPage;
import pages.SignInPage;


public class SPMD_TC_1 extends ProjectSpecificMethods {
	
	/*@BeforeTest
	public void SetFileName() {
		excelFileName = "SP CreateUser";
	} */
	
	@Test
	public void runLogin() {
		SignInPage sp = new SignInPage();
		sp.enterUserName().enterPassWord().clickSignIn().clickLogOut();
	
	}

}
