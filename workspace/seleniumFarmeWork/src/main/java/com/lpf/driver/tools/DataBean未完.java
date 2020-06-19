package com.lpf.driver.tools;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class DataBean未完 {
	private ITestContext testContext;
	private ITestResult testresult;

	private static final NumberFormat PERCENTAGE_FORMAT = new DecimalFormat("#0.00%");

	private int excludeTestsSize; 							//未执行的test数量
	private int passedTestsSize;							//测试通过的数量
	private int failedTestsSize; 							//测试失败的数量
	private int skippedTestsSize; 							//测试跳过的数量
	private int allTestsSize; 								//全部执行的测试的数量
	private ITestNGMethod[] allTestsMethod; 				//全部执行的测试方法
	private Collection<ITestNGMethod> excludeTestsMethod; 	//未执行的测试方法
	private String testsTime; 								//测试耗时
	private String passPercent; 							//测试通过率
	private String testName; 								//测试方法名
	private String className; 								//测试类名
	private String duration; 								//单个测试周期
	private String params; 									//测试用参数
	private String description; 							//测试描述
	private List<String> output; 							//Reporter Output
	private String dependMethod; 							//测试依赖方法
	private Throwable throwable; 							//测试异常原因
	private StackTraceElement[] stackTrace; 				//异常堆栈信息

	public int getExcludeTestsSize() {
		excludeTestsSize = testContext.getExcludedMethods().size();
		return excludeTestsSize;
	}

	public int getPassedTestsSize() {
		passedTestsSize = testContext.getPassedTests().size();
		return passedTestsSize;
	}

	public int getFailedTestsSize() {
		failedTestsSize = testContext.getFailedTests().size();
		return failedTestsSize;
	}

	public int getSkippedTestsSize() {
		skippedTestsSize = testContext.getSkippedTests().size();
		return skippedTestsSize;
	}

	public int getAllTestsSize() {
		allTestsSize = testContext.getAllTestMethods().length;
		return allTestsSize;
	}

	public String getPassPercent() {
		passPercent = PERCENTAGE_FORMAT.format(getPassedTestsSize()/getAllTestsSize());
		return passPercent;
	}

	public String getTestName() {
		testName = testresult.getTestName();
		return testName;
	}

	public String getClassName() {
		className = testresult.getName();
		return className;
	}

}
