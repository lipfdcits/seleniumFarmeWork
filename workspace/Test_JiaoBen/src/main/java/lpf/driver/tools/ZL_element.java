package lpf.driver.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZL_element {
	/**
	 * 判断某个元素是否存在
	 */
	public void element(WebDriver webDriver, By by,String xpath) {
		try {
			webDriver.findElement(by);
		} catch (Exception e) {
			System.out.println("不存在此元素");
		}
	}
}
