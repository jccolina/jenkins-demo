package training.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Suite1Test 
{
    @Test
    public void testInputForm()
    {
    	System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
    	WebDriver driver = new EdgeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
    	driver.findElement(By.cssSelector("#firstname")).sendKeys("Jose");
    	driver.findElement(By.cssSelector("#surname")).sendKeys("Perez Gonzales");
    	driver.findElement(By.cssSelector("#age")).sendKeys("27");
    	driver.findElement(By.cssSelector("#notes")).sendKeys("Testing...");
    	driver.findElement(By.cssSelector("[type='submit']")).click();
    	sleep(5000);
    	driver.quit();
    	
    }
    
    public void sleep(long time) {
    	try {
    		Thread.sleep(time);
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
