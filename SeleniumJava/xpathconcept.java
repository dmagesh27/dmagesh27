package SeleniumJava;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathconcept {
	//Program to snooze the notification in hangout section of gmail by handling dynamic iframes.


	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Auto\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
		driver.get("https://www.gmail.com");
		
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
      

		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Automationlearning.testmail");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")).click();
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("********");
		
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);

		
		//selecting dropdown in hangout section
		
		//*[@id="wblh0.08270234309295388-0"]...if iFrame ID is dynamic as given . Pass the WebElement in the frame method as shown below.
		WebElement element=	driver.findElement(By.xpath("//*[starts-with(@id, 'wblh0.') and contains(@id, '-0')]"));
		driver.switchTo().frame(element);
	
			
		driver.findElement(By.xpath("//*[@id=\":a.mcwp\"]/div/div[2]")).click();
		
		driver.switchTo().parentFrame();
		
		//*[@id="wblh0.08270234309295388-0"]...if iFrame ID is dynamic as given . Pass the WebElement in the frame method as shown below.
		WebElement element1=	driver.findElement(By.xpath("//*[starts-with(@id, 'wblh0.') and contains(@id, '-1')]"));
		driver.switchTo().frame(element1);
		
		driver.findElement(By.cssSelector("#\\:3\\.vw > div.hh.nXTVs.lJexke > div.Xg.vF > div > div > div > div > div.Qcw3ab.YigCnc.KX1X8b > div > div.ljZTQb.yYNSGb.z-b-G.c-N-K > div.c-N-K.c-h-i-b-rb")).click();
		

		driver.findElement(By.cssSelector("ul.n7wQec.c-i>li:nth-of-type(8)")).click();

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//img[@class='gb_Ca gbii']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
		
		System.out.println("Pass");
		

	    driver.manage().deleteAllCookies();

		Thread.sleep(5000);

		driver.quit();
	}

}
