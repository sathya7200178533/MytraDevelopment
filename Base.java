package com.base.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver driver;

	//Please add method for other browsers also

//This method is applicable for only chrome browser
	public static WebDriver lauchBrowser( String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	public static void getURL(String url) {
		driver.get(url);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void timeWait() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	public static void screenshot(String filename) throws IOException {
		TakesScreenshot st = (TakesScreenshot) driver;
		File source = st.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sathiya\\eclipse-workspace\\Ecom\\src\\test\\screenshots\\"+filename+".png");
		FileHandler.copy(source, dest);
	}
	public static void readExcel(String ExcelLocation) throws IOException {
		FileInputStream excel = new FileInputStream(ExcelLocation);
		Workbook workbook = new XSSFWorkbook(excel);
		Sheet sheet = workbook.getSheetAt(0);
		int row = sheet.getPhysicalNumberOfRows();
		
		
	}
	//Add other methods
}
