package resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataUsingApachePOI {
	
	
	
	public static void getDataUsingApache() throws IOException {
		
		String path = "D:\\DemoTest.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("DataSheet");
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count is - "+rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
			int cellCount = sheet.getRow(i).getLastCellNum();
			System.out.println(cellCount);
			
			for(int j=0;j<cellCount;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+",");
			}
			System.out.println();
		}
	}

}
