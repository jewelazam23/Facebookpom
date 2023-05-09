package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import page.CreatAccountPage;
import page.Homepage;

public class basetest {
	static WebDriver  driver;
	static Homepage hp;
	static CreatAccountPage ca;
	@BeforeTest
	public void setup() {
		
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https:facebook.com");
	}
	
		
	
   public void gethomepage(){
	   hp=new Homepage(driver) ;
   }
  public void getaccountpage() {
	  ca = new CreatAccountPage(driver);
  }
}
