package com.flipkart.resources;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommomActions {
	public static WebDriver driver;
	public void launch(String url)
	{
		System.out.println("Browser Launch");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DD\\workspace\\Cucumbertest\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void insertText(WebElement ele, String txt)
	{
		ele.sendKeys(txt,Keys.ENTER);
	}
	
	public void clickfirstprodcut(String pname){
		driver.findElement(By.xpath("//span[text()='Filters']")).click();
	 	System.out.println("SWITCHING TAB");
	 	driver.findElement(By.xpath("(//a//div//div//div[contains(text(),'"+pname+"')])[1]")).click();
	}
	public void windowsHandling()
	{
		Set<String> wH = driver.getWindowHandles();
	 	List<String> listWindow = new ArrayList<String>(wH);
	 	driver.switchTo().window(listWindow.get(1));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
	 /*	JavascriptExecutor js =(JavascriptExecutor)driver;
	 	js.executeScript("window.scrollBy(0,1000)"); */
	 	
	}
public void screenshot(String fname) throws IOException{
	TakesScreenshot ts =(TakesScreenshot)driver;
 	File src =ts.getScreenshotAs(OutputType.FILE);
 	File trg = new File("C:\\Users\\DD\\workspace\\Cucumbertest\\target\\"+fname+".png");
 	FileUtils.copyFile(src,trg);	

}
}

