package Testing_Maven.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNGexamples.TestNGListner;


@Listeners(TestNGListner.class)
public class Login {
	
	WebDriver driver;
	
	XSSFWorkbook wbook;
	XSSFSheet sheet;
	
	
	@BeforeMethod
	public void Setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("data.xlsx");
		
		wbook = new XSSFWorkbook(file);
		sheet = wbook.getSheet("data");
		
		
		
	}
	
	@Test
	@Parameters({"firstname","secondname"})
	 public void Testcase1(String firstname ,String secondname ) {
		 
		 WebElement signup = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
			signup.click();
			
			String excelfirstname = sheet.getRow(0).getCell(0).getStringCellValue();
			String excelsecondname = sheet.getRow(0).getCell(1).getStringCellValue();
			
			WebElement firstname1 = driver.findElement(By.name("firstname"));
			firstname1.sendKeys(excelfirstname);
			WebElement secondname1 = driver.findElement(By.name("lastname"));
			secondname1.sendKeys(excelsecondname);
			WebElement email = driver.findElement(By.name("reg_email__"));
			email.sendKeys("sahith@gmail.com");
			WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
			reemail.sendKeys("sahith@gmail.com");
			WebElement password = driver.findElement(By.name("reg_passwd__"));
			password.sendKeys("sahith123");
			WebElement day = driver.findElement(By.id("day"));
			Select DayDropDown = new Select(day);
			DayDropDown.selectByVisibleText("8");
			WebElement month = driver.findElement(By.id("month"));
	          Select MonthDropDown = new Select(month);
			 MonthDropDown.selectByVisibleText("Apr");
			WebElement year = driver.findElement(By.id("year"));
			 Select YearDropDown = new Select(year);
			 YearDropDown.selectByVisibleText("1994");
			 
			 WebElement gender = driver.findElement(By.xpath("//*[@type='radio' and @value='1']"));
			 gender.click();
		 
	 }
	
	@AfterMethod
	 public void Clean() {
		 driver.quit();
	 }
	
		
//		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
			
		
	

}
