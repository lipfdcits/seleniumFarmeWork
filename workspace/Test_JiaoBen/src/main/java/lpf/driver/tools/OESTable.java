package lpf.driver.tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OESTable {

	/*##############################################################################################################
	 * 功能：获取表格总行数
	 * 输入：无
	 * 输出：表格总行数
	 */
	public static int getRows(WebElement webelement_table){
		List<WebElement> tableRows = webelement_table.findElements(By.tagName("tr"));
		return tableRows.size();
	}

	/*##############################################################################################################
	 * 功能：获取表格总列数
	 * 输入：无
	 * 输出：表格总列数
	 */
	public static int getColumns(WebElement webelement_table){
		List<WebElement> tableRows = webelement_table.findElements(By.tagName("tr"));
		return tableRows.get(0).findElements(By.tagName("td")).size();
	}

	/*##############################################################################################################
	 * 功能：获取指定单元格对象
	 * 输入：行号，列号
	 * 输出：单元格对象
	 */
	public static WebElement getCell(WebElement webelement_table,int rowNo,int colNo){
		List<WebElement> tableRows = webelement_table.findElements(By.tagName("tr"));
		WebElement currentRow = tableRows.get(rowNo-1);
		List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
		WebElement cell = tableCols.get(colNo-1);
		return cell;
	}

	/*##############################################################################################################
	 * 功能：获取指定单元格中的某个对象
	 * 输入：行号，列号，by
	 * 输出：具体对象
	 */
	public static WebElement getElementInCell(WebElement webelement_table,int rowNo,int colNo,By by){
		List<WebElement> tableRows = webelement_table.findElements(By.tagName("tr"));
		WebElement currentRow = tableRows.get(rowNo-1);
		List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
		WebElement cell = tableCols.get(colNo-1);
		return cell.findElement(by);
	}

}
