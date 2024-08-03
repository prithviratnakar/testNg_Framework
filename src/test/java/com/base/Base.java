package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.Utility;

public class Base {

	public static WebDriver driver;

	String browser = Utility.getPropertyDirectly("browser");
	public String url = Utility.getPropertyDirectly("url");

	@BeforeClass
	public void browser_Setup() throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		}

		else {

			throw new Exception("Invalid browser value");
		}

	}

	@AfterClass
	public void teardowmn() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();

	}

}
