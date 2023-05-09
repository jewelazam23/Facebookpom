package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.homemodel;

public class Homepage extends homemodel {
	public Homepage(WebDriver d) {
		super(d);
	
	}
   public void clickOnButton() {
	   WebElement g=getbutton();
	   g.click();
   }

	
}

