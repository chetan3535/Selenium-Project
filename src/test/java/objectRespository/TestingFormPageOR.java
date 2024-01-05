package objectRespository;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utilites.Baseclass;

public class TestingFormPageOR extends Baseclass  {
	
	public static By fName = By.xpath("(//input[@id='ts_first_name'])");
	
	public static By lName = By.xpath("(//input[@id='ts_last_name'])");
	
	public static By address = By.xpath("(//textarea[@id='ts_address'])");
	
	public static By nationality = By.xpath("(//select[@id='ts_country'])");
	
	public static By male = By.xpath("(//*[@value='male'])");
	
	public static By female = By.xpath("(//*[@value='female'])");
	
	public static By cricket = By.id("ts_checkbox1");
	
	public static By football = By.id("ts_checkbox2");	
	public static By hockey = By.id("ts_checkbox3");	
	public static By submit = By.name("Submit1");
	
	public static By pageheading = By.xpath("(//strong[contains(text(),'Automation Testing Form')");

	public static void formfill(String fname, String lname, String add,  String citizen, String gender, String interest)
	{
		
		enterTxt(fName, fname);
		enterTxt(lName, lname);
		enterTxt(address, add);
		select(nationality, citizen);
		if(gender.equalsIgnoreCase("male")){
		   click(male);
			
				}
			else if(gender.equalsIgnoreCase("female")){

			click(female);
				}else {
		System.out.println("invalid input:- "+ gender);
		
	}
	if(interest.equalsIgnoreCase("cricket")){
		   click(cricket);
			
				}
			else if
				
			(interest.equalsIgnoreCase("hockey"))
			{
			click(hockey);
				}
			else if(interest.equalsIgnoreCase("football")) {
			click(football);	
			}
			 else {
				System.out.println("invalid input"+interest);
				
			}
        	click(submit);
	}
	}