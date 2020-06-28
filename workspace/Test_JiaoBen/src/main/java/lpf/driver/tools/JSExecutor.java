package lpf.driver.tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSExecutor {
	/*##############################################################################################################
	 * 功能：同步执行传入的JS代码
	 * 输入：WebDriver对象，js代码
	 * 输出：执行JS代码
	 */
	public static void execute(WebDriver driver,String js_str){
		((JavascriptExecutor)driver).executeScript(js_str);
	}

	/*##############################################################################################################
	 * 功能：异步执行传入的JS代码
	 * 输入：WebDriver对象，js代码
	 * 输出：执行JS代码
	 */
	public static void executeAsync(WebDriver driver,String js_str){
		((JavascriptExecutor)driver).executeAsyncScript(js_str);
	}

	/*##############################################################################################################
	 * 功能：向文本框中录入值
	 * 输入：WebDriver对象，文件框对象，值
	 * 输出：
	 */
	public static void setValue(WebDriver driver,WebElement input,String value){
		((JavascriptExecutor)driver).executeScript("arguments[0].value=\""+value+"\"", input);
	}
}

