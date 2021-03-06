package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Img {
	public WebDriver driver;

	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement Quick_view;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement addcart_Frame;
	
	@FindBy(xpath = "//button[@name='Submit']")
			private WebElement cartclick;
	
public Tshirt_Img (WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
public WebElement getQuick_view() {
	return Quick_view;
}

public WebElement getAddcart_Frame() {
	return addcart_Frame;
}
public WebElement getCartclick() {
	return cartclick;
}
}
