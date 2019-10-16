package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.greenstechnologies.in/selenium-training.php");
driver.manage().window().maximize();

WebElement a = driver.findElement(By.xpath("//a[text()='COURSES']"));
Actions acc = new Actions (driver);
acc.moveToElement(a).perform();

WebElement b = driver.findElement(By.xpath("(//span[text()='SAP Training '])"));
acc.moveToElement(b).perform();

WebElement c = driver.findElement(By.xpath("//span[text()='SAP MM Training']"));
c.click();

//WebElement d = driver.findElement(By.xpath("//span[text()='SAP MM Training']"));

	}
}
