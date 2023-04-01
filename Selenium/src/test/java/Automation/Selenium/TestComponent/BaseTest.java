package Automation.Selenium.TestComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import automation.selenium.pageobject.LandingPage;

public class BaseTest {
	
	
	public WebDriver driver ; 
	public WebDriver initializeDriver() throws IOException {
		
		
		
		// declaring the global properties to see in which browser to run the java program . 
		
		Properties properties = new Properties();
		// importing the stream class 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+"//src//main//java//automation//resources//GlobalData.properties"); 
		properties.load(fis);
		String browsername = properties.getProperty("browser");
		
		if(browsername.equals("edge")) {
			 driver = new EdgeDriver();
			
		}
		else if (browsername.equals("firefox")) {
			
			 driver = new FirefoxDriver();
			
			
		}
        else if (browsername.equals("chrome")) {
        	driver = new ChromeDriver();
			
			
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		
		return driver ; 
		
		
		
		
		
	}
	
	public LandingPage LaunchApplication() throws IOException {
		 driver = initializeDriver();
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.goToo();
		 
		 return landingPage;
			
		 
	}

}
