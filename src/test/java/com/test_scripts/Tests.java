package com.test_scripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Tests {

	@Test
	public void test() throws IOException {

		String path = "C:\\Users\\HP\\My WorkSpace\\Framework_selenium_TestNG\\test_data\\properties\\sit_env.properties";

		FileInputStream file = new FileInputStream(path);

		Properties prop = new Properties();
		prop.load(file);

		System.out.println(prop.getProperty("url"));

	}

}
