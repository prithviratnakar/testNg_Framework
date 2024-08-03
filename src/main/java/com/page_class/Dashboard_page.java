package com.page_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page {

	@FindBy(xpath = "//h6[text()='Dashboard']")
	public WebElement dashboardText;

	public Dashboard_page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
