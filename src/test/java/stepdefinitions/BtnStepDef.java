package stepdefinitions;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtre.pageobject.HelpBtnObj;
import com.mindtree.reusablecomponents.ReusableComponents;
import com.mindtree.utility.Log;
import com.mindtree.utility.PropertyFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class BtnStepDef {
	WebDriver driver;
	private Logger log = Log.logger(ProfileEmailVerStepDef.class.getName());


	  @Given("User first goes to the website")
	  public void user_first_goes_to_the_website() {
	      // Write code here that turns the phrase above into concrete actions
			driver =  ReusableComponents.loadDriver();
			driver.get(PropertyFileReader.loadFile().getProperty("url"));
	  }
	    @When("User click on help btn option")
	    public void user_click_on_help_btn_option() {
	        // Write code here that turns the phrase above into concrete actions
	    	HelpBtnObj.help(driver);
	    }

	    @Then("User should be redirected to QA section")
	    public void user_should_be_redirected_to_qa_section() throws Throwable {
	    	System.out.println("Help test case passed");
	    	log.info("Help test case passed");
	    	driver.close();
	    }

    

}