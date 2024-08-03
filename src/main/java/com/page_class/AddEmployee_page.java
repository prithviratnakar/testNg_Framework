package com.page_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee_page {

	@FindBy(xpath = "//a[text()='Add Employee']")
	public WebElement addEmployee;

	@FindBy(name = "firstName")
	WebElement firstname;

	@FindBy(name = "middleName")
	WebElement middleName;

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(className = "oxd-switch-input oxd-switch-input--active --label-right")
	WebElement CreateLoginDetails;

	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
	WebElement username;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement password;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement confirmpassword;

	@FindBy(xpath = " //button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement saveBtn;

	public AddEmployee_page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void empDetails(String fname, String mname, String lname) {

		firstname.sendKeys(fname);
		middleName.sendKeys(mname);
		lastName.sendKeys(lname);

	}

	public void clickOnCreateLoginDetails() {

		CreateLoginDetails.click();
	}

	public void empCreds(String uname, String pass, String cpass) {

		username.sendKeys(uname);
		password.sendKeys(pass);
		confirmpassword.sendKeys(cpass);

	}

	public void clickonSaveBtn() {

		saveBtn.click();
	}

}
