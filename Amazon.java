package org.test;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\selenium\\Day5\\Chrome\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://www.flipkart.com");
	WebElement cat=a.findElement(By.id(""));
	Actions acc=new Actions(a);
	acc.moveToElement(cat).perform();
}
}
