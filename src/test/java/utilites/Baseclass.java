package utilites;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Baseclass {
	public static WebDriver driver;
	//browser
	public static void openBroswer(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")){
	    driver= new ChromeDriver();
		System.out.println(browserName +"browser is up and running ");
			}
		else if(browserName.equalsIgnoreCase("Edge")){

		driver = new EdgeDriver();
			System.out.println(browserName +"browser is up and running ");
		}
		else if(browserName.equalsIgnoreCase("Firefox")){
         driver = new FirefoxDriver();
		 System.out.println(browserName +"browser is up and running ");
		}
		else
		{

			System.out.println("unabale to launch " +browserName +"browser"+ "Invalid input");
		}
	}
	    
	
	//aut
	public static void openbaseurl() {
		try {
			driver.get("https://seleniumautomationpractice.blogspot.com/");

			System.out.println("Application is up and running ");
		} catch(Exception e) {

			System.out.println("unabel to open url "+e.getMessage());
		}
	}
		
		public static void navigateURL(String url) {
			try {
				driver.navigate().to("https://seleniumautomationpractice.blogspot.com/");
				driver.get("");

				System.out.println("Application is up and running ");
			} catch(Exception e) {

				System.out.println("unabel to open url "+e.getMessage());
			}
	}
				
	
	
	//click
public static void click(By locValue) {

try {

	driver.findElement(locValue).click();
	System.out.println("clicked on  the element having locValue"+locValue );
}
catch(Exception e) {
	System.out.println("Unable to clicked on  the element having locValue"+locValue );
	
}	
}
//type
public static void enterTxt(By locValue, String data) {

try {

	driver.findElement(locValue).clear();
    driver.findElement(locValue).sendKeys(data);
	

	System.out.println("Enter  the" +data+" having locValue:-"+locValue );
}
catch(Exception e) {
	System.out.println("Unable to clicked on  the element having locValue"+locValue);
}
}
public static void enterTxt(WebElement element, String data) {

try {
element.clear();
element.sendKeys(data);


	System.out.println("Enter  the" +data+" having locValue:-"+element );
}
catch(Exception e) {
	System.out.println("Unable to clicked on  the element having "+element);
}
}
	//select
public static void select(By locName, String data) {

try {

new Select(	driver.findElement(locName)).selectByVisibleText(data);
   
	System.out.println("select  the" +data+" having locValue:-" +locName);
}
catch(Exception e) {
	System.out.println("Unable to clicked on  the element having locValue" +locName);
}
}
public static void select(By locName,int no) {
	
	try { 
		new Select(	driver.findElement(locName)).selectByIndex(no);
		   
			System.out.println("select  the" +no+" having locValue:-" +locName);
		}
		catch(Exception e) {
			System.out.println("Unable to clicked on  the element having locValue" +locName);
		}
		}



	//shutdown
	//wait
public static void waitaction(){
	

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
	//alert
	
public static void alertaction(String action) {
	
	try { 
		if (action.equalsIgnoreCase("ok")) {
		System.out.println(	driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); }
		else if(action.equalsIgnoreCase("cancel")){
			driver.switchTo().alert().dismiss();
			
		}
		}
		catch(Exception e) {
			System.out.println("Error performing action on alert box" +action+"fail");
		}
}
}
