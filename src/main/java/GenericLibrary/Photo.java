package GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.Date;

//import sun.util.calendar.LocalGregorianCalendar.Date;

public class Photo {
	
	public void getPhoto(WebDriver driver, String name) throws Throwable {
	
	Date d=new Date();
	String currentdate= d.toString().replaceAll(":", "-");
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(IPathConstant.photopath+currentdate+name+".png");
	FileUtils.copyFile(src, dest);
	

}
}
