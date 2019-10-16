package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.demo.guru99.com/test/drag_drop.html");

WebElement a = driver.findElement(By.id("credit2"));
WebElement b = driver.findElement(By.id("bank"));
Actions s1 = new Actions(driver);
s1.dragAndDrop(a, b).perform();

WebElement c = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement d = driver.findElement(By.id("amt7"));
s1.dragAndDrop(c, d).perform();
	
WebElement e = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
WebElement f = driver.findElement(By.id("loan"));
s1.dragAndDrop(e, f).perform();

WebElement g = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
WebElement h = driver.findElement(By.id("amt8"));
s1.dragAndDrop(g, h).perform();

	
	}

}
