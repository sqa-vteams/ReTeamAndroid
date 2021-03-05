package TestClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Classes.BrightIdeas;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;



public class BrightIdeaTest extends BaseClass {
	
	public AppiumDriver<MobileElement> driver;

	@Test
	@Parameters({ "ideaInputField"})
	public void TestBrightIdea(String ideaInputField)
	{
		BrightIdeas objIdea = new BrightIdeas(driver);
		objIdea.moreSelection();
		objIdea.IdeaSelection();
		objIdea.colorSelection();
		objIdea.IdeaInputField(ideaInputField);
		objIdea.addMedia();
		objIdea.postIdea();
		objIdea.closePopUp();

	}
}
