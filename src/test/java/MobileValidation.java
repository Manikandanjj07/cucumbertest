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
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobileValidation {
	public static WebDriver driver;
	@Given("lauching Flipkart")
	public void lauching_Flipkart() {
		System.out.println("Task Start");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DD\\workspace\\Cucumbertest\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	String name="";

	@Given("login {string}, {string}")
	public void login(String user, String pass) {
	
	    driver.findElement(By.xpath("(//div/input[@type='text'])[2]")).sendKeys(user,Keys.TAB);
	    driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys(pass,Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@When("search mobile {string}")
	public void search_mobile(String str) {
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		name =str;
		driver.findElement(By.name("q")).sendKeys(name, Keys.ENTER);
		}

	@When("click first product")
	public void click_first_product() {
	 	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	 	System.out.println("SWITCHING TAB");
	 	driver.findElement(By.xpath("(//a//div//div//div[contains(text(),'"+name+"')])[2]")).click();
	 	}

	@When("window handles")
	public void window_handles() throws Exception {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
	 	Set<String> wH = driver.getWindowHandles();
	 	List<String> listWindow = new ArrayList<String>(wH);
	 	driver.switchTo().window(listWindow.get(1));
	  	TakesScreenshot ts =(TakesScreenshot)driver;
	 	File src =ts.getScreenshotAs(OutputType.FILE);
	 	File trg = new File("C:\\Users\\DD\\workspace\\Cucumbertest\\target\\1.png");
	 	FileUtils.copyFile(src,trg);
	 		 	}

	@Then("browser close")
	public void browser_close() {
		driver.quit();
	 	}}
