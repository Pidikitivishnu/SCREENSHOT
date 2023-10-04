package Screenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Naidu1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
      
		File file=new File("./target/Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet sheet=workbook.getSheetAt(3);
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(0).getLastCellNum();
		for(int i=1;i<rows;i++) {
		for(int j=0;j<cells;j++) {
			DataFormatter df=new DataFormatter();
			//System.out.println(sheet.getRow(i).getCell(j));
			System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));;
			
			
		}
		}
		stream.close();
		workbook.close();
		
	}

}
