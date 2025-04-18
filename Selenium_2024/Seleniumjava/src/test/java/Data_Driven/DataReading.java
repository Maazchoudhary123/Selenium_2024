package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReading {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Public\\Eclipse_workspace\\Selenium_2024\\Seleniumjava\\TestData\\Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sh");
		int totalrow=sheet.getLastRowNum();
		int totalcell=sheet.getRow(1).getLastCellNum();
		System.out.println(totalrow);
		System.out.println(totalcell);
		
	}

}
