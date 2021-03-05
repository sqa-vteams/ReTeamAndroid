package TestClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Classes.TopicOfTheDay;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class TopicOfTheDayTest extends BaseClass {
	public AppiumDriver<MobileElement> driver;
	
	@Test
	@Parameters({"topicValue"})
	public void TestTopicOfTheDay(String topicValue) {
		TopicOfTheDay objTopic = new TopicOfTheDay(driver);
		objTopic.topicFieldSelection();
		objTopic.bottomSheetSelection();
		objTopic.addTopic(topicValue);
	}
}
