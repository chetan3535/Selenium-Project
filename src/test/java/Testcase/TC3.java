package Testcase;

import org.testng.annotations.Test;

import objectRespository.HomepageOR;
import objectRespository.TestingFormPageOR;
import objectRespository.TestingFormPageOR_PF;
import utilites.Baseclass;

public class TC3 extends Baseclass {
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
	TestingFormPageOR_PF tpfor = new TestingFormPageOR_PF(driver);
	tpfor.formfill("Shivani", "Raskar");
	//Thread.sleep(5000);
	//alertaction("ok");
}

}
