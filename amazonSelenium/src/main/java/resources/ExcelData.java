package resources;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelData {
	
	
	static String[][] data = null;
	
	public static void getData() throws BiffException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\TestData.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		
		String testData[][] = new String[rowCount-1][columnCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<columnCount;j++)
			{
				//testData[i-1][j] = sheet.getCell(j, i).getContents();
				
				System.out.println(sheet.getCell(j, i).getContents()+"\t");
			}
		}
		
	}
//	public static String[][] dataProvider() throws BiffException, IOException {
//		data = getData();
//		return data;
//	}

}
