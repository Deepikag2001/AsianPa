package DriverSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {

	 public static WebDriver driver;
	   public static ChromeOptions Coptions;
	   public static EdgeOptions Eoptions;
	   @SuppressWarnings("deprecation")
	public static WebDriver chromedriver() {
		   WebDriverManager.chromedriver().setup();
		   Coptions= new ChromeOptions();
		   Coptions.addArguments("--start-maximized");
		   //Coptions.addArguments("incognito");
	       Coptions.addArguments("disable-notifications");
		   Coptions.addArguments("disable-popup-blocking");
           //Coptions.addArguments("headless");
		   Coptions.addArguments("disable-blink-features-AutomationControlled");
		   driver= new ChromeDriver(Coptions);
		   
		  
		   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		   driver.get("https://www.asianpaints.com/");
		   return driver;
	   }
	   public static WebDriver edgedriver() {
		   WebDriverManager.edgedriver().setup();
		   Eoptions= new EdgeOptions();
		   Eoptions.addArguments("--statrt-maximized");
		   Eoptions.addArguments("incognito");
		   Eoptions.addArguments("disable-notifications");
		   Eoptions.addArguments("disable-popup-blocking");
		  //Eoptions.addArguments("headless");
		   Eoptions.addArguments("disable-blink-features-AutomationControlled");
		   driver= new EdgeDriver(Eoptions);
		   driver.get("https://www.asianpaints.com/");
		   return driver;
	   }
	}
