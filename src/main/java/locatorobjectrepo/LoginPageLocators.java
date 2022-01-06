package locatorobjectrepo;

import org.openqa.selenium.By;

public class LoginPageLocators {

    public static final By LOGIN_PAGE_USERNAME = By.id("txtUsername");
    public static final By LOGIN_PAGE_PASSWORD = By.id("txtPassword");
    public static final By LOGIN_PAGE_BUTTON = By.id("btnLogin");
    public static final By ERROR_MSG = By.xpath("//*[text()='Invalid credentials']/preceding::input");
}