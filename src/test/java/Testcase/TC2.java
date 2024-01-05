package Testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRespository.HomepageOR;
import objectRespository.TestingFormPageOR;
import utilites.Baseclass;

public class TC2 extends Baseclass {
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
	TestingFormPageOR.formfill("Chetan", "Raskar", "Nashik", "India", "male", "football");
	Thread.sleep(3000);
	alertaction("ok");
}

}
