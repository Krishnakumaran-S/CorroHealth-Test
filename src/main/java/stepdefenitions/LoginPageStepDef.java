
package stepdefenitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pageobjectlibrary.LoginPage;

public class LoginPageStepDef {
    @Steps
    LoginPage loginpage;

    @Given("^Open Browser and Navigate to URL$")
    public void openBrowserAndNavigateToURL() {
      loginpage.open_and_navigate();
    }

    @Then("^Enter username$")
    public void enterUsername() throws Throwable {
        
    }

    @Then("^Enter Password$")
    public void enterPassword() throws Throwable {
        
    }

    @And("^Click Login Button$")
    public void clickLoginButton() {
        loginpage.Enter_Button();
    }

    @And("^Verify the error message for invalid cred$")
    public void verify(){

    }

}
