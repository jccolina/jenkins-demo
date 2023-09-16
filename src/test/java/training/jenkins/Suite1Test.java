package training.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Suite1Test 
{
	String browser = System.getProperty("browser");
	WebDriver driver;
    @Test
    public void testInputForm() throws Exception
    {
    	if(browser.equals("edge")) {
        	System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        	driver = new EdgeDriver();
    	} else if(browser.equals("firefox")) {
        	System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
        	driver = new FirefoxDriver();
    	} else {
    		throw new Exception("No valid driver provided.");
    	}
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
