import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TvValidation {
	public static WebDriver driver;
	@Given("Flipkart launch")
	public void flipkart_launch() {
		System.out.println("Task Start");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DD\\workspace\\Cucumbertest\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	String name="";
	
	@Given("sigin {string}, {string}")
	public void sigin(String str1, String str2) {
	    driver.findElement(By.xpath("(//div/input[@type='text'])[2]")).sendKeys(str1,Keys.TAB);
	    driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys(str2,Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@When("Searching Tv {string}")
	public void searching_Tv(String str) {
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			name=str;
			driver.findElement(By.name("q")).sendKeys(name, Keys.ENTER);	
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@When("clicking tv")
	public void clicking_tv() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 	//driver.findElement(By.xpath("//span[text()='Filters']")).click();
	 	System.out.println("SWITCHING TAB");
	 	driver.findElement(By.xpath("(//a//div//div//div[contains(text(),'"+name+"')])[1]")).click();
	 	}

	@When("Window Handling")
	public void window_Handling() throws IOException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
	 	Set<String> wH = driver.getWindowHandles();
	 	List<String> listWindow = new ArrayList<String>(wH);
	 	driver.switchTo().window(listWindow.get(1));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		

	 	JavascriptExecutor js =(JavascriptExecutor)driver;
	 		js.executeScript("window.scrollBy(0,1000)");
	 	if(name.equalsIgnoreCase("Vu"))
	 	{
	  	TakesScreenshot ts =(TakesScreenshot)driver;
	 	File src =ts.getScreenshotAs(OutputType.FILE);
	 	File trg = new File("C:\\Users\\DD\\workspace\\Cucumbertest\\target\\vu.png");
	 	FileUtils.copyFile(src,trg);}
	 	if(name.equalsIgnoreCase("Kodak"))
	 	{
	  	TakesScreenshot ts =(TakesScreenshot)driver;
	 	File src =ts.getScreenshotAs(OutputType.FILE);
	 	File trg = new File("C:\\Users\\DD\\workspace\\Cucumbertest\\target\\kodak.png");
	 	FileUtils.copyFile(src,trg);}
	 	if(name.equalsIgnoreCase("TCL"))
	 	{
	  	TakesScreenshot ts =(TakesScreenshot)driver;
	 	File src =ts.getScreenshotAs(OutputType.FILE);
	 	File trg = new File("C:\\Users\\DD\\workspace\\Cucumbertest\\target\\tcl.png");
	 	FileUtils.copyFile(src,trg);}
	}

	@Then("browser closee")
	public void browser_close() {
		driver.quit();
}

}
