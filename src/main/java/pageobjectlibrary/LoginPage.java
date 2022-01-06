package pageobjectlibrary;

import locatorobjectrepo.LoginPageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject {

    @Step("Open broswer")
    public void open_and_navigate() {
        open();
    }

    @Step("Enter Username")
    public void Enter_Username(String username) {
        $(LoginPageLocators.LOGIN_PAGE_USERNAME).sendKeys(username);
    }

    @Step("Enter Password")
    public void Enter_Password(String password) {
        $(LoginPageLocators.LOGIN_PAGE_PASSWORD).sendKeys(password);
    }

    @Step("Enter Password")
    public void Enter_Button() {
        $(LoginPageLocators.LOGIN_PAGE_BUTTON).click();
    }

}
