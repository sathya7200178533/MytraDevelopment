package com.pom.Ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_for_Login {
	WebDriver driver;

	@FindBy(linkText = "Sign in")
	private static WebElement Signin;

	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="passwd")
	private  WebElement passwd;

	@FindBy(id="SubmitLogin")
	private  WebElement SubmitLogin;

	public WebElement getSignin() {
		return Signin;
	}
	public static void setSignin(WebElement signin) {
		Signin = signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPasswd() {
		return passwd;
	}
	public WebElement getSubmitLogin() {
		return SubmitLogin;
	}

	public Pom_for_Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

}
