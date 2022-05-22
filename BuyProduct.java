package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BuyProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ppatkar\\Documents\\drivers\\Jar files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      
        //1. Open link http://automationpractice.com/index.php
        
        driver.get("https://automationpractice.com/index.php");
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
      //2. Login to the web-site.
        
       WebElement signin =  driver.findElement(By.linkText("Sign in"));
       signin.click();
       
       WebElement email =  driver.findElement(By.id("email"));
       email.sendKeys("patkar0208@gmail.com");
       WebElement password =  driver.findElement(By.id("passwd"));
       
       password.sendKeys("priya@123");
       WebElement loginbtn = driver.findElement(By.id("SubmitLogin"));
       loginbtn.click();
       
     //Move your cursor over Women's link
       
       WebElement womenbtn =  driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]"));
       
       Actions action = new Actions(driver);
  	 
		 action.moveToElement(womenbtn).build().perform();
		 Thread.sleep(1000);
		
		 //4. Click on sub menu 'T-shirts'.
		 
		 
		 WebElement tshirt =  driver.findElement(By.linkText("T-shirts"));
		 tshirt.click();
		 
		
		//5. Mouse hover on the second product displayed.
		 
		 WebElement product =  driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		 
		 action.moveToElement(product).build().perform();
		
		 //6. 'More' button will be displayed, click on 'More' button.
		
		 WebElement more =  driver.findElement(By.linkText("More"));
		 more.click();
		//7. Increase quantity to 2.
         WebElement plusbtn =  driver.findElement(By.className("icon-plus"));
		 plusbtn.click();
		//8. Select size 'L'
		 
		 WebElement size =  driver.findElement(By.id("group_1"));
		 
		 Select selectpro = new Select(size);
		 
		 selectpro.selectByVisibleText("L");
		 
		 //9. Select colour.
		 
		 WebElement color =  driver.findElement(By.id("color_14"));
		 color.click();
		//10. Click 'Add to Cart' button.
		 
		 WebElement addtocart =  driver.findElement(By.id("add_to_cart"));
		 addtocart.click();
		//11. Click 'Proceed to checkout' button.
		 WebElement checkout =  driver.findElement(By.xpath("//div[@id='layer_cart']//a[@title='Proceed to checkout']"));
		 checkout.click();
		 
		 WebElement checkout2 = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"));
		   checkout2.click();
		    Thread.sleep(3000);
		    
		    System.out.println("Automation Successful");
			driver.close();
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		
		 
		 
		 
       
       
       
       
       
       
       
        
       

	}

}
