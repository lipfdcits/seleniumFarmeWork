package com.lpf.driver.tools;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UseAction {
	/*##############################################################################################################
	 * 功能：模拟鼠标单击
	 * 输入：WebDriver driver
	 * 输出：无
	 */
	public static void click(WebDriver driver){
		Actions action = new Actions(driver);
		action.click().build().perform();// 鼠标左键在当前停留的位置做单击操作
	}

	/*##############################################################################################################
	 * 功能：模拟鼠标在元素上单击
	 * 输入：WebDriver driver，元素
	 * 输出：无
	 */
	public static void clickOnElement(WebDriver driver,WebElement webelement){
		Actions action = new Actions(driver);
		action.click(webelement).build().perform();// 鼠标左键点击指定的元素
	}

	/*##############################################################################################################
	 * 功能：模拟鼠标右击
	 * 输入：WebDriver driver
	 * 输出：无
	 */
	public static void contextClick(WebDriver driver){
		Actions action = new Actions(driver);
		action.contextClick().build().perform();// 鼠标右键在当前停留的位置做单击操作
	}

	/*##############################################################################################################
	 * 功能：模拟鼠标在元素上右击
	 * 输入：WebDriver driver，元素
	 * 输出：无
	 */
	public static void contextClickOnElement(WebDriver driver,WebElement webelement){
		Actions action = new Actions(driver);
		action.contextClick(webelement).build().perform();// 鼠标右键点击指定的元素
	}

	/*##############################################################################################################
	 * 功能：模拟鼠标双击
	 * 输入：WebDriver driver
	 * 输出：无
	 */
	public static void doubleClick(WebDriver driver){
		Actions action = new Actions(driver);
		action.doubleClick().build().perform();// 鼠标在当前停留的位置做双击操作
	}

	/*##############################################################################################################
	 * 功能：模拟鼠标在元素上双击
	 * 输入：WebDriver driver，元素
	 * 输出：无
	 */
	public static void doubleClickOnElement(WebDriver driver,WebElement webelement){
		Actions action = new Actions(driver);
		action.doubleClick(webelement).build().perform();// 鼠标双击指定的元素
	}

	/*##############################################################################################################
	 * 功能：模拟鼠标拖动元素
	 * 输入：WebDriver driver，元素，X轴偏移量，Y轴偏移量
	 * 输出：无
	 */
	public static void dragAndDropBy(WebDriver driver,WebElement webelement,int x,int y){
		Actions action = new Actions(driver);
		action.dragAndDropBy(webelement, x, y).build().perform();// 拖动元素的横坐标移动x个像素，纵坐标移动y个像素
	}

	/*##############################################################################################################
	 * 功能：模拟鼠标拖动元素
	 * 输入：WebDriver driver，源元素，目标元素
	 * 输出：无
	 */
	public static void dragAndDropBy(WebDriver driver,WebElement webelement_source,WebElement webelement_target){
		Actions action = new Actions(driver);
		action.dragAndDrop(webelement_source, webelement_target).build().perform();// 将元素webelement_source拖动到元素webelement_target
	}

	/*##############################################################################################################
	 * 功能：模拟鼠标指向元素
	 * 输入：WebDriver driver，元素
	 * 输出：无
	 */
	public static void moveToElement(WebDriver driver,WebElement webelement){
		Actions action = new Actions(driver);
		action.moveToElement(webelement).build().perform();// 鼠标指向webelement元素
	}

	/*##############################################################################################################
	 * 功能：模拟键盘发送按键
	 * 输入：keycode1
	 * 输出：无
	 */
	public static void Key(int enter){	//接收的参数是java.awt.event.KeyEvent类中定义的虚拟按键
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(enter);
		robot.keyRelease(enter);
	}

	/*##############################################################################################################
	 * 功能：模拟键盘发送组合键
	 * 输入：keycode1,keycode2
	 * 输出：无
	 */
	public static void Key(int keycode1,int keycode2){	//接收的参数是java.awt.event.KeyEvent类中定义的虚拟按键
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(keycode1);
		robot.keyPress(keycode2);
		robot.keyRelease(keycode1);
		robot.keyRelease(keycode2);
	}

	/*##############################################################################################################
	 * 功能：模拟键盘发送组合键
	 * 输入：keycode1,keycode2,keycode3
	 * 输出：无
	 */
	public static void Key(int keycode1,int keycode2,int keycode3){	//接收的参数是java.awt.event.KeyEvent类中定义的虚拟按键
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(keycode1);
		robot.keyPress(keycode2);
		robot.keyPress(keycode3);
		robot.keyRelease(keycode1);
		robot.keyRelease(keycode2);
		robot.keyRelease(keycode3);
	}
}
