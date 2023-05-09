package test;

import org.testng.annotations.Test;

public class homepagetest extends basetest {
	@Test
	public void Homepagetest() {
		gethomepage();
		hp.clickOnButton();
	}

}
