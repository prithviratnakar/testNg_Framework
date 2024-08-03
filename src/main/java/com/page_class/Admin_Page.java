package com.page_class;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Page {

	@FindBy(xpath = "//*[text()='Job ']")
	public WebElement job;

	public Admin_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
