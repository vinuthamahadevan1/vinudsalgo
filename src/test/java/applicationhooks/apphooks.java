package applicationhooks;


import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.utility.configreader;

import Factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class apphooks {
private Driverfactory driverfactory;
private WebDriver driver;
private configreader Configreader;
Properties prop;

@Before(order=0)
public void getproperty() {
		Configreader=new configreader();
	prop=Configreader.init_prop();
}
@Before(order=1)
public void launchbrowser() {
	String browsername=prop.getProperty("browser");
	driverfactory=new Driverfactory();
	driver=driverfactory.init_driver(browsername);
	
}
@After(order=0)
public void quitbrowser() {
	driver.quit();
}
@After(order=1)
public void teardown(Scenario scenario){
	if(scenario.isFailed()) {
		String screenshotname=scenario.getName().replaceAll("", "_");
		byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcepath, "image/png", screenshotname);
	}
	
}
}
