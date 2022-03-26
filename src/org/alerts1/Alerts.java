package org.alerts1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	 public static void main(String[] args) throws InterruptedException {
			
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace 1\\org.Test\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			WebElement al = driver.findElement(By.id("promtButton"));
			al.click();
			Thread.sleep(3000);
			Alert text = driver.switchTo().alert();
			String text2 =text.getText();
			System.out.println(text2);
			Thread.sleep(2000);
			driver.switchTo().alert().sendKeys("naveen");
			Thread.sleep(5000);
			text.accept();
			
			WebElement alr = driver.findElement(By.xpath("//span[text()='naveen']"));
			String s = alr.getText();
			System.out.println(s);
			
			
	}
	}


