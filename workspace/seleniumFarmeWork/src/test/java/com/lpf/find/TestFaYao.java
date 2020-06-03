package com.lpf.find;

import com.lpf.driver.Action;
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

}
