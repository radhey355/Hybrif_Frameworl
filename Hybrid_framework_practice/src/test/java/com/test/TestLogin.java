package com.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.login.Login;

public class TestLogin extends BaseClass {
	
	Login login = null;
	
	@BeforeSuite
	public void setup() throws Exception {
		inetelize();
		
		
	}
	@Test
	public void Test01() {
		login = new Login(driver);
		login.Validlogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	public void Test02() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard11");
	}
	@Test
	public void Test03() {
		throw new SkipException("skipping the test case");
	}
	
	
	

}
