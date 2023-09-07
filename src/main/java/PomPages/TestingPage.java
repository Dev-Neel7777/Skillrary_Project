package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	//Declaration
	//address to selenium training 
	@FindBy(id="Selenium Training")
	private WebElement seleniumtrainingelement;
	
	//address to mycart 
	
	@FindBy(id="cartArea")
	private WebElement carttab;
	
	//address to facebook
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebooktb;
	
	//Initialization
	
	public void SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//Utilization
	
	public void Facebook() {
		facebooktb.click();
	}

	public WebElement getSeleniumtrainingelement() {
		return seleniumtrainingelement;
	}

	

	public WebElement getCarttab() {
		return carttab;
	}


}
