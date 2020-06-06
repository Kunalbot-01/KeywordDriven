package constantvalues;

import readwrite.ExcelRW;

public class ConstantValues {

	public static final String chromedriverpath = "D:\\rpa\\chromeDriver.exe";
	public static final String Firefoxdriverpath = "D:\\Selenium & Drivers\\WebDriver\\geckodriver.exe";
	public static final String excelPath = "D:\\DataDrivenFramework\\Test.xlsx";

	public static final String browsertype = ExcelRW.readValue("TestData", 1, 3);
	public static final String URL = ExcelRW.readValue("TestData", 2, 3);
	public static final String useremailid = ExcelRW.readValue("TestData", 5, 3);
	public static final String userpasssword = ExcelRW.readValue("TestData", 6, 3);
		
}
