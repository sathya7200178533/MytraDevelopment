package com.pom.Ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_for_ProductAddToCart {
	WebDriver driver;
	
	
	@FindBy(linkText = "Women")
	private WebElement Women;
	
	@FindBy(xpath = "(//a[@title='Blouse'])[2]")
	private WebElement product;
	
	@FindBy(className = "icon-plus")
	private WebElement plusButton;
	
	@FindBy(id = "group_1")
	private WebElement size;
	
	@FindBy(id = "color_8")
	private WebElement color;
	
	@FindBy(name = "Submit")
	private WebElement addToCart;

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getPlusButton() {
		return plusButton;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	public Pom_for_ProductAddToCart(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver4, this);
	}
}

