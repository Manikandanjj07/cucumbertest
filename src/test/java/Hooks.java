import java.time.LocalTime;

import com.flipkart.resources.CommomActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommomActions {
CommomActions c = new CommomActions();
	@Before
	public void beforeScene()
	{
		LocalTime now = java.time.LocalTime.now();
		System.out.println("Starts time: " +now);
		c.launch("https://www.flipkart.com/");
		
	}

	@After
	public void afterScene()
	{
		LocalTime now = java.time.LocalTime.now();
		System.out.println("Ends time: " +now);
	}
}
