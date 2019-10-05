package org.test.mobile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileList {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\MobFind\\Driver and jar\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement popUp=driver.findElement(By.xpath("//button[text()='✕']"));
	popUp.click();
	Thread.sleep(3000);
	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("mobile");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
//*************************************************************************************
	//Common Mobile Path//div[contains(@class,'_1UoZlX')]
	//O
	Thread.sleep(5000);
	List<WebElement> lstMobileElements=driver.findElements(By.xpath("//div[contains(@class,'_1UoZlX')]"));
	int sizeOfMobList=lstMobileElements.size();
	
	System.out.println("Total Mobile List : "+sizeOfMobList);
	
	if(sizeOfMobList>=10) {
		System.out.println("The Mobile list Is Higher Than 10 ");
	}else {
		System.out.println("The Mobile list Is Lower Than 10 ");
	}
}}
