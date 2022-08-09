package com.pom.Ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_for_Checkout {
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement QtyCheckout;
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement SummaryCheckout;
	@FindBy(name = "processAddress")
	private WebElement AddressCheckout;
	@FindBy(id = "cgv")
	private WebElement TermsCheckbox;
	@FindBy(name = "processCarrier")
	private WebElement ShippingCheckout;
	public WebElement getQtyCheckout() {
		return QtyCheckout;
	}
	public WebElement getSummaryCheckout() {
		return SummaryCheckout;
	}
	public WebElement getAddressCheckout() {
		return AddressCheckout;
	}
	public WebElement getTermsCheckbox() {
		return TermsCheckbox;
	}
	public WebElement getShippingCheckout() {
		return ShippingCheckout;
	}
	public Pom_for_Checkout(WebDriver driver5) {
		PageFactory.initElements(driver5, this);
		
	}
}
