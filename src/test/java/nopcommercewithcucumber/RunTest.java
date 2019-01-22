package nopcommercewithcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@sortBy,  @termsAndCondition,  @buyProduct, " +
        "@emailAProduct, @canNotEmailAProduct, @registration",
format = {"pretty","html://target/cucumber-reports"})

public class RunTest {


}
