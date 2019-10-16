package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclu5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();

	WebElement a = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
	Actions b = new Actions (driver);
	b.moveToElement(a).perform();
	
	
	WebElement c= driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
c.click();	

	
	}
}