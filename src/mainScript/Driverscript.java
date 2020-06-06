package mainScript;


import commonmethods.Actionkeywords;
import constantvalues.ConstantValues;
import constantvalues.LocatorValues;
import readwrite.ExcelRW;

public class Driverscript {
	
		public static void main(String[] args) throws Throwable {
			ExcelRW.excelPath(ConstantValues.excelPath);
			Actionkeywords.browserType(ConstantValues.browsertype);
			Actionkeywords.openBrowser(ConstantValues.URL);
			
		
			
			Actionkeywords.blog_btn_click(LocatorValues.blog_btn_click);
			
			Actionkeywords.blog_login_btn_click(LocatorValues.blog_login_btn_click1);
			
			
			Actionkeywords.blog_user_or_mailid(LocatorValues.blog_user_or_mailid, ConstantValues.useremailid);
			Actionkeywords.blog_login_password(LocatorValues.blog_login_password, ConstantValues.userpasssword);
			Actionkeywords.blog_login_btn_click2(LocatorValues.blog_login_btn_click2);
			Actionkeywords.blog_searchbox(LocatorValues.blog_searchbox);
			Actionkeywords.blog_interview_questions_btn_click(LocatorValues.blog_interview_questions_btn_click);
			Actionkeywords.logout_from_page(LocatorValues.logout_from_page);
			Actionkeywords.closebrowser();
		
		}
}
