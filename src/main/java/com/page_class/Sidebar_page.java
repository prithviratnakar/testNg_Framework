package com.page_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sidebar_page {

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pim;

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement admin;

	public Sidebar_page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void ClickonPim() {

		pim.click();
	}

}
