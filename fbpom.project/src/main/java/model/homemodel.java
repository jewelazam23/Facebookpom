package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homemodel extends basemodel {

	public homemodel(WebDriver d) {
		super(d);
	
	}
	public WebElement getbutton() {
     WebElement d= Driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
    		return d;
}
}