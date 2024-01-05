package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.Baseclass;

public class TestingFormPageOR_PF extends Baseclass{
	public TestingFormPageOR_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//input[@id='ts_first_name']")
WebElement fName;
@FindBy(xpath = "//input[@id='ts_last_name']")
WebElement lName;
public void formfill(String fname,String lname){
	enterTxt(fName, fname);
	enterTxt(lName, lname);
	
}
}
