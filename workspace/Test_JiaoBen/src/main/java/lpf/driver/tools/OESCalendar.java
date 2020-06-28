package lpf.driver.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OESCalendar {

	/*##############################################################################################################
	 * 功能：点击日期框中的年份和月份
	 * 输入：Webdriver对象，年份，月份
	 * 输出：
	 */
	public static void clickByValue(WebDriver driver, String year, String month){
		//获取年份表格
		WebElement table_year = driver.findElement(By.xpath("//div[starts-with(@id,'4unieap_form_DateYMTextBoxPopup_')][contains(@style,'display: block')]/descendant::table[@id='yearT']"));
		//获取月份表格
		WebElement table_month = driver.findElement(By.xpath("//div[starts-with(@id,'unieap_form_DateYMTextBoxPopup_')][contains(@style,'display: block')]/descendant::table[@id='monthT']"));
		//获取上一年按钮
		WebElement td_preTenYear = table_year.findElement(By.xpath("descendant::td[1]"));
		//获取下一年按钮
		WebElement td_nextTenYear = table_year.findElement(By.xpath("descendant::td[2]"));

		int year_number = Integer.valueOf(year);
		int month_number = Integer.valueOf(month);

		//翻页到年份范围内
		{
			WebElement td_firstYear = table_year.findElement(By.xpath("descendant::td[3]"));
			WebElement td_lastYear = table_year.findElement(By.xpath("descendant::td[12]"));
			String td_firstYear_string = td_firstYear.getText();
			String td_lastYear_string = td_lastYear.getText();
			int td_firstYear_number = Integer.valueOf(td_firstYear_string);
			int td_lastYear_number = Integer.valueOf(td_lastYear_string);
			while(year_number < td_firstYear_number){
				td_preTenYear.click();
				td_firstYear = table_year.findElement(By.xpath("descendant::td[3]"));
				td_firstYear_string = td_firstYear.getText();
				td_firstYear_number = Integer.valueOf(td_firstYear_string);
			}
			while(year_number > td_lastYear_number){
				td_nextTenYear.click();
				td_lastYear = table_year.findElement(By.xpath("descendant::td[12]"));
				td_lastYear_string = td_lastYear.getText();
				td_lastYear_number = Integer.valueOf(td_lastYear_string);
			}
		}
		//定位要点击的年份
		String td_targerYear_xpath = "descendant::td[text()="+year+"]";
		WebElement td_targerYear = table_year.findElement(By.xpath(td_targerYear_xpath));
		//点击目标年份
		td_targerYear.click();

//		//定位要点击的月份
//		String td_targerMonth_xpath = "descendant::td[text()="+month+"]";
//		WebElement td_targerMonth = table_month.findElement(By.xpath(td_targerYear_xpath));
//		//点击目标年份
//		td_targerMonth.click();
	}
}
