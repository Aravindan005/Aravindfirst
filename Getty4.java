package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getty4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(" https://www.gettyimages.in/");
driver.manage().window().maximize();

WebElement a = driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
a.click();

WebElement b = driver.findElement(By.xpath("(//a[text()='Entertainment'])"));
b.click();
}
}
