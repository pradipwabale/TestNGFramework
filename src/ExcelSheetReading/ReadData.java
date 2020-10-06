package ExcelSheetReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
 

public class ReadData {
	
	 
	public String ReadExcelData(int rowno, int cellno) throws FileNotFoundException  {
		
		File path=new File("./Utility/pradip.xlsx");
		
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sheet=wb.getSheet("Sheet1");
			 
			String data = null;
			try{
			DataFormatter df=new DataFormatter();
			String celldata=df.formatCellValue(sheet.getRow(rowno).getCell(cellno));
			
			System.out.println(celldata);
			return celldata;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return data;
} 
}