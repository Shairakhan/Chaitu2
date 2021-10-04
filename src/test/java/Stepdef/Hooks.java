package Stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DriverFactory;

public class Hooks

{
    @Before
    public void setUp()
    {
        DriverFactory.getDriver();
    }

    @After
    public void tearDown()
    {
       //if(scenario.isFailed())
       //    final byte[] screenshot =((TakesScreenshot)DriverFactory.driver).getScreenshotAs(OutputType.BYTES);
      // scenario.attach(screenshot,"image/png","screenshot");

        DriverFactory.driver.close();


    }
}
