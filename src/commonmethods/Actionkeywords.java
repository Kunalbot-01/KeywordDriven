package commonmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constantvalues.ConstantValues;
import readwrite.ExcelRW;
import utilities.Locatorvaluesplit;

public class Actionkeywords {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String fetchedvalue;
	public static String defaultpageid;

	public static void browserType(String browsertype) throws Exception {
		if (browsertype.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ConstantValues.chromedriverpath);
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			ExcelRW.writeValue("TestData", 1, 4, "Pass");
			
		} else if (browsertype.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ConstantValues.Firefoxdriverpath);
			driver = new FirefoxDriver();			
			driver.manage().window().maximize();
			ExcelRW.writeValue("TestData", 1, 4, "Pass");
		} else {
			ExcelRW.writeValue("TestData", 1, 4, "Skipped");
		}
		
	}
	// ****************** LOGIN TO EDUREKA *****************

	public static void openBrowser(String url) throws Exception {
		try {
			driver.get(url);
			defaultpageid = driver.getWindowHandle();
			ExcelRW.writeValue("TestData", 2, 4, "Pass");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 2, 4, "Skipped");
		}
	}

	public static void blog_btn_click(String locatorvalue) throws Exception {
		try {
			driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).click();
			ExcelRW.writeValue("TestData", 3, 4, "Pass");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 3, 4, "Skipped");
		}
	}

	public static void blog_login_btn_click(String locatorvalue) throws Exception {

		try {
			List<String> pageids = new ArrayList<String>(driver.getWindowHandles());
			int j = pageids.size();
			System.out.println(j);

			for (int i = 0; i < j; i++) {
				String id = pageids.get(i);
				if (id.equals(defaultpageid)) {
					System.out.println(id);
					continue;
				} else {
					System.out.println(id);
					driver.switchTo().window(id);
				}
			}

			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue))))
					.click();
			ExcelRW.writeValue("TestData", 4, 4, "Pass");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 4, 4, "Skipped");
		}
	}

	public static void blog_user_or_mailid(String locatorvalue, String useremailid) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locatorvaluesplit.loc_Split(locatorvalue)))
					.sendKeys(useremailid);
			ExcelRW.writeValue("TestData", 5, 4, "Pass");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 5, 4, "Skipped");
		}
	}

	public static void blog_login_password(String locatorvalue, String userpasssword) throws Exception {
		try {
			driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).sendKeys(userpasssword);
			ExcelRW.writeValue("TestData", 6, 4, "Pass");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 6, 4, "Skipped");
		}
	}

	public static void blog_login_btn_click2(String locatorvalue) throws Exception {
		try {
			driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).click();
			ExcelRW.writeValue("TestData", 7, 4, "Pass");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 7, 4, "Skipped");
		}
	}

	// *********************** BLOG RENDERING ************************************

	public static void blog_searchbox(String locatorvalue) throws Exception {
		try {
			driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).sendKeys("selenium");
			driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).sendKeys(Keys.ENTER);
			ExcelRW.writeValue("TestData", 8, 4, "Pass");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 8, 4, "Skipped");
		}
	}

	public static void blog_interview_questions_btn_click(String locatorvalue) throws Exception {
		try {
			driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).click();
			ExcelRW.writeValue("TestData", 9, 4, "Pass");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 9, 4, "Skipped");
		}
	}

	public static void logout_from_page(String locatorvalue) throws Exception {
		try {
			driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).click();
			ExcelRW.writeValue("TestData", 10, 4, "Skipped");
		} catch (Exception e) {
			ExcelRW.writeValue("TestData", 10, 4, "Skipped");
		}

	}

	public static void closebrowser() {
		driver.quit();
	}

}
