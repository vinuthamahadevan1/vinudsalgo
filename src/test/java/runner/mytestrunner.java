package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	      features="src/test/resources/config/home.feature",
	      glue= {"stepdefinition1","applicationhooks"},
	      plugin= {"pretty","html:target/htmlReports/Report.html"}
		)

public class mytestrunner {

}
