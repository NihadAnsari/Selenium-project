package com.test;
import java.io.File;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
public class WorkingWithForms {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("file:H:\\Selenium project\\WorkingWithForms.html");
		
		//Find Username textbox and enter value
		driver.findElement(By.id("txtUserName")).sendKeys("Nihad07");

		//Find Password textbox and enter value
		driver.findElement(By.name("txtPwd")).sendKeys("Jam31");
		

		//Find Confirm Password textbox and enter value
		driver.findElement(By.className("Format")).sendKeys("Jam31");
		
		//Find First Name textbox and enter value
		driver.findElement(By.cssSelector("input.Format1")).sendKeys("Nihad");
		
		//Find Last Name textbox and enter value
		driver.findElement(By.name("txtLN")).sendKeys("Ansari");
		
		//Find Gender radio button and enter value
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		
		//Find Date Of Birth textbox and enter value
		driver.findElement(By.name("DtOB")).sendKeys("07/06/2000");
		
		//Find Email textbox and enter value
		driver.findElement(By.name("Email")).sendKeys("nihad.jawed.ansari@gmail.com");
		
		//Find Address textbox and enter value
		driver.findElement(By.name("Address")).sendKeys("Mahape");

		Select drpCity = new Select(driver.findElement(By.name("City")));
		//drpCity.selectByVisibleText("Mumbai");
		
		drpCity.selectByVisibleText("Mumbai");
		drpCity.selectByIndex(1);
		drpCity.selectByIndex(2);
		
		//Find Phone textbox and enter value
		driver.findElement(By.xpath("//*[@id=\"txtPhone\"]")).sendKeys("9359878514");
		
		List<WebElement> element = driver.findElements(By.name("checkHobbies"));
		
		for (WebElement webElement : element)
		{
			webElement.click();
			
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}			
		}
		
        		//Examples of Get commands
		
				String Title;
				Title=driver.getTitle();
				System.out.println("The page title is :" + Title);
				
				Boolean b =  driver.getPageSource().contains("Email Registration Form");
				
				if(b==true)
				{
					System.out.println("U got the right title");
				}
				else
				{
					System.out.println("Sorry .... Wrong title");
				}

				String currentURL;
				currentURL = driver.getCurrentUrl();
				System.out.println("The page current URL is :" + currentURL);
						
				//Find Submit button
				driver.findElement(By.name("submit")).click();
				driver.close();
				//driver.quit();

	}

}
