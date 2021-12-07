package Org.Apache.maven.archetype.Maven.Archetype.quickstart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class Runner_Class extends Base_Class {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException, IOException {
	driver = browser("chrome");
	driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
	url("http://automationpractice.com/index.php");
	WebElement sign_in = driver.findElement(By.xpath("//a[@class='login']"));
	clickOnWebElement(sign_in);
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	inputValueElement(email,"faayezaJR@gmail.com");
	WebElement Password = driver.findElement(By.xpath("//input[@id='passwd']"));
	inputValueElement(Password,"JR29021603");
	WebElement sign_btn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
	clickOnWebElement(sign_btn);
    WebElement Tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
	clickOnWebElement(Tshirts);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,550);");
    WebElement Quick_view = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")); 
	clickOnWebElement(Quick_view);
    Thread.sleep(5000);
	WebElement addcart = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(addcart);
	Thread.sleep(5000);
	WebElement cartclick = driver.findElement(By.xpath("//button[@name='Submit']"));
	Actions ("move",cartclick);
	Actions ("click",cartclick);
	Thread.sleep(5000);
	WebDriverWait wait=new WebDriverWait(driver, 70);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
	WebElement proceedclick = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	Actions ("move",proceedclick);
	Actions ("click",proceedclick);
    js.executeScript("window.scrollBy(0,650);");
    WebElement click = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	clickOnWebElement(click);
    js.executeScript("window.scrollBy(0,850);");
    WebElement click1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	clickOnWebElement(click1);
    WebElement click2 = driver.findElement(By.xpath("//input[@name='cgv']"));
	clickOnWebElement(click2);
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,850);");
    WebElement click3 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	clickOnWebElement(click3);
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,850);");
    WebElement click4 = driver.findElement(By.xpath("//a[@class='cheque']"));
	clickOnWebElement(click4);
    js.executeScript("window.scrollBy(0,850);");
    WebElement click5 = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
	clickOnWebElement(click5);
    js.executeScript("window.scrollBy(0,350);");
    Thread.sleep(3000);
    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File destination = new File("C:\\Users\\faayeza\\eclipse-workspace\\Selenium_Testing\\screenshots//pic5.png");
    FileUtils.copyFile(source, destination);
	}
	}
