import java.time.LocalTime;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeScene()
	{
		LocalTime now = java.time.LocalTime.now();
		System.out.println("Starts time: " +now);
		
	}

	@After
	public void afterScene()
	{
		LocalTime now = java.time.LocalTime.now();
		System.out.println("Ends time: " +now);
	}
}
