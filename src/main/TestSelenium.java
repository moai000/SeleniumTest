package main;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class TestSelenium {
	
	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.chrome.driver","D:\\pleiades\\workspace\\Selenium\\exe\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.itmedia.co.jp/mobile/articles/2203/11/news089.html");
//			driver.get("https://www.ap-siken.com/");
			
//			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//					  .withTimeout(Duration.ofSeconds(30))
//					  .pollingEvery(Duration.ofSeconds(5))
//					  .ignoring(NoSuchElementException.class);
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"globalFooterCorp\"]")));
			
			Thread.sleep(10000);
			
			//driver.executeScript("console.log('hoge');");
		    Iterator<LogEntry> logs = driver.manage().logs().get(LogType.BROWSER).iterator();
		    while (logs.hasNext()) {
		    	System.out.println(logs.next().getMessage());
		    }
		    
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	    
	}
	
	
}
