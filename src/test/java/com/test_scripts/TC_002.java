package com.test_scripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;
import com.page_class.Dashboard_page;
import com.page_class.Login_page;
import com.utility.Utility;

public class TC_002 extends Base {

	Login_page login;
	Dashboard_page dashboard;

	@Test
	public void test_01() throws InterruptedException, IOException {

		login = new Login_page(driver);
		dashboard = new Dashboard_page(driver);

		Utility.maximizeWindowt(driver);
		driver.get(url);
		Utility.setImplicitWait(driver, 30);
		login.enterCreds("Admin", "1234");
		login.clickOnLogin();

		String expectedResult = "Invalid credentials";
		String actualResult = login.InvalidCreds.getText();

		Assert.assertEquals(actualResult, expectedResult);

		Thread.sleep(3000);

		 
	}

}
