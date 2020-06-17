package com.lpf.find;

import com.lpf.driver.Action;
import com.lpf.driver.SwitchUtil;
import com.lpf.driver.elementFind;
import com.lpf.driver.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.chuangkouqu.FaYao;
import page.firstPage;
import page.selectHospital;
import page.shouyinqu.GuaHao;

public class TestFaYao {

    //登录
    @BeforeTest
    public void loginPage() throws InterruptedException {
        login.loginAction("chrome","https://testsaas.qingxiaoguo.com","15110403429","123456");
        Action.click(selectHospital.zhensuo1);
    }
    //关闭浏览器
    @AfterTest
    public void closed() throws InterruptedException {
        Action.closed();
    }
    @Test
    public void Fayao() throws InterruptedException {
        Action.click(firstPage.chuangkouqu);
        Action.click(firstPage.fayao);
        Action.click(FaYao.yifafang_xiyao);
        Action.click(FaYao.yaodan_xiyao);
        boolean panduan=elementFind.findElement(FaYao.guanbi_xiyao).isDisplayed();
        System.out.println(panduan);
        Action.click(FaYao.guanbi_xiyao);
    }
    @Test
    public void guahaoriqi() throws InterruptedException {
        SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.guahao);
        Action.click(GuaHao.xuanzekeshi);
        Action.click(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[3]"));
        Action.click(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[1]/div/div[3]/div/div/div[1]/div[2]/div[1]"));
        Action.sendText(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[1]/div/div/div/div/input"),"cs");
        Action.click(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[2]/div/div/div/div[1]/input"));
        Action.click(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]"));
        Action.sendText(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[3]/div[2]/div/div/input"),"20");
        Action.sendText(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[4]/div/div/div/input"),"19111111111");
        Action.click(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[1]/div/div[3]/div/div/div[1]/div[3]/div[2]"));
        Action.click(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[4]/button"));
        Thread.sleep(1000);
        System.out.println(Action.isDisplay(By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[1]")));
    }

}
