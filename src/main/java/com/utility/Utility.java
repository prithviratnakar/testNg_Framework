package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String getPropertyDirectly(String key) {

		String path = "C:\\Users\\HP\\My WorkSpace\\Framework_selenium_TestNG\\test_data\\properties\\sit_env.properties";

		try {
			FileInputStream file = new FileInputStream(path);

			Properties pro = new Properties();

			pro.load(file);

			return pro.getProperty(key);
		} catch (Exception e) {

			e.printStackTrace();

			return null;
		}

	}

	public static void setImplicitWait(WebDriver driver, int time) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public static void maximizeWindowt(WebDriver driver) {

		driver.manage().window().maximize();
	}

	public static void takesc(WebDriver driver) throws IOException, InterruptedException {

		TakesScreenshot sc = (TakesScreenshot) driver;

		File src = sc.getScreenshotAs(OutputType.FILE);

		SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd_HHmmss");

		String timestamp = date.format(new Date());

		File des = new File(
				"C:\\Users\\HP\\My WorkSpace\\Framework_selenium_TestNG\\screenshots\\" + timestamp + ".png");

		org.openqa.selenium.io.FileHandler.copy(src, des);

		Thread.sleep(3000);

	}

}
