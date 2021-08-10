package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.Base;
import org.locators.AmazonHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon extends AmazonHome{
	
	public static void main(String[] args) throws IOException {
		
		Base base = new Base();
		base.getDriveer();
		base.getUrl("https://www.amazon.com/");
		
		AmazonHome ama = new AmazonHome();
		WebElement txtSearchHome = ama.getTxtSearch();
		
		entertext(txtSearchHome, "mobile phone");
		
		WebElement click = ama.getBtnClick();
		base.btnClick(click);
		
		File file = new File("C:\\Users\\Sankar Muthumani\\eclipse-workspace\\FrameWorkTasks\\TestData\\sample.xlsx");
		FileInputStream fin = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fin);
		Sheet sheet = workbook.createSheet("Amazon1");
		
		List<WebElement> results2 = ama.getResults();
		//List<WebElement> findElements = driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
		
		for (int i = 0 ; i < results2.size(); i++) {
		
			String text = results2.get(i).getText();
			System.out.println(text);
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
		}
		
		FileOutputStream fout = new FileOutputStream(file);
		workbook.write(fout);
	}

}
