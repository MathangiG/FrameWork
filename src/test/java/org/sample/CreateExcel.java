package org.sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.Base;
import org.locators.AmazonHome;

public class CreateExcel extends AmazonHome{
	public static void main(String[] args) throws IOException {
		
		Base base = new Base();
		base.getDriveer();
		base.getUrl("https://www.amazon.com/");
		File file = new File("C:\\Users\\Sankar Muthumani\\eclipse-workspace\\FrameWorkTasks\\TestData\\sample.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("java");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Java Program");
		FileOutputStream fout = new FileOutputStream(file);
		workbook.write(fout);
		System.out.println("Done");
	}

}
