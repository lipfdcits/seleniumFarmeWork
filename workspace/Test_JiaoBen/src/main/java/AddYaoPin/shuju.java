package AddYaoPin;

import java.io.IOException;


import jxl.read.biff.BiffException;

import lpf.driver.tools.JxlFun;
import lpf.driver.tools.TestBase;
import lpf.driver.tools.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class shuju {
	public static WebDriver driver1 = TestBase.getDriver();
	public  static String filepath = "src\\TestExcle\\数据.xls";
	public static void denglu() throws BiffException, IOException{
		//�����ֻ���
		driver1.findElement(By.xpath("//*[@id='app']/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).clear();
		driver1.findElement(By.xpath("//*[@id='app']/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys("15110403429");
		//��������
		driver1.findElement(By.xpath("//*[@id='app']/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).clear();
		driver1.findElement(By.xpath("//*[@id='app']/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).sendKeys("123456");
		//�����½
		driver1.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[2]/div/div[1]")).click();
		Wait.time(5000);
		//ѡ������                                                       
		driver1.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div/div[1]/div[1]")).click();
	}
	
	
	/*
	 * ѡ������
	 */
	public static  void shuju_1() throws BiffException, IOException {
		driver1.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[3]/li/div/span")).click();
		//�����Ϣά��
		driver1.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[3]/li/ul/div[3]/a/li")).click();
		for(int i = 2; i<= JxlFun.readRows(filepath, "数据"); i++){
		//��������Ʒ
		driver1.findElement(By.xpath("//*[@id='pane-shangpin']/div[4]")).click();
		Wait.time(3000);
		//ѡ����Ʒ����
		driver1.findElement(By.xpath("//*[@id='productEdit']/div/div/div[1]/form/div[1]/div[2]/div[1]/div[1]/div/div/div/input")).click();
		Wait.time(1000);
		//ѡ����Ʒ����-�в�ҩ
		driver1.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[3]/span")).click();
		Wait.time(1000);
		//ѡ��-����
		driver1.findElement(By.xpath("//*[@id='productEdit']/div/div/div[1]/form/div[1]/div[2]/div[1]/div[2]/div/div/div/input")).click();
		Wait.time(1000);
		driver1.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]/span")).click();
		//��Ʒ����                                                       
		driver1.findElement(By.xpath(" //*[@id='productEdit']/div/div/div[1]/form/div[1]/div[2]/div[2]/div/div/div/input")).sendKeys(JxlFun.readText(filepath, "����", i, 3));
		Wait.time(1000);
		//ѡ�����
		driver1.findElement(By.xpath("//*[@id='productEdit']/div/div/div[1]/form/div[1]/div[2]/div[3]/div/div/div/div/input")).click();
		Wait.time(1000);
		driver1.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[2]")).click();
		Wait.time(1000);
		//ѡ����Ʒ���
		driver1.findElement(By.xpath("//*[@id='productEdit']/div/div/div[1]/form/div[1]/div[3]/div[4]/div/div/div/div/input")).click();
		Wait.time(1000);
		driver1.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[3]")).click();
		Wait.time(1000);
		//�������ۼ�
		driver1.findElement(By.xpath("//*[@id='productEdit']/div/div/div[1]/form/div[1]/div[3]/div[5]/div/div/div/input")).sendKeys(JxlFun.readText(filepath, "����", i, 8));
		//�������
		driver1.findElement(By.xpath("//*[@id='productEdit']/div/div/div[1]/div/button[1]/span")).click();
		Wait.time(2000);
		
		}
	}
}

