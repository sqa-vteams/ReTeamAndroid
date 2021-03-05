package TestClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Classes.TeamVideo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class TeamVideoTest extends BaseClass {

	public AppiumDriver<MobileElement> driver;
	
	@Test
	@Parameters({"videoTopic"})
	public void TestTeamVideo(String videoTopic) {
		TeamVideo objVideo = new TeamVideo(driver);
		objVideo.moreSelection();
		objVideo.openTeamVideo();
		objVideo.recordVideo();
		objVideo.addTopic(videoTopic);
		objVideo.shareVideo();
		objVideo.closePopUp();
	}
}
