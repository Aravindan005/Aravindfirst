package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.flipkart.com");
		
		WebElement dot=a.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		dot.click();
		
		WebElement cat=a.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		Actions ass = new Actions(a);
		ass.moveToElement(cat).perform();
		
		
		WebElement butt=a.findElement(By.xpath("(//a[text()='Chairs'])[1]"));
		butt.click();
		Thread.sleep(300);

		WebElement dat=a.findElement(By.xpath("//a[contains(text(),'Da URBAN Leatherette Office Visitor Chair')]"));
		Thread.sleep(400);
		dat.click();
		
		
	//	WebElement ara=a.findElement(By.xpath("//button[text()='ADD TO CART']"));
		//ara.click();
	}
}