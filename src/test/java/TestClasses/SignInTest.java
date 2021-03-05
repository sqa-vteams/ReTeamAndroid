package TestClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Classes.SignIn;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class SignInTest extends BaseClass{
	public AppiumDriver<MobileElement> driver;
	
	@Test
	@Parameters({ "emailField", "passwordField" })
	public void TestSignIn( String emailField, String passwordField) 
	{
		SignIn objSignIn = new SignIn (this.driver);
		objSignIn.emailField(emailField);
		objSignIn.passwordField(passwordField);
		objSignIn.signInClick();
		objSignIn.signInValidation();
	}

}
