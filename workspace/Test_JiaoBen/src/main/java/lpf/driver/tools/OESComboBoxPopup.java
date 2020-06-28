package lpf.driver.tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OESComboBoxPopup {

	/*##############################################################################################################
	 * 功能：获取下拉框总行数(只能查找到页面上已经加载了的项，如果有未展开的项则此方法不适用)
	 * 输入：Webdriver对象
	 * 输出：下拉框的总行数
	 */
	public static int getRows(WebDriver driver){
		WebElement webelement_table = driver.findElement(By.xpath("//div[starts-with(@id,'unieap_form_ComboBoxPopup_')][contains(@style,'display: block')]/descendant::table[2]"));
		List<WebElement> tableRows = webelement_table.findElements(By.tagName("tr"));
		return tableRows.size();
	}


	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(适用于：table\tbody\tr\td\span此种结构)
	 * 输入：Webdriver对象,项名称
	 * 输出：无
	 */
	public static void clickByValue(WebDriver driver,String value){
		WebElement webelement_table = driver.findElement(By.xpath("//div[starts-with(@id,'unieap_form_ComboBoxPopup_')][contains(@style,'display: block')]/descendant::table[2]"));
		int current_row = 1;
		WebElement child;
		while(true){
			try{
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}catch(NoSuchElementException e){
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("strong"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
				child.click();
				Wait.time(1000);
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
			if(child.getText().equals(value)){
				child.click();
				return;
			}
			current_row++;
		}
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中包含指定字符串的项(适用于：table\tbody\tr\td\span此种结构)
	 * 输入：Webdriver对象,项名称
	 * 输出：无
	 */
	public static void clickByContainValue(WebDriver driver,String value){
		WebElement webelement_table = driver.findElement(By.xpath("//div[starts-with(@id,'unieap_form_ComboBoxPopup_')][contains(@style,'display: block')]/descendant::table[2]"));
		int current_row = 1;
		WebElement child;
		while(true){
			try{
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}catch(NoSuchElementException e){
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("strong"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
				child.click();
				Wait.time(1000);
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
			if(child.getText().contains(value)){
				child.click();
				return;
			}
			current_row++;
		}
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中第一项空值(适用于：table\tbody\tr\td\span此种结构)
	 * 输入：Webdriver对象
	 * 输出：无
	 * 日期：2017-10-30
	 */
	public static void clickNullValue(WebDriver driver){
		WebElement span = driver.findElement(By.xpath("//div[starts-with(@id,'unieap_form_ComboBoxPopup_')][contains(@style,'display: block')]/descendant::table[2]/descendant::span[not (text())]"));
		span.click();
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(适用于：table\tbody\tr\td\span此种结构且不带最后一行点击展开按钮的下拉框)
	 * 输入：Webdriver对象,项名称
	 * 输出：无
	 * 日期：2017-10-27
	 */
	public static void clickByValueSimple(WebDriver driver, String value){
		WebElement webelement_table = driver.findElement(By.xpath("//div[starts-with(@id,'unieap_form_ComboBoxPopup_')][contains(@style,'display: block')]/descendant::table[2]"));
		int rows = webelement_table.findElements(By.tagName("tr")).size();
		for(int n=1;n<=rows;n++){
			WebElement child = OESTable.getElementInCell(webelement_table, n, 1, By.tagName("span"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
			if(child.getText().equals(value)){
				child.click();
				break;
			}
		}
	}

	/*##############################################################################################################
	 * 功能：判断下拉框中是否有指定的文本项(适用于：table\tbody\tr\td\span此种结构)
	 * 输入：Webdriver对象,项名称
	 * 输出：true/false
	 */
	public static Boolean isPresent(WebDriver driver,String value){
		WebElement webelement_table = driver.findElement(By.xpath("//div[starts-with(@id,'unieap_form_ComboBoxPopup_')][contains(@style,'display: block')]/descendant::table[2]"));
		int current_row = 1;
		WebElement child;
		while(true){
			try{
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}catch(NoSuchElementException e){
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("strong"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
				child.click();
				Wait.time(1000);
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}catch(IndexOutOfBoundsException e){
				return false;
			}
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
			if(child.getText().equals(value)){
				return true;
			}
			current_row++;
		}
	}

}
