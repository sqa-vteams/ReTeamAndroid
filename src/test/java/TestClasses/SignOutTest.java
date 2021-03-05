package TestClasses;

import org.testng.annotations.Test;

import Classes.SignOut;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class SignOutTest extends BaseClass {
	
	public AppiumDriver<MobileElement> driver;
	
	
	@Test
	public void TestSignOut()
	{
		SignOut objSignOut = new SignOut(driver);
		objSignOut.tapBack();
		objSignOut.DrawerTap();
		objSignOut.SignOutTap();
		objSignOut.Alert();
	}

}
