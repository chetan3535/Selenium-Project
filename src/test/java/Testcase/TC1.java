package Testcase;

import objectRespository.HomepageOR;
import objectRespository.TestingFormPageOR;
import utilites.Baseclass;

public class TC1 extends Baseclass{

	public static void main(String[] args) {
		openBroswer("chrome");
		openbaseurl();
		HomepageOR.clickTestingFormpage();
		TestingFormPageOR.formfill("Shivani","Raskar", "Nashik","Bangladesh", "female", "hockey");
		
		
	}

}
