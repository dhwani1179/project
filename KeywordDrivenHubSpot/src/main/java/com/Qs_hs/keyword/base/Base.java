package com.Qs_hs.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName) {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver\\chromedriver.exe");
			if(prop.getProperty("headless").equals("yes")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver =new ChromeDriver(options);
				
			} else {
				driver = new ChromeDriver();
			}
		}
		return driver;
	}
    public Properties init_properties() {
    	prop = new Properties();
    	try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Niwani Patkar\\eclipse-workspace\\KeywordDrivenHubSpot\\src\\main\\java\\com\\Qa_hs\\keyword\\config\\config.properties");
		prop.load(ip);
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return prop;
    }
}
