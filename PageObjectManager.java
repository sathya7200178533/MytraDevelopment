package com.pom.Ecom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
WebDriver driver;
private Pom_for_Login login;
private Pom_for_ProductAddToCart addToCart;
private Pom_for_Checkout checkout;

public Pom_for_Login getLogin() {
	Pom_for_Login  login = new Pom_for_Login(driver);
	return login;
}
public Pom_for_ProductAddToCart getAddToCart() {
	Pom_for_ProductAddToCart addToCart = new Pom_for_ProductAddToCart(driver);
	return addToCart;
}
public Pom_for_Checkout getCheckout() {
	Pom_for_Checkout checkout = new Pom_for_Checkout(driver);
	return checkout;
}

public PageObjectManager(WebDriver driver1) {
	this.driver=driver1;
		
}




}
