package SeleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Auto\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
		driver.get("https://www.delta.com/");
		
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
				
		//driver.findElement(By.xpath("//*[@id="fromAirportName"]/span[1]")).
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"input_departureDate_1\"]")).click();
		
				
	//	Select sel1=new Select(
			//	driver.findElement(By.xpath("//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
		//sel1.selectByVisibleText("Chennai (MAA)");
		//sel1.selectByValue("Chennai (MAA)");
		
		driver.findElement(By.xpath("//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[1]/div[2]/table/tbody/tr[6]/td[3]/a")).click();

		Thread.sleep(3000);
		
		//Select sel2=new Select(
				driver.findElement(By.xpath("//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[2]/div[2]/table/tbody/tr[6]/td[5]/a")).click();
		//sel2.selectByVisibleText("Bengaluru (BLR)");
		//sel2.selectByValue("Bengaluru (BLR)");
		
				
		driver.findElement(By.xpath("//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[3]/button[2]")).click();		
		
		
	}

}
