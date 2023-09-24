package testCasesAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestCasesScript {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://app.vwo.com/#/login");
    System.out.println( driver.findElement(By.cssSelector("h5#js-sign-in-heading")).getText() ) ;
    driver.findElement(By.id("login-username")).sendKeys("anushjaggia@gmail.com");
    driver.findElement(By.name("password")).sendKeys("34782Anush$");
    driver.findElement(By.xpath("//button[@onclick='login.login(event)']")).click();
  //  driver.close();
	}

}
