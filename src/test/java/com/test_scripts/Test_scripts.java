package com.test_scripts;

import org.testng.annotations.Test;

import com.base.Base;
import com.utility.Utility;

public class Test_scripts extends Base {

	@Test
	public void test1() {
		
		Utility.maximizeWindowt(driver);
		driver.get(url);
		Utility.setImplicitWait(driver, 15000);

	}

}
