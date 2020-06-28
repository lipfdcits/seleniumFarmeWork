package com.qingxiaoguo.test;

import jxl.read.biff.BiffException;
import lpf.driver.Action;
import lpf.driver.SwitchUtil;
import lpf.driver.login;
import lpf.driver.tools.JxlFun;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.firstPage;
import page.xitongshezhi.XinXiWeiHu;

import java.io.IOException;

public class jiaoben {
    @BeforeTest
    public void loginTest() throws InterruptedException {
        login.loginAction("chrome", "https://testsaas.qingxiaoguo.com", "15110403429", "123456");
    }
    @AfterTest
    public void closed() throws InterruptedException {
        Action.closed();
    }

    @Test
    public void YaoPin() throws InterruptedException, IOException, BiffException {
        String path=System.getProperty("user.dir")+"\\ShuJu\\数据.xls";
        //点击信息维护
        SwitchUtil.clickElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[5]/li/div"),By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[5]/li/ul/div[3]/a/li"));
        for (int i = 2; i < JxlFun.readRows(path,"数据"); i++) {
            //点击添加商品
            Action.click(By.xpath("//*[@id=\"pane-shangpin\"]/div[4]"));
            Thread.sleep(1000);
            //点击商品分类
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[2]/div[1]/div[1]/div/div/div/input"));
            //选择中草药
            Action.click(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[3]"));
            //点击分类
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/input"));
            //选择分类
            Action.click(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]"));
            //输入药品名称
            Action.sendText(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[2]/div[2]/div/div/div/input"),JxlFun.readText(path,"数据",i,2));
            //点击剂型
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[2]/div[3]/div/div/div/div[1]/input"));
            //选择剂型
            Action.click(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[2]"));
            //点击商品规格
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[3]/div[4]/div/div/div/div[1]/input"));
            //选择商品规格
            Action.click(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[3]"));
            //填写零售价
            Action.sendText(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[3]/div[5]/div/div/div/input"),JxlFun.readText(path,"数据",i,7));
            //点击保存
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/div/button[1]"));
            Thread.sleep(3000);
        }
    }
}
