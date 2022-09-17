import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepostry.validationpage;
import com.flipkart.resources.CommomActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class TvValidation extends CommomActions{
		CommomActions c = new CommomActions();
		validationpage v = new validationpage();
		@Given("Flipkart launch")
		public void flipkart_launch() {	}
		String name="";
		@Given("sigin {string}, {string}")
		public void sigin(String str1, String str2) {
	  /*  driver.findElement(By.xpath("(//div/input[@type='text'])[2]")).sendKeys(str1,Keys.TAB);
	    driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys(str2,Keys.ENTER); */
		v.getCloseclick().click();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
		@When("Searching Tv {string}")
		public void searching_Tv(String str) {
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		name=str;
		//WebElement fE= driver.findElement(sea);
		c.insertText(v.getSea(), name+" TV");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
		@When("clicking tv")
		public void clicking_tv() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 	c.clickfirstprodcut(name);
	 	}
		@When("Window Handling")
		public void window_Handling() throws IOException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
	 	c.windowsHandling();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]"));
	 	String text = we.getText();
	 	c.screenshot(name);
}
		@Then("browser closee")
		public void browser_closee() {
		driver.quit();
		System.out.println("Browser Closed");
}
		@When("Searching Tv with oneD list")
		public void searching_Tv_with_oneD_list(io.cucumber.datatable.DataTable dataTable) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		List<String> asL= dataTable.asList();
	    name =asL.get(1);
	    driver.findElement(By.name("q")).sendKeys(name+" TV", Keys.ENTER);	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
		@When("Searching Tv with oneD map")
		public void searching_Tv_with_oneD_map(io.cucumber.datatable.DataTable dataTable) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Map<Integer, String> asM = dataTable.asMap(Integer.class, String.class);
	    name = asM.get(1);
	    System.out.println(name);
		driver.findElement(By.name("q")).sendKeys(name+" TV", Keys.ENTER);	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}}