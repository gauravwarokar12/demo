package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	LoginPage lp=null;
	@BeforeSuite
	public void steup() throws Exception{
		initialisation();
		reportInit();
		lp=new LoginPage(driver);
	}
	@Test
	public void test01() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	@Test
	public void test02() {
		lp.loginToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	public void test03() {
		throw new SkipException("skippin testcase");
	}
}
