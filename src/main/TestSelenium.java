package main;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestSelenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\pleiades\\workspace\\Selenium\\exe\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.itmedia.co.jp/mobile/articles/2203/11/news089.html");
//		driver.get("https://www.ap-siken.com/");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"globalFooterCorp\"]")));
		
		
		//driver.executeScript("console.log('hoge');");
	    Iterator<LogEntry> logs = driver.manage().logs().get(LogType.BROWSER).iterator();
	    while (logs.hasNext()) {
	    	System.out.println(logs.next().getMessage());
	    }
	    
	    
	}
	
	
}
