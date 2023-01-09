package com.base;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static String readDataFromCell(String Sheetname,int rownum,int cellnum) throws IOException {
		  String res="";
		  File file = new File("C:\\Users\\my com\\eclipse-workspace\\Rapid\\excell\\Datas (3).xlsx");
		  FileInputStream fileinputstream= new FileInputStream(file);
		  Workbook workbook = new XSSFWorkbook(fileinputstream);
		  Sheet sheet = workbook.getSheet(Sheetname);
		  Row row = sheet.getRow(rownum);
		  Cell cell = row.getCell(cellnum);
		  CellType type = cell.getCellType();
		  switch (type) {
		case STRING:
			res=cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
				res = dateformat.format(dateCellValue);
			}else{
				double numericCellValue = cell.getNumericCellValue();
				long check = Math.round(numericCellValue);
				if (check==numericCellValue) {
					res=String.valueOf(check);
				}else{
					res=String.valueOf(numericCellValue);
				}
			}
			break;
		
		default:
			break;
		}
		  return res;
		  
	  }
	public static void updateCellData(String sheetname,int rownum,int cellnum,String oldData, String newData) throws IOException {
	 File file = new File("C:\\Users\\my com\\eclipse-workspace\\Rapid\\excell\\Datas (3).xlsx");
	 FileInputStream fileInputStream=new FileInputStream(file);
	 Workbook workbook = new XSSFWorkbook(fileInputStream);
	 Sheet sheet = workbook.getSheet(sheetname);
	 Row row = sheet.getRow(rownum);
	 Cell cell = row.getCell(cellnum);
	 String Value = cell.getStringCellValue();
	 if (Value.equals(oldData)) {
		 cell.setCellValue(newData);
		
	}
	 FileOutputStream fileOutputStream=new FileOutputStream(file);
	 workbook.write(fileOutputStream);
	 
	}
	  public static void writecellData(String sheetname,int rownum,int cellnum, String Data) throws IOException {
	 File file = new File ("C:\\Users\\my com\\eclipse-workspace\\Rapid\\excell\\Datas (3).xlsx");
	 FileInputStream fileInputStream= new FileInputStream(file);
	 Workbook workbook= new XSSFWorkbook(fileInputStream);
	 Sheet sheet = workbook.getSheet(sheetname);
	 Row row = sheet.getRow(rownum);
	 Cell cell = row.createCell(cellnum);
	 cell.setCellValue(Data);
	 FileOutputStream fileOutputStream= new FileOutputStream(file);
	 workbook.write(fileOutputStream);
	}
	  
	
	
	public static void getDriver(String string) {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
   
	}
	public static void enter() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void getUrl(String url) {
	driver.get(url);
	
	}

	public static void getMaximize() {
	driver.manage().window().maximize();
	
	}
	
	public static void elementClick(WebElement element) {
    element.click();
    
	}

	public static void elementSendkey(WebElement element,String data) {
	element.sendKeys(data);
	
	}

	public  void elementSendkeys(WebElement element,String data) {
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("argument[0].setAttribute('value','"+ data +"')", element);
   
	}
	
	public static void clickOkAlert() {
    Alert alert = driver.switchTo().alert();
    alert.accept();
      
	}
	
	public static void clickDismissAlert() {
    Alert alert = driver.switchTo().alert();
    alert.dismiss();
	
	}
	
	public static void enterTextInAlert(String text) {
	Alert alert = driver.switchTo().alert();
	alert.sendKeys(text);
	alert.accept();
   
    }
	
	public WebElement findElementById(String attributeValue) {
    WebElement Element = driver.findElement(By.id(attributeValue));
	return Element;
		
	}
	
	public WebElement findElementByName(String attributeValue) {
    WebElement element = driver.findElement(By.name(attributeValue));
    return element;
	
	}
	
	
	public static WebElement findElementByClassName(String attributeValue) {
    WebElement element = driver.findElement(By.className(attributeValue));
	return element;
		
	}
	
	public static WebElement findElementByXpath(String expression) {
    WebElement element = driver.findElement(By.xpath(expression));
    return element;
	
	}
	
	public static WebElement findElementByTagName(String tagName) {
	WebElement element = driver.findElement(By.tagName(tagName));
	return element;
            
	}
	
	public static String getCurrentUrl() {
    String url = driver.getCurrentUrl();
    return url;
	
	}
	
	public String getText(WebElement element) {
    String text = element.getText();
	return text;
	
	}
	
	
	public static String getTitle() {
	String title = driver.getTitle();
	return title;
	
	}
	
	public  static String getInsertedValue(WebElement element) {
	String string = element.getAttribute("value");
	return string;
       
	}
	
	public static String getInsertedValues(WebElement element,String attributeName) {
	String attribute = element.getAttribute(attributeName);
	return attribute;
		
	}
	
	public static void closeAllWindow() {
    driver.quit();
	
	}
	
	public static void closeCurrentWindow() {
    driver.close();
	
	}
	
	public static void moveToElement(WebElement element) {
	Actions a =new Actions(driver);
	a.moveToElement(element).perform();

	}
															
	public static void dragAndDropElement(WebElement element) {
    Actions a = new Actions(driver);
	a.dragAndDrop(element, element).perform();
		
	}
	
	public static void doubleclickelement(WebElement element) {
	Actions a = new Actions(driver);
	a.doubleClick(element).perform();
		
	}
	
	
	public static void rightClick(WebElement element) {
    Actions a =new Actions(driver);											
    a.contextClick(element).perform();
	
	}
	
	public static void switchFrame(WebElement element) {
	driver.switchTo().frame(element);
		
	}
	
	public static void getParentFrame() {  
	driver.switchTo().parentFrame();
	
	}
	
	public static void getDefaultFrame() {
    driver.switchTo().defaultContent();
	
	}
	
	public static void selectByIndex(WebElement element,int index) {
	Select s = new Select(element);
	s.selectByIndex(index);
	
	}
	
	public static void selectByText(WebElement element, String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
      
	}
	
    public static void selectByValue(WebElement element, String value) {
	Select s = new Select(element);
	s.selectByValue(value);
      
	}
  
    public static void deselectByText(WebElement element, String text) {
	Select s = new Select(element);
	s.deselectByValue(text);
    
	}
	 
    public static void deselectByIndex(WebElement element, int index) {
	Select s = new Select(element);
	s.deselectByIndex(index);
  
	}  
  
    public static void deselectByValue(WebElement element, String value) {
	Select s = new Select(element);
	s.deselectByValue(value);
  
	}
  
  
    public static void deselectAll(WebElement element) {
	Select s = new Select(element);
	s.deselectAll();
  
	}
  
    public static List<WebElement> getSelectedOption(WebElement element) {
	Select s = new Select(element);
	List<WebElement> list = s.getAllSelectedOptions();
	return list;
		
	}
     
    public static List <WebElement> getOptions(WebElement element) {
	Select s = new Select(element);
    List <WebElement> options = s.getOptions();
	return options;

	}

  
    public static WebElement getFirstSelectedOption(WebElement element) {
	Select s = new Select(element);
    WebElement option = s.getFirstSelectedOption();
	return option;

   }
  
    public static boolean isMultipleddn(WebElement element) {
	Select s = new Select(element);
	boolean multiple = s.isMultiple();
	return multiple;

    }
   
    public static void clickUsingJs(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("(argument[0].click()", element);

	}
   
    public static Object getAttributeUsingJs(WebElement element,String value) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Object script = js.executeScript("(returnargument[0].getAttribute('"+ value +"')", element);
    return script;

	}
   
    public static void scrollDown(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("(argument[0].scrollIntoView(true))", element);

	}
   
    public static void scrollUp(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("(argument[0].scrollIntoView(false))", element);
   
    }
   
    public static void urlUsingNavigation(String url) {
    driver.navigate().to(url);

	}
       
    public static void backUsingNavigation() {
    driver.navigate().back();

	}
   
    public static void forwardUsingNavigation() {
	driver.navigate().forward();

    }
   
    public static void refreshUsingNavigation() {
	driver.navigate().refresh();

    }
   
    public static boolean isDisplayed(WebElement element) {
	boolean b = element.isDisplayed();
    return b;

    }
  
    public static boolean isEnable(WebElement element) {
    boolean enabled = element.isEnabled();
	return enabled;
	}
   
    public static boolean isSelected(WebElement element) {
    boolean selected = element.isSelected();
	return selected;
      
    }
   
   public static String getParentWindow() {
   String handle = driver.getWindowHandle();
   return handle;
   }
   
   public static Set<String> getAllWindow() {
   Set<String> handles = driver.getWindowHandles();
   return handles;
	
   }
   
    public static void clearTextBox(WebElement element) {
    element.clear();
    
    }
   
    public static void implicitWait(int time) {
    driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS );
    
	}
    
    public static File TakeScreenShot(File srcFile,File destFile) throws IOException {
     TakesScreenshot screenShot=(TakesScreenshot) driver;
     File file = screenShot.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(srcFile, destFile);
	return file;  
	}
   
    public static void submit(WebElement element) {
    element.submit();
	    
    }
   
    public static List<WebElement> findTablerow(WebElement element,String tagName) {
    	
        List<WebElement> elements = element.findElements(By.tagName(tagName));
    	return elements;
        }
    
    public static List<WebElement> findTablerdata(WebElement element,String tagName) {
        List<WebElement> elements = element.findElements(By.tagName(tagName));
    	return elements;
        }
					
	 public static List<WebElement> findTableHeader(WebElement element,String tagName) {
    List<WebElement> elements = element.findElements(By.tagName(tagName));
	return elements;
    }
	 public static String getprojectpath() {
		 String path = System.getProperty("user.dir");
		 
		return path;
		 
	 }
	 public static String getPropertyFile(String key)throws FileNotFoundException,IOException{
		  Properties p=new Properties();
		 p.load(new FileInputStream(getprojectpath()+"//config//config.properties"));
		 Object object=p.get(key);
		 String Value = (String) object;
		return Value;
		 
	 }
	 
   
   
    }


