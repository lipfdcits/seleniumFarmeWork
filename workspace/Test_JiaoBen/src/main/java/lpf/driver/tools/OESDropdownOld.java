package lpf.driver.tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OESDropdownOld {

	/*##############################################################################################################
	 * 功能：获取下拉框总行数(只能查找到页面上已经加载了的项，如果有未展开的项则此方法不适用)
	 * 输入：下拉框
	 * 输出：下拉框的总行数
	 */
	public static int getRows(WebElement webelement_table){
		List<WebElement> tableRows = webelement_table.findElements(By.tagName("tr"));
		return tableRows.size();
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(适用于：table\tbody\tr\td\span此种结构且不带最后一行点击展开按钮的下拉框)
	 * 输入：下拉文本框，下拉表格，项名称
	 * 输出：无
	 */
	public static void clickByValue(WebElement webelement_input,WebElement webelement_table,String str){
		int rows;
		rows = webelement_table.findElements(By.tagName("tr")).size();
		for(int n=1;n<=rows;n++){
			WebElement child = OESTable.getElementInCell(webelement_table, n, 1, By.tagName("span"));
			webelement_input.sendKeys(Keys.ARROW_DOWN);
			if(child.getText().equals(str)){
				child.click();
				break;
			}
		}
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(适用于：table\tbody\tr\td\span此种结构，最后一行有点击展开按钮的下拉框)
	 * 输入：Webdriver对象,下拉表格，项名称
	 * 输出：无
	 */
	public static void clickByValueBySpread(WebDriver driver,WebElement webelement_table,String str){
		int current_row = 1;
		WebElement child;
		while(true){
			try{
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}catch(NoSuchElementException e){
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("strong"));
				child.click();
				Wait.time(2000);
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
			if(child.getText().equals(str)){
				child.click();
				return;
			}
			current_row++;
		}
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(适用于：table\tbody\tr\td\span此种结构且不带最后一行点击展开按钮的下拉框)
	 * 输入：WebDriver,下拉文本框，项名称
	 * 输出：无
	 * 日期：2017-10-18
	 */
	public static void clickByValueByText(WebDriver driver,WebElement webelement_input,String str){
		webelement_input.click();
		String xpath_str = "//span[text()='"+str+"']";
		WebElement span = driver.findElement(By.xpath(xpath_str));
		while(span.getText().equals("")){
			webelement_input.sendKeys(Keys.ARROW_DOWN);
		}
		span.click();
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(适用于：table\tbody\tr\td\span此种结构，最后一行有点击展开按钮的下拉框)
	 * 输入：Webdriver对象,下拉表格，项名称
	 * 输出：无
	 * 日期：2017-10-18
	 */
	public static void clickByValueByTextBySpread(WebDriver driver,WebElement webelement_input,String str){
		webelement_input.click();
		String xpath_str = "//span[text()='"+str+"']";
		while(true){
			webelement_input.sendKeys(Keys.ARROW_DOWN);
			try{
				WebElement span = driver.findElement(By.xpath(xpath_str));
				span.click();
				return;
			}catch(NoSuchElementException e){
				try{
					WebElement strong = driver.findElement(By.xpath("//strong[text()='……']"));
					strong.click();
				}catch(Exception e1){

				}
			}catch(ElementNotInteractableException e2){

			}
		}
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(录入关键字，通过自动检索功能，选择第一项)
	 * 输入：下拉文本框，下拉表格，项名称
	 * 输出：无
	 * 日期：2017-9-11
	 */
	public static void clickByIndex(WebElement webelement_input,WebElement webelement_table,String str){
		webelement_input.sendKeys(CodeSwitching.gbEncoding(str));
		Wait.time(1000);
		OESTable.getElementInCell(webelement_table, 1, 1, By.tagName("span")).click();
	}

	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(录入关键字，通过自动检索功能，选择第一项)，将字符转为unicode编码再输入
	 * 输入：Webdriver对象,下拉文本框，项名称
	 * 输出：无
	 * 日期：2017-9-11
	 */
	public static void clickByIndexByUnicode(WebDriver driver,WebElement webelement_input,String str){
		Actions action = new Actions(driver);
		webelement_input.click();
		webelement_input.sendKeys(CodeSwitching.gbEncoding(str));
		Wait.time(1000);
		webelement_input.sendKeys(Keys.ARROW_DOWN);
		Wait.time(500);
		webelement_input.sendKeys(Keys.ARROW_DOWN);
		Wait.time(500);
		action.sendKeys(Keys.ENTER);
		Wait.time(500);
	}


	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(录入关键字，通过自动检索功能，选择第一项)，直接输入汉字
	 * 输入：Webdriver对象,下拉文本框，项名称
	 * 输出：无
	 * 日期：2017-9-11
	 */
	public static void clickByIndexByCleartext(WebDriver driver,WebElement webelement_input,String str){
		Actions action = new Actions(driver);
		webelement_input.click();
		webelement_input.sendKeys(str);
		Wait.time(1000);
		webelement_input.sendKeys(Keys.ARROW_DOWN);
		Wait.time(500);
		webelement_input.sendKeys(Keys.ARROW_DOWN);
		Wait.time(500);
		action.sendKeys(Keys.ENTER);
		Wait.time(500);
	}


	/*##############################################################################################################
	 * 功能：点击下拉框中的指定项(录入关键字，通过自动检索功能，选择第一项),通过javascript输入
	 * 输入：Webdriver对象,下拉文本框，项名称
	 * 输出：无
	 * 日期：2017-9-11
	 */
	public static void clickByIndexByCleartextByJS(WebDriver driver,WebElement webelement_input,String str){
		Actions action = new Actions(driver);
		webelement_input.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].value=arguments[1]", webelement_input,str);
		Wait.time(1000);
		webelement_input.sendKeys(Keys.ARROW_DOWN);
		Wait.time(500);
		webelement_input.sendKeys(Keys.ARROW_DOWN);
		Wait.time(500);
		action.sendKeys(Keys.ENTER);
		Wait.time(500);
	}


	/*##############################################################################################################
	 * 功能：判断下拉框中是否有指定的文本项(适用于：table\tbody\tr\td\span此种结构且不带最后一行点击展开按钮的下拉框)
	 * 输入：Webdriver对象,下拉文本框，下拉表格，项名称
	 * 输出：true/false
	 * 日期：2017-9-12
	 */
	public static Boolean isPresent(WebElement webelement_input,WebElement webelement_table,String str){
		int rows;
		rows = webelement_table.findElements(By.tagName("tr")).size();
		//System.out.println("总行数为："+rows);
		for(int n=1;n<=rows;n++){
			WebElement span = OESTable.getElementInCell(webelement_table, n, 1, By.tagName("span"));
			webelement_input.sendKeys(Keys.ARROW_DOWN);
			//System.out.println(span.getText());
			if(span.getText().equals(str)){
				//System.out.println("找到了："+span.getText());
				return true;
			}
		}
		return false;
	}

	/*##############################################################################################################
	 * 功能：判断下拉框中是否有指定的文本项(适用于：table\tbody\tr\td\span此种结构，最后一行为点击展开按钮的下拉框)
	 * 输入：Webdriver对象,下拉表格，项名称
	 * 输出：true/false
	 */
	public static Boolean isPresentBySpread(WebDriver driver,WebElement webelement_table,String str){
		int current_row = 1;
		WebElement child;
		while(true){
			try{
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}catch(NoSuchElementException e){
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("strong"));
				child.click();
				Wait.time(2000);
				child = OESTable.getElementInCell(webelement_table, current_row, 1, By.tagName("span"));
			}catch(IndexOutOfBoundsException e){
				return false;
			}
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", child);
			if(child.getText().equals(str)){
				return true;
			}
			current_row++;
		}
	}
}
