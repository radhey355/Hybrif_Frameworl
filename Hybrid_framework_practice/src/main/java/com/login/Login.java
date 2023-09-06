package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver=  null;
	
	public Login(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//button")
	WebElement loginbtn;
	
	public void Validlogin() {
		Email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		loginbtn.click();
	}

}
