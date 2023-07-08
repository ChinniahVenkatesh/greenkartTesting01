package commonUtils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataTest {

	
	    public void  excelIntegration() throws IOException
	    {
		String path = "C:\\Users\\chinn\\OneDrive\\Desktop\\Week_End.xlsx";
		
		XSSFWorkbook xs = new XSSFWorkbook(path);
		XSSFSheet sheet = xs.getSheet("Sheet1");
		
		for(int i = 1 ; i < 2 ; i++)
		{
			System.out.println(sheet.getRow(i).getCell(0));
			System.out.println(sheet.getRow(i).getCell(1));
		}
	    }


}
