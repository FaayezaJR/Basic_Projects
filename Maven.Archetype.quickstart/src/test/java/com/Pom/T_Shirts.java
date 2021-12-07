package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_Shirts {
	
	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement Tshirts;
	
public T_Shirts (WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
public WebElement getTshirts() {
	return Tshirts;
}
}
