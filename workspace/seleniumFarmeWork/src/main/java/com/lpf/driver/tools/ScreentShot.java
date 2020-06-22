package com.lpf.driver.tools;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreentShot {
	/*##############################################################################################################
	 * 功能：截图,当需要时调用该方法
	 * 输入：ITestResult对象
	 * 输出：
	 * 日期：
	 */
	public static void takeScreentShot(String method) {
		System.out.println("method：" + method);
		String SCREEN_SHOT_PATH = "com.lpf.test-output/screen-shot/" + method;
//		String SCREEN_SHOT_NAME = iTestResult.getName()+"--" + Test_Inov.method+".jpg";
		String SCREEN_SHOT_NAME = method + "--" + getNowDate2()+".jpg";
		File dir = new File(SCREEN_SHOT_PATH);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		String SCREEN_SHOT = dir.getAbsolutePath()+"/"+SCREEN_SHOT_NAME;

		WebDriver driver = TestBase.getDriver();

		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile (srcFile,new File(SCREEN_SHOT));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*##############################################################################################################
	 * 功能：获取当前日期时间"yyyy-MM-dd HH:mm:ss"
	 * 输入：
	 * 输出：
	 * 日期：2017-11-1
	 */
	public static String getNowDate2() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}
}
