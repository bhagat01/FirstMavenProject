package com.org.learningMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public void Login() {
		System.out.println("Searching for HP laptop");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hp spectre");
		driver.findElement(By.className("nav-input")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
