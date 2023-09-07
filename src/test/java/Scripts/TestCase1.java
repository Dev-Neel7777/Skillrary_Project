package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import PomPages.AddtocartPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tcl() {
		
		SkillraryLoginPage s= new SkillraryLoginPage(driver);		
			s.gearsbutton();
			s.skillrarydemoapplication();
			utilities.switchingtabs(driver);
			SkillraryDemoLoginPage sd= new SkillraryDemoLoginPage(driver);
			utilities.MouseHover(driver, sd.getCoursetab());
			sd.seleniumtrainingtab();
			AddtocartPage d=new AddtocartPage(driver);
			utilities.doubleClick(driver, d.getAddsign());
			d.addToCart();
			utilities.alter(driver);
		}
	}


