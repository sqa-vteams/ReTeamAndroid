package TestClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Classes.WallOfFame;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class WallOfFameTest extends BaseClass {
	
	public AppiumDriver<MobileElement> driver;
	
	@Test
	@Parameters({ "wallInputField"})
	public void TestWallOfFame(String wallInputField) 
	{
		WallOfFame objWall = new WallOfFame (driver);
		objWall.teamSelection();
		objWall.moreSelection();
		objWall.wallSelection();
		objWall.colorSelection();
		objWall.wallInputField(wallInputField);
		objWall.addMedia();
		objWall.tagMemberSelection();
		objWall.postAnnouncement();
		objWall.closePopUp();

	}

	
	

}
