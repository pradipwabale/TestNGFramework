package ExcelSheetReading;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class GetData {
	@Test
	public void getaData(){
		
		 ReadData rd=new ReadData();
		 try {
			System.out.println("data of sheet"+rd.ReadExcelData(1, 1));
		} catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		}
		
	}

}
