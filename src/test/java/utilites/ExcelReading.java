package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {
	public static Workbook wb;
	public static Sheet sh;
	
	public static void setupExcel(String path,String sheetName) throws Exception {

	//file location to allows system to the get  data from it
	FileInputStream fis = new FileInputStream("C:\\selenium project\\Project1\\src\\test\\java\\dataset\\Book2.xlsx");
	//open workbook
	wb = WorkbookFactory.create(fis);
	//declare the sheet you want use to reading
 sh = wb.getSheet("Sheet1");

	}
	public static String getData(int row,int col) {
		String dataSet = sh.getRow(row).getCell(col).toString();
		return dataSet;
	}
}
