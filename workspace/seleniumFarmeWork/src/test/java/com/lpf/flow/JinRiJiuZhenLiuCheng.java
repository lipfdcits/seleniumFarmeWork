package com.lpf.flow;

import com.lpf.driver.*;
import com.lpf.driver.tools.JxlFun;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.firstPage;
import page.selectHospital;
import page.yishengqu.DianZiBingLi;
import page.yishengqu.JinRiJiuZhen;

import java.io.IOException;

public class JinRiJiuZhenLiuCheng {
    @BeforeTest
    public void loginPage() throws InterruptedException {
        login.loginAction("chrome", "https://testsaas.qingxiaoguo.com", "15110403429", "123456");
        Action.click(selectHospital.zhensuo1);
    }

    //关闭浏览器
//    @AfterTest
//    public void closed() throws InterruptedException {
//        Action.closed();
//    }

    @Test
    public void JiuZhenflow() throws InterruptedException, IOException, BiffException {
        String path=System.getProperty("user.dir")+"\\TestExcle\\随机数据.xls";
        //点击今日就诊
        SwitchUtil.clickElement(firstPage.yishengqu,firstPage.jinrijiuzhen);
        Thread.sleep(2000);
//        //点击治疗中
//        Action.click(By.xpath("//*[@id=\"tab-treating\"]"));
//        //点击继续治疗
//        Action.click(By.xpath("//*[@id=\"cardTreat\"]/div[2]/div/div"));
        for (int i = 2; i < JxlFun.readRows(path,"Sheet1"); i++) {
            //点击快速就诊
            Action.click(JinRiJiuZhen.kuaisujiuzhen);
            //输入姓名
            Action.sendText(DianZiBingLi.name,JxlFun.readText(path,"Sheet1",i,6));
            //输入年龄
            Action.sendText(DianZiBingLi.age,JxlFun.readText(path,"Sheet1",i,4));
            //输入身份证号
            Action.sendText(DianZiBingLi.shenfenzhenghao,JxlFun.readText(path,"Sheet1",i,1));
            //输入电话
            Action.sendText(DianZiBingLi.tel,JxlFun.readText(path,"Sheet1",i,7));
            //输入主诉
            Action.sendText(DianZiBingLi.zhusu,"感冒");
            //输入诊断信息
            Action.sendText(DianZiBingLi.zhenduanxinxi,"感冒");
            Thread.sleep(1000);
            //选择发病日期
            Action.click(DianZiBingLi.fabingriqi);
            Thread.sleep(1000);
            Action.click(DianZiBingLi.xuanzeriqi);
            //点击保存
            Action.click(DianZiBingLi.baocunbingli);
            Thread.sleep(2000);
            //点击西药处方
            Action.click(JinRiJiuZhen.xiyaochufang);
            //输入西药药品名称
            Action.sendText(JinRiJiuZhen.yaopinmingcheng,"999");
            Thread.sleep(1000);
            Action.click(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[1]"));
            //输入天数
            Action.sendText(JinRiJiuZhen.tianshu,"10");
            //输入总量
            Action.sendText(JinRiJiuZhen.zongliang,"10");
            //点击保存
            Action.click(JinRiJiuZhen.baocunchufang);
            Thread.sleep(2000);
            //完成就诊
            Action.click(JinRiJiuZhen.wanchengjiuzhen);
            //点击确定完成就诊
            Action.click(JinRiJiuZhen.quedingwanchengjiuzhen);
            Thread.sleep(2000);
            //打印处方单
            windowsClick.windowsC("\\TestExcle\\打印处方单.exe");
            Thread.sleep(2000);
            Action.refresh();
            Thread.sleep(3000);
        }

    }
}
