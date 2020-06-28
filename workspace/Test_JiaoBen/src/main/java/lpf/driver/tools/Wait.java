package lpf.driver.tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	/*##############################################################################################################
	 * 功能：等待元素在页面加载完成,但不一定可见
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：无
	 */
	public static void presenceOfElementLocated (WebDriver driver, String Positioningmode, String str){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(str)));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(str)));
		}
		else if (Positioningmode.equals("className")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(str)));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(str)));
		}
		else if(Positioningmode.equals("linkText")){
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(str)));
		}
		else if(Positioningmode.equals("cssSelector")){
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(str)));
		}
	}

	/*##############################################################################################################
	 * 功能：等待元素在页面加载完成并可见
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：无
	 */
	public static void visibilityOfElementLocated (WebDriver driver, String Positioningmode, String str){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(str)));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(str)));
		}
		else if (Positioningmode.equals("className")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(str)));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str)));
		}
		else if(Positioningmode.equals("linkText")){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(str)));
		}
		else if(Positioningmode.equals("cssSelector")){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(str)));
		}
	}

	/*##############################################################################################################
	 * 功能：等待某个元素不存在于DOM或不可见
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：无
	 * 日期：2017-11-1
	 */
	public static void invisibilityOfElementLocated (WebDriver driver, String Positioningmode, String str){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(str)));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(str)));
		}
		else if (Positioningmode.equals("className")) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(str)));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(str)));
		}
		else if(Positioningmode.equals("linkText")){
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(str)));
		}
		else if(Positioningmode.equals("cssSelector")){
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(str)));
		}
	}

	/*##############################################################################################################
	 * 功能：等待集合中的所有元素可见
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：无
	 * 日期：2017-11-15
	 */
	public static void visibilityOfAllElements (WebDriver driver, String Positioningmode, String str){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) By.id(str)));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) By.name(str)));
		}
		else if (Positioningmode.equals("className")) {
			wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) By.className(str)));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) By.xpath(str)));
		}
		else if(Positioningmode.equals("linkText")){
			wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) By.linkText(str)));
		}
		else if(Positioningmode.equals("cssSelector")){
			wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) By.cssSelector(str)));
		}
	}

	/*##############################################################################################################
	 * 功能：等待集合中的所有元素不可见
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：无
	 * 日期：2017-11-15
	 */
	public static void invisibilityOfAllElements (WebDriver driver, String Positioningmode, String str){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.invisibilityOfAllElements((List<WebElement>) By.id(str)));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.invisibilityOfAllElements((List<WebElement>) By.name(str)));
		}
		else if (Positioningmode.equals("className")) {
			wait.until(ExpectedConditions.invisibilityOfAllElements((List<WebElement>) By.className(str)));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.invisibilityOfAllElements((List<WebElement>) By.xpath(str)));
		}
		else if(Positioningmode.equals("linkText")){
			wait.until(ExpectedConditions.invisibilityOfAllElements((List<WebElement>) By.linkText(str)));
		}
		else if(Positioningmode.equals("cssSelector")){
			wait.until(ExpectedConditions.invisibilityOfAllElements((List<WebElement>) By.cssSelector(str)));
		}
	}


	/*##############################################################################################################
	 * 功能：等待页面标题改变
	 * 输入：webdriver,预期的页面标题
	 * 输出：无
	 * 日期：2017-9-5
	 */
	public static void titleContains (WebDriver driver, String str){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains(str));
	}

	/*##############################################################################################################
	 * 功能：等待元素可用和可被单击
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：无
	 * 日期：2017-9-12
	 */
	public static void elementToBeClickable (WebDriver driver, String Positioningmode, String str){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.elementToBeClickable(By.id(str)));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.name(str)));
		}
		else if (Positioningmode.equals("className")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.className(str)));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(str)));
		}
		else if (Positioningmode.equals("cssSelector")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(str)));
		}
	}

	/*##############################################################################################################
	 * 功能：等待元素的状态变为已被选中
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：无
	 */
	public static void elementToBeSelected (WebDriver driver, String Positioningmode, String str){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.elementToBeSelected(By.id(str)));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.elementToBeSelected(By.name(str)));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.elementToBeSelected(By.xpath(str)));
		}
	}

	/*##############################################################################################################
	 * 功能：等待元素的value值包含指定文本
	 * 输入：webdriver,定位方式，定位字符串，文本
	 * 输出：无
	 */
	public static void textToBePresentInElementValue (WebDriver driver, String Positioningmode, String str,String text){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.id(str),text));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.name(str),text));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(str),text));
		}
		else if(Positioningmode.equals("linkText")){
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.linkText(str),text));
		}
	}

	/*##############################################################################################################
	 * 功能：等待元素的getText()返回值包含指定的文本
	 * 输入：webdriver,定位方式，定位字符串，文本
	 * 输出：无
	 */
	public static void textToBePresentInElement (WebDriver driver, String Positioningmode, String str,String text){
		//定义一个WebDriverWait对象,设定触发条件的最长等待时间60秒
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(Positioningmode.equals("id")){
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(str),text));
		}
		else if (Positioningmode.equals("name")) {
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.name(str),text));
		}
		else if (Positioningmode.equals("xpath")) {
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(str),text));
		}
		else if(Positioningmode.equals("linkText")){
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText(str),text));
		}
	}

	/*##############################################################################################################
	 * 功能：等待指定时长
	 * 输入：时长（单位毫秒）
	 * 输出：无
	 */
	public static void time (int n){
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

