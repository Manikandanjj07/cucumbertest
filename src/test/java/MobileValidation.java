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
import com.flipkart.objectrepostry.validationpage;
import com.flipkart.resources.CommomActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class MobileValidation extends CommomActions {
	CommomActions c =new CommomActions();
	validationpage v =new validationpage();
	@Given("lauching Flipkart")
	public void lauching_Flipkart() {	}
	String name="";
	@Given("login {string}, {string}")
	public void login(String user, String pass) {
	/*  driver.findElement(By.xpath("(//div/input[@type='text'])[2]")).sendKeys(user,Keys.TAB);
    driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys(pass,Keys.ENTER); */
	v.getCloseclick().click();
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@When("search mobile {string}")
	public void search_mobile(String str) {
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	name =str;
	c.insertText(v.getSea(), name);
	}
	@When("click first product")
	public void click_first_product() {
 	c.clickfirstprodcut(name);
 	}
	@When("window handles")
	public void window_handles() throws Exception {
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
 	c.windowsHandling();
 	c.screenshot(name);	
 }
	@Then("browser close")
	public void browser_close() {
	driver.quit();
 	}}