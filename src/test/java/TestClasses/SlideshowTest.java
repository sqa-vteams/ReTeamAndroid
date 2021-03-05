package TestClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Classes.Slideshow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class SlideshowTest extends BaseClass {
	
	public AppiumDriver<MobileElement> driver;
	
	@Test
	@Parameters({"slideshowTopic"})
	public void TestSlideshow (String slideshowTopic) 
	{
		Slideshow objSlideshow = new Slideshow(driver);
		objSlideshow.moreSelection();
		objSlideshow.openSlideshow();
		objSlideshow.imageCapture();
		objSlideshow.addTopic(slideshowTopic);
		objSlideshow.shareSlideshow();

	}

}
