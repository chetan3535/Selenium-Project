package Testcase;

import org.testng.annotations.Test;

import objectRespository.HomepageOR;
import objectRespository.TestingFormPageOR;
import utilites.Baseclass;
import utilites.ExcelReading;

public class TC6 extends Baseclass {
	String path ="C:\\selenium project\\Project1\\src\\test\\java\\dataset\\Book2.xlsx";
	String sheet ="Sheet1";
	
	@Test(priority = 0)
	public void presetup() {
		openBroswer("chrome");
		openbaseurl();
		
	}
	@Test(priority = 1)
	public void navigateFormpage(){
		HomepageOR.clickTestingFormpage();
		}
@Test(priority = 2)
public void formfill() throws Exception
{
	Thread.sleep(3000);
	ExcelReading.setupExcel("path", "sheet");
	TestingFormPageOR.formfill(ExcelReading.getData(0, 0),
			ExcelReading.getData(0, 1),
			ExcelReading.getData(0, 2),
			ExcelReading.getData(0, 3),
			ExcelReading.getData(0, 4),
			ExcelReading.getData(0, 5));
	Thread.sleep(3000);
	alertaction("ok");
}

}
