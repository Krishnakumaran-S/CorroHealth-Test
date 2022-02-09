package pageobjectlibrary;

import java.io.IOException;

import cucumber.api.java.en.And;
import excelpackage.ReadXcelFile;
import locatorobjectrepo.LoginPageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject {

    @Step("Open broswer")
    public void open_and_navigate() {
        open();
    }

    @Step("Enter Username")
    public void Enter_Username(String username) throws IOException {
    	String user_name = ReadXcelFile.returnExcelvalue();
        $(LoginPageLocators.LOGIN_PAGE_USERNAME).sendKeys(user_name);
    }

    @Step("Enter Password")
    public void Enter_Password(String password) {
        $(LoginPageLocators.LOGIN_PAGE_PASSWORD).sendKeys(password);
    }

    @Step("Enter Password")
    public void Enter_Button() {
        $(LoginPageLocators.LOGIN_PAGE_BUTTON).click();
    }

    @Step("^Verify the error message for invalid cred$")
    public void verify() {
        String str = $(LoginPageLocators.ERROR_MSG).getText();
        if(str.equals("Invalid"));
    }

    }
