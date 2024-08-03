package com.page_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	@FindBy(name = "(//input[@class='oxd-input oxd-input--active'])[1] and //input[@name='username']")
	private WebElement username;

	@FindBy(name = "(//input[@class='oxd-input oxd-input--active'])[2] and //input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginBtn;

	@FindBy(xpath = "//p[text()='Invalid credentials']")
	public WebElement InvalidCreds;

	public Login_page(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void enterCreds(String user, String pass) {

		username.sendKeys(user);
		password.sendKeys(pass);
	}

	public void clickOnLogin() {

		loginBtn.click();
	}

}
