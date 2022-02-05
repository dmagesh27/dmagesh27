package SeleniumJava;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDatePicker {

	public static void main(String[] args) throws InterruptedException {

			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Auto\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
		driver.get("https://www.spicejet.com");
		
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement Element=   driver.findElement(By.id("ctl00_mainContent_view_date1"));
		
		String Dateval="25-09-2021";
		Thread.sleep(9000);
		Element.click();
		Datepickerjs(Element, driver,Dateval);
	}
		
	public static void Datepickerjs(WebElement Element,WebDriver driver,String Dateval)
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("arguments[0].setAttribute('value','"+Dateval+"');", Element);
			
			
		}
		
		
	}


