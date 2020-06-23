package com.lpf.find;

import com.lpf.driver.*;
import org.omg.PortableInterceptor.ACTIVE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.firstPage;
import page.selectHospital;
import page.shouyinqu.ShouKuan;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TestShouKuan extends openBrowser {
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
    public void shoukuan() throws InterruptedException, AWTException {
        //点击收款模块
        SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.shoukuan);
        Thread.sleep(2000);
        //输入查询条件
        Action.sendText(ShouKuan.chaxuntiaojian,"证");
        //点击查询
        Action.click(ShouKuan.chaxun);
        //点击收款
        Action.click(ShouKuan.shoukuanButton);
        //点击确定
        Action.click(ShouKuan.querenshoukuan);
        //点击关闭
        Action.click(ShouKuan.guanbi);
        Thread.sleep(3000);
        //判断收款按钮是否存在
        while (Action.isDisplay(ShouKuan.shoukuanButton)){
            Action.click(ShouKuan.shoukuanButton);
        }
//        //右键点击收款
//        WebElement sk=driver.findElement(ShouKuan.shoukuanButton);
//        Actions action=new Actions(driver);
//        action.contextClick(sk).perform();
//        //模拟键盘向下点击
//        Robot robot=new Robot();
//        robot.keyPress(KeyEvent.VK_DOWN);
//        Thread.sleep(500);
//        robot.keyPress(KeyEvent.VK_DOWN);
//        Thread.sleep(3000);
    }
}
