package lpf.driver.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OESTab {
	/*##############################################################################################################
	 * 功能：关闭所有页签
	 * 输入：WebDriver
	 * 输出：
	 */
	public static void closeAllTab(WebDriver driver){
		String tab_xpath = "//div[@class='bodContent']/descendant::div[@id='framePageContainer_tablist']/descendant::span[3]";
		WebElement tab_element = driver.findElement(By.xpath(tab_xpath));
		UseAction.moveToElement(driver, tab_element);
		UseAction.contextClickOnElement(driver, tab_element);
		Wait.visibilityOfElementLocated(driver, "xpath", "//div[starts-with(@id,'popup')]/descendant::div[text()='关闭所有']");
		WebElement closeMenu = driver.findElement(By.xpath("//div[starts-with(@id,'popup')]/descendant::div[text()='关闭所有']"));
		closeMenu.click();
	}

	/*##############################################################################################################
	 * 功能：关闭当前页签
	 * 输入：WebDriver
	 * 输出：
	 */
	public static void closeCurrentTab(WebDriver driver){
		String tab_xpath = "//div[@class='bodContent']/descendant::div[@id='framePageContainer_tablist']/descendant::span[3]";
		WebElement tab_element = driver.findElement(By.xpath(tab_xpath));
		UseAction.moveToElement(driver, tab_element);
		UseAction.contextClickOnElement(driver, tab_element);
		Wait.visibilityOfElementLocated(driver, "xpath", "//div[starts-with(@id,'popup')]/descendant::div[text()='关闭当前']");
		WebElement closeMenu = driver.findElement(By.xpath("//div[starts-with(@id,'popup')]/descendant::div[text()='关闭当前']"));
		closeMenu.click();
	}

	/*##############################################################################################################
	 * 功能：关闭其它页签
	 * 输入：WebDriver
	 * 输出：
	 */
	public static void closeOtherTab(WebDriver driver){
		String tab_xpath = "//div[@class='bodContent']/descendant::div[@id='framePageContainer_tablist']/descendant::span[3]";
		WebElement tab_element = driver.findElement(By.xpath(tab_xpath));
		UseAction.moveToElement(driver, tab_element);
		UseAction.contextClickOnElement(driver, tab_element);
		Wait.visibilityOfElementLocated(driver, "xpath", "//div[starts-with(@id,'popup')]/descendant::div[text()='关闭其他']");
		WebElement closeMenu = driver.findElement(By.xpath("//div[starts-with(@id,'popup')]/descendant::div[text()='关闭其他']"));
		closeMenu.click();
	}
}
