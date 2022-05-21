package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static WebElement byId(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}

	public static WebElement byName(String name) {
		WebElement element2 = driver.findElement(By.name(name));
		return element2;
	}

	public static WebElement byClassName(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
	}

	public static WebElement byxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static String gettext22(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String gettitle() {
		String text = driver.getTitle();
		return text;
	}

	public static String currentUrl() {
		String text = driver.getCurrentUrl();
		return text;
	}

	public static String getAttribute(WebElement element) {
		String name = element.getAttribute("value");
		return name;
	}

	public static String getAttribute(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}

	public static void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByAttribue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void Backward() {
		driver.navigate().back();
	}

	public static void Forward() {

		driver.navigate().forward();
	}

	public static void Refresh() {
		driver.navigate().refresh();
	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String getAttributet(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}

	public static void mouseOver(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// public void robotClass ( String name1) throws AWTException {
	// Robot robot = new Robot();
	// robot.keyPress(name);
	// }

	public static void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element);
	}

	public static void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element);
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public static void alartAccept() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void alartDismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void alartSendkeys(String data) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(data);
	}

	public static String alartGetText() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		return text;
	}

	public static void takeSS(String destinationlocation) throws Exception {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(destinationlocation);
		FileUtils.copyFile(source, dest);
	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	public static void jsSetAttribute(WebElement element, String name) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + name + "')", element);
	}

	public static Object jsGetAttribute(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("return.arguments[0].getAttribute('value')", element);
		return executeScript;
	}

	public static void jsScrolDown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollintoview(true)", element);
	}

	public static void jsscroolUp(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollintoview(false)", element);
	}

	public static void Robot(String data) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
	}

	public static String windowHandle() {
		String parentId = driver.getWindowHandle();
		return parentId;
	}

	public static Set<String> windowHandles() {
		Set<String> allwindowId = driver.getWindowHandles();
		return allwindowId;
	}

	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static List<WebElement> getOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public void selectAllOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
		}
	}

	public List<WebElement> getAllSelectedOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public WebElement getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public boolean selectIsMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void deselectByIndex(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deselectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByVisibleText(value);
	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public static void waitImplecity(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}

	public void threadSeleep(int i) throws InterruptedException {
		Thread.sleep(i);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public void switchFrameid(String locator, String idname) {
		if (locator.equalsIgnoreCase("id")) {
			driver.switchTo().frame(idname);
		} else if (locator.equalsIgnoreCase("name")) {
			driver.switchTo().frame(idname);
		}
	}

	public void updateData(String pathname, String sheetName, int rowno, int cellno, String oldData, String newData)
			throws IOException {
		File file = new File(pathname);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	public void writeData(String sheetName, int rowno, int cellno, String data) throws IOException {
		File file = new File("C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Maven\\\\Excel\\\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	public String getData(String sheetName, int rowno, int cellno) throws IOException {
		String data = null;
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Maven\\Excel\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			data = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yy");
				data = dateFormat.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				data = valueOf.toString();
			}
			break;
		default:
			break;
		}
		return data;
	}

	static RequestSpecification reqspec;

	public static void apiGet(String HeaderKey, String HeaderValue, String EndPointURL) {

		reqspec = RestAssured.given();
		RequestSpecification header = reqspec.header(HeaderKey, HeaderValue);
		Response response = header.get(EndPointURL);
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

	public static void apiPost(String EndPointURL, String body) {
		reqspec = RestAssured.given();
		reqspec.header("content-type","application/json");
		reqspec = reqspec.log().all().body(body);
		Response post = reqspec.post(EndPointURL);
		System.out.println(post.getStatusCode());
		System.out.println(post.getBody().asPrettyString());

	}
	
	

}