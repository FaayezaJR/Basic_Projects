package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
    private WebElement email;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement Password;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement sign_btn;
	
	 
	public Login_Page (WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
		
		public WebDriver getDriver() {
			return driver;
		}


		public WebElement getEmail() {
			return email;
		}


		public WebElement getPassword() {
			return Password;
		}


		public WebElement getSign_btn() {
			return sign_btn;
		}
	}
	
	
