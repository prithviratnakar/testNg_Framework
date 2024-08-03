package com.test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;
import com.page_class.Dashboard_page;
import com.page_class.Login_page;
import com.utility.Utility;

public class Test_AddEmoloyee extends Base {

	Login_page login;
	Dashboard_page dashboard;

	@Test
	public void test_addEmployee() {

		login = new Login_page(driver);
		dashboard = new Dashboard_page(driver);

		Utility.maximizeWindowt(driver);
		driver.get(url);
		Utility.setImplicitWait(driver, 30);
		login.enterCreds("Admin", "admin123");
		login.clickOnLogin();

		String expectedResult = "Dashboard";
		String actualResult = dashboard.dashboardText.getText();

		Assert.assertEquals(expectedResult, actualResult);
		
		

	}

}
