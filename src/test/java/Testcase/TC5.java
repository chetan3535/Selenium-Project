package Testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRespository.HomepageOR;
import objectRespository.TestingFormPageOR;
import utilites.Baseclass;

public class TC5 extends Baseclass {
	@Test(priority = 0)
	public void presetup() {
		openBroswer("chrome");
		openbaseurl();
		
	}
	@Test(priority = 1)
	public void navigateFormpage(){
		HomepageOR.clickTestingFormpage();
		}
@Test(priority = 2,dataProvider = "supplyData")
public void formfill(String fname,String lname,String add,String citizen,String gender,String interest) throws Exception
{
	TestingFormPageOR.formfill(fname, lname, add, citizen, gender, interest);
	Thread.sleep(3000);
	alertaction("ok");
}
@DataProvider
public Object[][] supplyData() throws Exception
{
	//file location to allows system to the get  data from it
	FileInputStream fis = new FileInputStream("C:\\selenium project\\Project1\\src\\test\\resources\\Book2.xlsx");
	//open workbook
	Workbook wb = WorkbookFactory.create(fis);
	//declare the sheet you want use to reading
Sheet sh = wb.getSheet("Sheet1");

int norows =sh.getLastRowNum();//9+1=10
int nocols = sh.getRow(1).getLastCellNum();//5+1=6

Object[][] dataSet = new Object[norows][nocols];
for(int row=0;row<norows;row++) {
	for(int col=0;col< nocols;col++) {
		System.out.println("row = "+ row + "column = " + col);
		dataSet[row][col]=sh.getRow(row).getCell(col).getStringCellValue().toString();
	}
}
return dataSet;
}
}
