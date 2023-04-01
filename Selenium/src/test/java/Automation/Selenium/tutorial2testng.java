package Automation.Selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.Selenium.TestComponent.BaseTest;
import automation.selenium.pageobject.CheckoutPage;
import automation.selenium.pageobject.Confirmationpage;
import automation.selenium.pageobject.LandingPage;
import automation.selenium.pageobject.cartPage;
import automation.selenium.pageobject.productCatelogue;

public class tutorial2testng extends BaseTest {
	
	@Test
	public void SubmitOrder() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";
		LandingPage landingPage = LaunchApplication();
		productCatelogue productCatelogue= landingPage.LoginApplication("krishna99@gmail.com", "Krishna@77");
		
		//productCatelogue productCatelogue = new productCatelogue(driver);
		List<WebElement> products= productCatelogue.getProductList(); 
		
		productCatelogue.addProductToCart(productName);
		cartPage cartPage = productCatelogue.gotocart();
		//cartPage cartPage = new cartPage(driver);
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage CheckoutPage= cartPage.Checkout();
		CheckoutPage.selectCountry("india");
		Thread.sleep(5000);
		Confirmationpage Confirmationpage =CheckoutPage.submitOrder();
		String text = Confirmationpage.verifyConfirmationMessage();
		Assert.assertTrue(text.contentEquals("THANKYOU FOR THE ORDER."));
		
		
	}
}


