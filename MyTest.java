package com.JavaPractise;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyTest {

 

  public static void main() throws MalformedURLException {
	  Capabilities chromeCapabilities = DesiredCapabilities.chrome();
	  Capabilities firefoxCapabilities = DesiredCapabilities.firefox();
    RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://34.204.52.152/:4444/wd/hub"), chromeCapabilities);
    RemoteWebDriver firefox = new RemoteWebDriver(new URL("http://34.204.52.152/:4444/wd/hub"), firefoxCapabilities);

    // run against chrome
    chrome.get("https://www.google.com");
    System.out.println(chrome.getTitle());

    // run against firefox
    firefox.get("https://www.google.com");
    System.out.println(firefox.getTitle());
  
    chrome.quit();
    firefox.quit();
  }
}
