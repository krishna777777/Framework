package Automation.Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("krishna99@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Krishna@77");
		driver.findElement(By.id("login")).click();
		driver.manage().window().maximize();
		//Thread.sleep(7000);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		
		WebElement scope = 	driver.findElement(By.cssSelector("div.card-body"));
		
	
//List<WebElement> button= 	scope.findElements(By.cssSelector("button.btn.w-10.rounded"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		
		scope.findElement(By.xpath("(//button[@class='btn w-10 rounded'])[1]")).click();
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		scope.findElement(By.xpath("(//button[@class='btn w-10 rounded'])[2]")).click();
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		scope.findElement(By.xpath("(//button[@class='btn w-10 rounded'])[3]")).click();
		//Thread.sleep(7000);

/*for (int i=0;i<button.size();i++) {
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
	
	scope.findElements(By.cssSelector("button.btn.w-10.rounded")).get(i).click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
	Thread.sleep(8000);
	
}*/
		
		
		
	
	
	
	
	
	
	

	
	

	}

}
