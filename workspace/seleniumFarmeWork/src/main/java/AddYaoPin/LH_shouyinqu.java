package AddYaoPin;

import java.io.IOException;

import com.lpf.driver.tools.TestBase;
import com.lpf.driver.tools.XmlFun;
import jxl.read.biff.BiffException;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LH_shouyinqu {
	public static WebDriver driver1 = TestBase.getDriver();

	@BeforeMethod
	public void beforeMethod() throws DocumentException, InterruptedException, BiffException, IOException {
		driver1.get(XmlFun.readNote("bin\\config\\config.xml", "login_url"));
		Thread.sleep(2000);

	}
	//�ȴ�

	@AfterMethod
	public void afterMethod() throws DocumentException {
		//�ǳ���ַ
		//Wait.time(2000);
		//driver1.get(XmlFun.readNote("bin\\config\\config.xml", "logout_url"));
	}
	@AfterClass
	public void afterClass() throws DocumentException {
		//driver1.quit();
	}
	@Test(priority=1)
	private void Mypurchases1() throws BiffException, IOException{
		//��½
		//LH_shouyinqu_JB.denglu();
		//ѡ������
		//LH_shouyinqu_JB.new_zhensuo();
		//��¼
		shuju.denglu();
		//¼���в�ҩ����
		shuju.shuju_1();
	}


}
