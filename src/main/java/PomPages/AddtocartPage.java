package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	
	//Declaration
	//address to add to cart
	
	@FindBy(xpath="(//button [@type='submit'])[2]")
	private WebElement addtocart;
	
	//address to plussign
	@FindBy(id="add")
	private WebElement addsign;
	
	//Initialization
	
	

	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getAddsign() {
		return addsign;
	}
	
	public void addToCart() {
		addtocart.click();
		
	}	
	

}
