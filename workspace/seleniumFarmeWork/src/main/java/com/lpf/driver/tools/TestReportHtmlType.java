package com.lpf.driver.tools;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.dom4j.DocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class TestReportHtmlType extends TestListenerAdapter{
	private String reportPath;
	/*##############################################################################################################
	 * 功能：测试开始之前自动调用，生成测试报告的文件
	 * 输入：ITestContext对象
	 * 输出：
	 * 日期：
	 */
	@Override
	public void onStart(ITestContext testContext) {
		File htmlReportDir = new File("com.lpf.test-output/customize-report");
		if (!htmlReportDir.exists()) {
			htmlReportDir.mkdirs();
		}
		String reportName = getNowDate2()+".html";
		reportPath = htmlReportDir+"/"+reportName;
		File report = new File(htmlReportDir,reportName);
		if(report.exists()){
			try {
				report.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		StringBuilder sb = new StringBuilder("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />"
				+ "<title >测试报告</title>"
				+ "<style>table,tr,th,td{ border:1px solid green;cellspacing:1; cellpadding:1 }</style>"
				+ "</head>"
				+ "<body style=\"background-color:#E8FFC4;\">"
				+ "<div id=\"top\" align=\"center\"><p style=\"font-weight:bold;font-size:30;letter-spacing:5px;\">测试用例执行结果</p>"
				+ "<table width=\"100%\" height=\"80px\" align=\"center\" >"
				+ "<thead>"
				+ "<tr>"
				+ "<th style=\"letter-spacing:8px;font-weight:bold;font-size:20;color:white;background-color:green\">测试用例名</th>"
				+ "<th style=\"letter-spacing:8px;font-weight:bold;font-size:20;color:white;background-color:green\">用例执行结果</th>"
				+ "<th style=\"letter-spacing:8px;font-weight:bold;font-size:20;color:white;background-color:green\">耗时</th>"
				+ "</tr>"
				+ "</thead>"
				+ "<tbody style=\"word-wrap:break-word;font-weight:bold;\" align=\"center\">");
		String res = sb.toString();
		try {
			Files.write((Paths.get(reportPath)),res.getBytes("utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*##############################################################################################################
	 * 功能：每一个测试用例执行成功后自动调用，写入结果信息
	 * 输入：ITestResult对象
	 * 输出：
	 * 日期：
	 */
	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		StringBuilder sb = new StringBuilder("<tr><td>");
		sb.append("<font color=\"#3366FF\">"+iTestResult.getMethod().getRealClass()+"</font>"+" . "+"<font color=\"#000CC\">"+iTestResult.getMethod().getMethodName()+"</font>"
				+ "</td>"
				+ "<td>"
				+ "<font color=\"green\">Passed</font>"
				+ "</td>"
				+ "<td style=\"color:black;font-size:15\">"+getTestDuration(iTestResult)+"</td>"
				+ "</tr>");
		String res = sb.toString();
		try {
			Files.write((Paths.get(reportPath)),res.getBytes("utf-8"),StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/*##############################################################################################################
	 * 功能：每一个测试用例跳过后自动调用，写入结果信息
	 * 输入：ITestResult对象
	 * 输出：
	 * 日期：
	 */
	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		Throwable throwable = iTestResult.getThrowable();
		StringBuilder sb = new StringBuilder("<tr><td>");
		sb.append("<font color=\"#3366FF\">"+iTestResult.getMethod().getRealClass()+"</font>"+" . "+"<font color=\"#000CC\">"+iTestResult.getMethod().getMethodName()+"</font>"
				+ "</td>"
				+ "<td><font color=\"#C6A300\">Skipped</font>"
				+ "<p align=\"left\">原因："
				+ "<br />"
				+ "<a style=\"background-color:#C6A300;\">"
				+ throwable.getMessage()
				+ "</a>"
				+ "</p>"
				+ "</td>"
				+ "<td style=\"color:black;font-size:15\">"+getTestDuration(iTestResult)+"</td>"
				+ "</tr>");
		String res = sb.toString();
		try {
			Files.write((Paths.get(reportPath)),res.getBytes("utf-8"),StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*##############################################################################################################
	 * 功能：每一个测试用例执行失败后自动调用，写入结果信息
	 * 输入：ITestResult对象
	 * 输出：
	 * 日期：
	 */
	@Override
	public void onTestFailure(ITestResult iTestResult) {
		Throwable throwable = iTestResult.getThrowable();
		StringBuilder sb = new StringBuilder("<tr><td>");
		sb.append("<font color=\"#3366FF\">"+iTestResult.getMethod().getRealClass()+"</font>"+" . "+"<font color=\"#000CC\">"+iTestResult.getMethod().getMethodName()+"</font>"
				+ "</td>"
				+ "<td><font color=\"red\">Failed</font><br>"
				+ "<p align=\"left\">原因："
				+ "<br />"
				+ "<a style=\"background-color:red;\">"
				+ throwable.getMessage()
				+ "</a>"
				+ "</p>"
				+ "</td>"
				+ "<td style=\"color:black;font-size:15\">"+getTestDuration(iTestResult)+"</td>"
				+ "</tr>");
		String res = sb.toString();
		try {
			Files.write((Paths.get(reportPath)),res.getBytes("utf-8"),StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//根据ScreentShot_ON_OFF参数开关截图，ON，截图；OFF,不截图
		try {
			if (XmlFun.readNote("bin\\config\\config.xml", "ScreentShot_ON_OFF").equals("ON")){
				takeScreentShot(iTestResult);
			}
		} catch (DocumentException e) {
		}
	}

	/*##############################################################################################################
	 * 功能：截图,当需要时调用该方法
	 * 输入：
	 * 输出：
	 * 日期：
	 */
	public void takeScreentShot(ITestResult iTestResult) {
		String SCREEN_SHOT_PATH = "com.lpf.test-output/screen-shot";
		String SCREEN_SHOT_NAME = iTestResult.getName()+".jpg";
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
	 * 功能：测试完成后自动调用，写入结果信息
	 * 输入：ITestContext对象
	 * 输出：
	 * 日期：
	 */
	@Override
	public void onFinish(ITestContext testContext) {
		StringBuilder sb = new StringBuilder("</tbody></table><br />"
				+ "<a href=\"#top\" style=\"font-weight:bold;font-size:18;letter-spacing:12px;\">返回顶部</a>"
				+ "<span style=\"color:black;font-size:15\">"+getNowDate()+"    "+"总耗时："+getTestDuration(testContext)+"</span>"
				+ "</div>"
				+ "<div>"
				+ "<span style=\"color:black;font-size:15\">"+"总用例："+allTestsSize(testContext)+"</span><br />"
				+ "<span style=\"color:black;font-size:15\">"+"通过数："+passedTestsSize(testContext)+"</span><br />"
				+ "<span style=\"color:black;font-size:15\">"+"失败数："+failedTestsSize(testContext)+"</span><br />"
				+ "<span style=\"color:black;font-size:15\">"+"跳过例："+skippedTestsSize(testContext)+"</span><br />"
				+ "</div>"
				+ "</body>"
				+ "</html>");
		String msg = sb.toString();
		try {
			Files.write((Paths.get(reportPath)),msg.getBytes("utf-8"),StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*##############################################################################################################
	 * 功能：获取用例总数
	 * 输入：ITestResult
	 * 输出：
	 * 日期：2017-11-1
	 */
	public int allTestsSize(ITestContext testContext) {
		return testContext.getAllTestMethods().length;
	}

	/*##############################################################################################################
	 * 功能：获取用例通过数
	 * 输入：ITestResult
	 * 输出：
	 * 日期：2017-11-1
	 */
	public int passedTestsSize(ITestContext testContext) {
		return testContext.getPassedTests().size();
	}

	/*##############################################################################################################
	 * 功能：获取用例失败数
	 * 输入：ITestResult
	 * 输出：
	 * 日期：2017-11-1
	 */
	public int failedTestsSize(ITestContext testContext) {
		return testContext.getFailedTests().size();
	}

	/*##############################################################################################################
	 * 功能：获取用例跳过数
	 * 输入：ITestResult
	 * 输出：
	 * 日期：2017-11-1
	 */
	public int skippedTestsSize(ITestContext testContext) {
		return testContext.getSkippedTests().size();
	}


	/*##############################################################################################################
	 * 功能：获取用例的执行耗时
	 * 输入：ITestResult
	 * 输出：minutes+"分"+seconds+"秒"
	 * 日期：2017-11-1
	 */
	public String getTestDuration(ITestResult iTestResult) {
		long start = iTestResult.getStartMillis();
		long end =  iTestResult.getEndMillis();
		long duration = end-start;
		long minutes = (duration % (1000 * 60 * 60)) / (1000 * 60);
		long seconds = (duration % (1000 * 60)) / 1000;
		String time = minutes+"分"+seconds+"秒";
		return time;
	}

	/*##############################################################################################################
	 * 功能：获取整 个测试的的执行耗时
	 * 输入：testContext
	 * 输出：hour+"时"+minutes+"分"+seconds+"秒"
	 * 日期：2017-11-8
	 */
	public String getTestDuration(ITestContext testContext) {
		Date start = testContext.getStartDate();
		long starttime = start.getTime();
		Date end =  testContext.getEndDate();
		long endtime = end.getTime();
		long duration = endtime-starttime;

		long hour = duration / (60 * 60 * 1000);
		long minutes = (duration / (60 * 1000)) - hour * 60;
		long seconds = duration/1000 - hour*60*60 - minutes*60;
		String time = hour+"时"+minutes+"分"+seconds+"秒";
		return time;
	}

	/*##############################################################################################################
	 * 功能：获取当前日期时间"yyyy-MM-dd HH:mm:ss"
	 * 输入：
	 * 输出：
	 * 日期：2017-11-1
	 */
	public String getNowDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/*##############################################################################################################
	 * 功能：获取当前日期时间"yyyy-MM-dd HH:mm:ss"
	 * 输入：
	 * 输出：
	 * 日期：2017-11-1
	 */
	public String getNowDate2() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/*##############################################################################################################
	 * 功能：获取当前日期"yyyy-MM-dd"
	 * 输入：
	 * 输出：
	 * 日期：2017-11-1
	 */
	public static String getNowDateShort() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/*##############################################################################################################
	 * 功能：获取当前时间"HH:mm:ss"
	 * 输入：
	 * 输出：
	 * 日期：2017-11-1
	 */
	public static String getTimeShort() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		Date currentTime = new Date();
		String dateString = formatter.format(currentTime);
		return dateString;
	}
}
