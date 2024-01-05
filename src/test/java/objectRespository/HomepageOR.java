package objectRespository;

import org.openqa.selenium.By;

import utilites.Baseclass;


public class HomepageOR  extends Baseclass {
	
public static By testingFormPage = By.xpath("//a[contains(text(), 'Testing Form Page')]");


public static By ShortWait= By.xpath("//a[contains(text(), 'Short Wait')]");



public static By LongWait= By.xpath("//a[contains(text(), 'Long Wait')]");

public static void clickTestingFormpage() {
	
	click(testingFormPage);
}
public static void clicklongwait() {
	
	click(LongWait);
}

}
