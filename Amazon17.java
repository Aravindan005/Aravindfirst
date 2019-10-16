package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon17 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get( " https://www.amazon.in/");
		
		WebElement dot=a.findElement(By.xpath("(//i[@class='hm-icon nav-sprite'])[1]"));
		dot.click();
	Thread.sleep(100);
		WebElement htc=a.findElement(By.className("(//a[@class='hmenu-item'])[7]"));
		htc.click();
		
	}		
}
