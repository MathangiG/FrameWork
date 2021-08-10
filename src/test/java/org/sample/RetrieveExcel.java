package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.eval.StringValueEval;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetrieveExcel {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Sankar Muthumani\\eclipse-workspace\\FrameWorkTasks\\TestData\\test.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("sheet1");
		
		for(int i = 0 ; i < sheet.getPhysicalNumberOfRows() ; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells() ; j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if(cellType == 1) {
					System.out.println(cell.getStringCellValue());
				}
				else if(DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy")
							;
					System.out.println(dateFormat.format(date));					
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					System.out.println(String.valueOf(l));
				}
			}
		}
		
		
	}
	

}
