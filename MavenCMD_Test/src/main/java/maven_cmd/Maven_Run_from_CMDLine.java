package maven_cmd;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Maven_Run_from_CMDLine {
	
	@Test
	public void maven_() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		String actual=driver.switchTo().alert().getText();
		System.out.println(actual);
		Alert alt= driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		System.out.println("Test Runned Successfully");
		driver.close();
	}
}