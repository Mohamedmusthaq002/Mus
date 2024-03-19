package org.examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;
	static Actions a;
	static Robot r;

	public static void browserLaunch() {

		driver = new ChromeDriver();
	}

	public static void closeBrowser() {

		driver.close();
	}

	public static String pagetTitle() {

		String title = driver.getTitle();

		return title;

	}

	public static String pageUrl(String Url) {

		String url = driver.getCurrentUrl();

		return url;

	}

	public static void ClickButton(WebElement ref) {
		ref.click();

	}

	public static void Values(WebElement ref, String name) {

		ref.sendKeys(name);
	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void findingElement(String xpath) {

		driver.findElement(By.xpath(xpath));
	}

	public static void fillTextBox(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	public static void btnClick(WebElement ref) {

		ref.click();

	}

//	public static void screenShot(String name) throws IOException {
//
//		TakesScreenshot tk = (TakesScreenshot) driver;
//
//		File src = tk.getScreenshotAs(OutputType.FILE);
//
//		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenPro\\ScreenShot\\" + name + ".png");
//
//		FileUtils.copyFile(src, f);
//
//	}

	public static void doubleClick(WebElement ref) {

		a = new Actions(driver);
		a.doubleClick(ref).perform();

	}

	public static void rightClick(WebElement ref) {

		a.contextClick(ref);

	}

	public static void copy() throws AWTException {

		r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void paste() {

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

//	public static String excelRead(String sheetName, int rowNo, int cellNo) throws IOException {
//
//		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenPro\\SourceFolder\\Data.xlsx");
//		FileInputStream fin = new FileInputStream(f);
//		Workbook book = new XSSFWorkbook(fin);
//		Sheet s = book.getSheet(sheetName);
//		Row r = s.getRow(rowNo);
//		Cell c = r.getCell(cellNo);
//		int type = c.getCellType();
//
//		String name = "";
//		if (type == 1) {
//
//			name = c.getStringCellValue();
//
//		} else if (DateUtil.isCellDateFormatted(c)) {
//
//			Date d = c.getDateCellValue();
//			SimpleDateFormat sim = new SimpleDateFormat("dd MMM yyyyy");
//			name = sim.format(d);
//
//		} else {
//
//			double da = c.getNumericCellValue();
//			long l = (long) da;
//			name = String.valueOf(l);
//
//		}
//
//		return name;
//
//	}

}
