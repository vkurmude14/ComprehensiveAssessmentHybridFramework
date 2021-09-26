package stepdefinitions;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtre.pageobject.SubscribeObj;
import com.mindtree.reusablecomponents.ReusableComponents;
import com.mindtree.utility.Log;
import com.mindtree.utility.PropertyFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StoreVerifyStepDef {
	WebDriver driver;
	private Logger log = Log.logger(ProfileEmailVerStepDef.class.getName());

    @Given("^User first visits urbanladder$")
    public void user_first_visits_urbanladder() throws Throwable {
    	driver =  ReusableComponents.loadDriver();
		driver.get(PropertyFileReader.loadFile().getProperty("url"));
    }

    @When("^enters (.+) and clicks on subscribe button$")
    public void enters_and_clicks_on_subscribe_button(String email) throws Throwable {
        SubscribeObj.Subscribe(driver, email);
    }

    @Then("^User should be subscribed$")
    public void user_should_be_subscribed() throws Throwable {
        log.info("Subscribed");
        driver.close();
    }

    

}