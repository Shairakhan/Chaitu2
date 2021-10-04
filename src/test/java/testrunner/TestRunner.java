package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(
    features = {"src/test/resources"},
    glue= {"Stepdef"},
    plugin ={"Preety","html:target/Report.html"}

)




public class TestRunner
{
}
