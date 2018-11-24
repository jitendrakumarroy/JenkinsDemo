package JenkinsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkinsdemo {

	@Test
	public void jenkinsDemo() throws InterruptedException {

		System.out.println("Welcome to Jenkins World");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jitendra.r@bravvura.in");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Jitendra@26");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	

	}
}
