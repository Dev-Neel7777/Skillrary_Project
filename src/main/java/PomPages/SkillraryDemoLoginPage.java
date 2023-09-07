package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	
	//Declaration
	//address of course
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of selenium training
	@FindBy(xpath="(//a [text ()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//address of drop down
	@FindBy(name="addresstype")
	private WebElement courseadd;
	
	
	//Initialization 
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getCoursetab() {
		return coursetab;
	}
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}
	
	public WebElement getCourseadd() {
		return courseadd;
	}
	

}
