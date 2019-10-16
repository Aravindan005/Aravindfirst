package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart19 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(" https://www.flipkart.com/");
driver.manage().window().maximize();

WebElement dot=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
dot.click();

WebElement a = driver.findElement(By.xpath("//span[text()='Women']"));
Actions s1 = new Actions(driver);
	s1.moveToElement(a).perform();
	
	WebElement b = driver.findElement(By.xpath("//a[text()='Flats']"));
	b.click();
	}
}
