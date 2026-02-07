package testcases;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData() throws IOException {
		//Open the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./Data/CreateLead.xlsx");
		
		//Open the Worksheet
		//wb.getSheet("Sheet1");
		XSSFSheet ws = wb.getSheetAt(0);
	
		//Count the number of the rows -  Excluding row 1
		int rowCount = ws.getLastRowNum();
		System.out.println("rowCount is :"+rowCount);
		
		//Count the number of the rows -  Including row 1
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows is: "+physicalNumberOfRows);
		
		//Count the number of Columns
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("columnCount is : "+columnCount);
		
		//To retrieve a single data
		String row1Cell2Data = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("row1Cell2Data is : "+row1Cell2Data);
		
		String[][] data=new String[rowCount][columnCount];
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			
			for (int j = 0; j <columnCount ; j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println("The data is: "+allData);
	
			}
		}
		
		return data;
	
	}

}
 