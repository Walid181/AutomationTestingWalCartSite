package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Driversetup;

public class TC001 extends Driversetup {
	String baseUrl="https://www.walcart.com/customer/account/login/referer/aHR0cHM6Ly93d3cud2FsY2FydC5jb20v/";
	
	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement element1=driver.findElement(By.id("mobile"));
		element1.sendKeys("01913939942");
		WebElement element2=driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[3]/div[1]/button[1]/span[1]"));
		element2.click();
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Ab1234cc");
		WebElement signIn=driver.findElement(By.xpath("//body/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/button[1]"));
		signIn.click();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(3000);
		
		
		WebElement aircondition=driver.findElement(By.xpath("//a[contains(text(),'এয়ার কন্ডিশনার')]"));
		aircondition.click();
		Thread.sleep(4000);
		
		WebElement product=driver.findElement(By.className("product-item-link"));
        product.click();
		Thread.sleep(2000);
        
        JavascriptExecutor js2=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,300)");
		Thread.sleep(3000);
        
        WebElement addtocart=driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
        addtocart.click();
        Thread.sleep(4000);
        
        WebElement cart=driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]/span[1]"));
        cart.click();
        Thread.sleep(2000);
        WebElement checkout=driver.findElement(By.id("top-cart-btn-checkout"));
        checkout.click();
        Thread.sleep(5000);
        
        WebElement next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        next.click();
        Thread.sleep(2000);
        
        
	
	
	
	
	
	}

}

