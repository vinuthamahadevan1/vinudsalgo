package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	      features="src/test/resources/feature",
	      glue= {"stepdefinition1","applicationhooks"},
	      plugin= {"pretty","html:target/htmlreport/reports.html"}
		)

public class mytestrunner {

}
