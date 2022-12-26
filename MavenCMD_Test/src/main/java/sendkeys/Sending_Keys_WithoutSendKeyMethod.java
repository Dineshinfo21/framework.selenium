package sendkeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sending_Keys_WithoutSendKeyMethod {
	
	@Test
	public void withoutsendkey()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement sendUS = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='dk@gmail.com'", sendUS);
	}

}
