package Masters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exe_lib {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		lib_class lib = new lib_class();
		
		lib.openapp("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		lib.login("Admin", "admin123");
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\orange_admin.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rc = sh.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++)
		{
			XSSFRow r = sh.getRow(i);
			XSSFCell c0 = r.getCell(0);
			XSSFCell c1 = r.getCell(1);
			XSSFCell c2 = r.getCell(2);
			XSSFCell c3 = r.getCell(3);
			XSSFCell c4 = r.getCell(4);
			XSSFCell c5 = r.getCell(5);
			XSSFCell c6 = r.createCell(6);
			
			String rt =c0.getStringCellValue();
			String en =c1.getStringCellValue();
			String un =c2.getStringCellValue();
			String st =c3.getStringCellValue();
			String pw =c4.getStringCellValue();
			String cpw =c5.getStringCellValue();
			
			
 		lib.rolec(rt, en, un, st, pw, cpw);
 		c6.setCellValue("pass");

		}
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\orange_admin.xlsx");
		wb.write(fos);
		wb.close();
	}

}
