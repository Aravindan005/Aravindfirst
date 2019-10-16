package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon18 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get( "https://www.sprint.com/");
		
		WebElement dot=a.findElement(By.xpath("//a[contains(text(),'My Sprint')][1]"));
		Actions sec = new Actions (a);
		sec.moveToElement(dot).perform();
		
}
}
