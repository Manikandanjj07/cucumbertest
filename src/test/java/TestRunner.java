import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
				
				monochrome=true,
				plugin="html:target",
				dryRun=false,
				tags={"@Mobile","@TV"})
			
public class TestRunner {
}
