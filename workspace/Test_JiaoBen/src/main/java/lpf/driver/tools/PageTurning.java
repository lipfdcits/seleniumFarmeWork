package lpf.driver.tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageTurning {
	/*##############################################################################################################
	 * 功能：翻至下一页，正常翻页返回0;没有下一页时返回-1
	 * 输入：WebDriver
	 * 输出：无
	 */
	public static int next(WebDriver driver){
		set5Item(driver);
		Wait.visibilityOfElementLocated(driver, "xpath", "//div[@class='bodContent']/descendant::div[starts-with(@id,'unieap_xgrid_toolbar_')]/ul");
		WebElement ul = driver.findElement(By.xpath("//div[@class='bodContent']/descendant::div[starts-with(@id,'unieap_xgrid_toolbar_')]/ul"));
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfAllElements(ul.findElements(By.xpath("child::li"))));
		List<WebElement> li_list = ul.findElements(By.xpath("child::li"));
		int li_count = li_list.size();
		int li_next_index = li_count-1;
		String li_next_xpath = "child::li["+li_next_index+"]";
		WebElement li_next = ul.findElement(By.xpath(li_next_xpath));
		int li_next_page_data = Integer.parseInt(li_next.getAttribute("page-data"));

		li_next.click();
		Wait.visibilityOfElementLocated(driver, "xpath", "//div[@class='bodContent']/descendant::div[starts-with(@id,'unieap_xgrid_toolbar_')]/ul");
		ul = driver.findElement(By.xpath("//div[@class='bodContent']/descendant::div[starts-with(@id,'unieap_xgrid_toolbar_')]/ul"));	//重新获取一次对象，否则会报StaleElementReferenceException
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfAllElements(ul.findElements(By.xpath("child::li"))));
		li_next = ul.findElement(By.xpath(li_next_xpath));											//重新获取一次对象，否则会报StaleElementReferenceException
		int li_next_page_data_new = Integer.parseInt(li_next.getAttribute("page-data"));
		if(li_next_page_data == li_next_page_data_new){
			//System.out.println("到尾了");
			return -1;
		}
		//System.out.println("下一页");
		return 0;

	}

	/*##############################################################################################################
	 * 功能：翻至上一页，正常翻页返回0;没有上一页时返回-1
	 * 输入：WebDriver
	 * 输出：无
	 */
	public static int Previous(WebDriver driver){
		set5Item(driver);
		Wait.visibilityOfElementLocated(driver, "xpath", "//div[@class='bodContent']/descendant::div[starts-with(@id,'unieap_xgrid_toolbar_')]/ul");
		WebElement ul = driver.findElement(By.xpath("//div[@class='bodContent']/descendant::div[starts-with(@id,'unieap_xgrid_toolbar_')]/ul"));
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfAllElements(ul.findElements(By.xpath("child::li"))));
		WebElement li_previous = ul.findElement(By.xpath("child::li[1]"));
		int li_previous_page_data = Integer.parseInt(li_previous.getAttribute("page-data"));

		li_previous.click();
		Wait.visibilityOfElementLocated(driver, "xpath", "//div[@class='bodContent']/descendant::div[starts-with(@id,'unieap_xgrid_toolbar_')]/ul");
		ul = driver.findElement(By.xpath("//div[@class='bodContent']/descendant::div[starts-with(@id,'unieap_xgrid_toolbar_')]/ul"));	//重新获取一次对象，否则会报StaleElementReferenceException
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfAllElements(ul.findElements(By.xpath("child::li"))));
		li_previous = ul.findElement(By.xpath("child::li[1]"));										//重新获取一次对象，否则会报StaleElementReferenceException
		int li_previous_page_data_new = Integer.parseInt(li_previous.getAttribute("page-data"));
		if(li_previous_page_data == li_previous_page_data_new){
			//System.out.println("到头了");
			return -1;
		}
		//System.out.println("上一页");
		return 0;
	}

	/*##############################################################################################################
	 * 功能：设置每页显示数量为5条
	 * 输入：WebDriver
	 * 输出：无
	 */
	public static void set5Item(WebDriver driver){
		WebElement input = driver.findElement(By.cssSelector("input[id^='unieap_form_ComboBox_'][id$='_unieap_input']"));
		if(!input.getAttribute("value").equals("5") && !input.getAttribute("value").equals("")){
			input.click();
			OESComboBoxPopup.clickByValue(driver, "5");
		}
	}
}
