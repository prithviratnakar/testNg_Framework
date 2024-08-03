package com.test_scripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;
import com.page_class.Admin_Page;
import com.page_class.Dashboard_page;
import com.page_class.Login_page;
import com.page_class.Sidebar_page;
import com.utility.Utility;

public class Practice extends Base {

	Login_page login;
	Dashboard_page dashboard;
	Sidebar_page sidebar;
	Admin_Page admin;

	@Test
	public void test_01() throws IOException, InterruptedException {

		login = new Login_page(driver);
		dashboard = new Dashboard_page(driver);

		Utility.maximizeWindowt(driver);
		driver.get(url);
		Utility.setImplicitWait(driver, 30);
		login.enterCreds("Admin", "admin123");
		login.clickOnLogin();

		String expectedResult = "Dashboard";
		String actualResult = dashboard.dashboardText.getText();

		Assert.assertEquals(actualResult, expectedResult);

		Thread.sleep(3000);

	//	Utility.takesc(driver);

		TakesScreenshot sc = (TakesScreenshot) driver;

		File src = sc.getScreenshotAs(OutputType.FILE);

		SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd_HHmmss");

		String timestamp = date.format(new Date());

		File des = new File(
				"C:\\Users\\HP\\My WorkSpace\\Framework_selenium_TestNG\\screenshots\\" + timestamp + ".png");

		org.openqa.selenium.io.FileHandler.copy(src, des);

		Thread.sleep(3000);

	}

	@Test
	public void test_2() {

		Utility.maximizeWindowt(driver);
		driver.get(url);
		Utility.setImplicitWait(driver, 30);

		List<WebElement> all = driver.findElements(By.tagName("a"));

		for (WebElement a : all) {

			System.out.println(a.getAttribute("href"));
			// System.out.println(a.getText());
		}

	}

	@Test
	public void task_03() throws InterruptedException {

		sidebar = new Sidebar_page(driver);
		admin = new Admin_Page(driver);

		Utility.maximizeWindowt(driver);
		driver.get(url);
		Utility.setImplicitWait(driver, 30);
		login.enterCreds("Admin", "admin123");
		login.clickOnLogin();

		sidebar.ClickonPim();

		Select sc = new Select(admin.job);

		sc.selectByIndex(2);

		Thread.sleep(4000);

	}

}
