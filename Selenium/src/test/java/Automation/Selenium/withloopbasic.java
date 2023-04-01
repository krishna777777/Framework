package Automation.Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class withloopbasic {

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
		
	List<WebElement> prod=	driver.findElements(By.xpath("//div[@class='card-body']"));
	
	System.out.println(prod.size());
	
	for(int i=0;i<prod.size();i++) {
		driver.findElements(By.xpath("//button[@class='btn w-10 rounded']")).get(i).click();
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
			
		
	}

	}

}
