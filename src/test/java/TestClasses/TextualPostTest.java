package TestClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Classes.TextualPost;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class TextualPostTest extends BaseClass {
	public AppiumDriver<MobileElement> driver;
	
	@Test
	@Parameters({"textPostInput"})
	public void TestTextualPost(String textPostInput)
	{
		TextualPost objTPost = new TextualPost(driver);
		objTPost.addText(textPostInput);
		objTPost.sendPost();
	}

}
