package runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(tags="@login_Validation",features="src/main/resources/Features/",glue="stepdefenitions")

public class TestRunner {
}
