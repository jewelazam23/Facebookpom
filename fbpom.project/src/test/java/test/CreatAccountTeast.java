package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelRead;



public class CreatAccountTeast extends basetest {
	@Test(dataProvider="fb")
	public void creataccounttest(String a,String b,String c,String d,String e,String f) throws InterruptedException {
		gethomepage();
		hp.clickOnButton();
		getaccountpage();
		ca.typefirstname(a);
		ca.typelaststname(b);
		ca.typemobilenumber(c);
		ca.typemonth(d);
		ca.selectgender(e);
	}
	@DataProvider(name="fb")
    public Object [][]getData() throws IOException{
	 Object[][]t;
	 String filename="data/fb.xlsx";
	 String Sheetname ="Sheet1";
	 ExcelRead ex = new ExcelRead(filename,Sheetname);
	t=ex.excelToArray();
	return t;
	}

}
