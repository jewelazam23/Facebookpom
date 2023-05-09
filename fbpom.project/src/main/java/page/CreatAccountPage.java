package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreatACcountModel;

public class CreatAccountPage extends CreatACcountModel {
	public CreatAccountPage (WebDriver y ) {
		super (y);

}
	public void typefirstname(String s) throws InterruptedException {
		WebElement z=	getfirstname();
		z.sendKeys(s);
	}
	public void typelaststname(String t) throws InterruptedException {
		WebElement z=	getlastname();
		z.sendKeys(t);
	}
	public void typemobilenumber(String u) throws InterruptedException {
		WebElement z=	getmobilenumber();
		z.sendKeys(u);
	}
	public void typemonth(String q) throws InterruptedException {
		WebElement z=	selectmonth();
		Select sel = new Select(z);
		sel.selectByVisibleText(q);
		
	}
	public void selectgender(String t) throws InterruptedException {
		if (t.toLowerCase().equals("male")) {
			WebElement z =	 getmale();
			z.click();
		
	}
		 else if (t.equals("Female")) {
			 WebElement z =	 getfemale();
				z.click();
		 }
		 else {WebElement z = getcoustom();
		 z.click();
		 }
	}
	
}
