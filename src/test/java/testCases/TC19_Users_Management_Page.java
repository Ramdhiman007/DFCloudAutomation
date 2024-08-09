package testCases;

import org.testng.annotations.Test;

import pageObjects.Users_Management_Page;

public class TC19_Users_Management_Page extends pageObjects.Base_Page {
	
	@Test(priority=1)
	public void UserManagement_Page() {
		Users_Management_Page mgm= new Users_Management_Page();
		mgm.clickUsr_id();
		mgm.usermanagement();
	}
	@Test(priority=2)
	public void AddSAUser() {
		Users_Management_Page adc = new Users_Management_Page();
		adc.addCloudUser();
		adc.addNewCloudUser();
		//adc.addNewCloudUser();
		adc.putfirstname1(randomeString().toUpperCase());
		adc.putlastname(randomeString().toUpperCase());
		adc.putemail(randomeString() + "@gmail.com");
		adc.selectSAuser("Super Administrator");
		adc.clickonaddbtn();
/*	}
	@Test(priority=3)
	public void AddAdminUser() {
		Users_Management_Page admin = new Users_Management_Page();
		admin.addAdminUser();
		admin.addNewAdminUser();
		admin.AdminFirstname(randomeString().toUpperCase());
		admin.AdminLastname(randomeString().toUpperCase());
		admin.AdminEmail(randomeString() + "@gmail.com");
		admin.AdminPermission("Administrator");
		admin.clickOnAddAdminBtn();

} 
*/
}
}
