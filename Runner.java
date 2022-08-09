package com.pom.Ecom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.methods.Base;

public class Runner extends Base {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=lauchBrowser("Chrome");
		getURL("http://automationpractice.com/index.php");
		timeWait();
		PageObjectManager pom  = new PageObjectManager(driver);
		WebElement signin = pom.getLogin().getSignin();
		
		click(signin);
		WebElement username = pom.getLogin().getEmail();
		sendkeys(username, "amc.sathiya@gmail.com");
		WebElement pwd = pom.getLogin().getPasswd();
		sendkeys(pwd, "9500070218");
		pom.getLogin().getSubmitLogin().click();
		pom.getAddToCart().getWomen().click();
		pom.getAddToCart().getProduct().click();
		pom.getAddToCart().getPlusButton().click();
		pom.getAddToCart().getColor().click();
		WebElement size = pom.getAddToCart().getSize();
		click(size);
		Select select = new Select(size);
		select.selectByVisibleText("L");
		size.click();
		timeWait();
		pom.getAddToCart().getAddToCart().click();
		timeWait();
		pom.getCheckout().getQtyCheckout().click();
		pom.getCheckout().getSummaryCheckout().click();
		pom.getCheckout().getAddressCheckout().click();
		pom.getCheckout().getTermsCheckbox().click();
		pom.getCheckout().getShippingCheckout().click();
		screenshot("payment");
		
	 
		
	}

}
