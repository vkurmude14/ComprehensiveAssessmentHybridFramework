package stepdefinitions;



import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtre.pageobject.SignUpObj;
import com.mindtree.reusablecomponents.ReusableComponents;
import com.mindtree.utility.PropertyFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SignUpStepDef {
	WebDriver driver;

	@Given("User first opens the website")
    public void user_first_opens_the_website() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Going to homepage");
		driver =  ReusableComponents.loadDriver();
		driver.get(PropertyFileReader.loadFile().getProperty("url"));
    }

    @When("User click on sign up option")
    public void user_click_on_sign_up_option() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	Thread.sleep(10000);
    	System.out.println("When");
    }
    @Then("^User should fill the (.*) and (.*) click sign up button$")
    public void User_should_fill_the_emailid_and_password_click_sign_up_button(String emailid,String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Sign Up test Success");
    	SignUpObj.signUp(driver, emailid, password);
    	System.out.println(emailid);
    	System.out.println(password);
    	driver.close();
    }

    

}