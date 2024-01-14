package PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="Email")
    private WebElement emailTextField;
	@FindBy(id="password")
    private WebElement passwordTextField;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

}
