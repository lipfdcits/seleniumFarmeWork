package com.lpf.flow;

import com.lpf.driver.*;
import org.omg.PortableInterceptor.ACTIVE;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.firstPage;
import page.selectHospital;
import page.shouyinqu.ShouKuan;
import page.yishengqu.DianZiBingLi;
import page.yishengqu.JinRiJiuZhen;

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
    public void JiuZhenflow() throws InterruptedException {
//        //点击今日就诊
//        SwitchUtil.clickElement(firstPage.yishengqu,firstPage.jinrijiuzhen);
//        Thread.sleep(2000);
//        //点击治疗中
//        Action.click(By.xpath("//*[@id=\"tab-treating\"]"));
//        //点击继续治疗
//        Action.click(By.xpath("//*[@id=\"cardTreat\"]/div[2]/div/div"));
////        //点击快速就诊
////        Action.click(JinRiJiuZhen.kuaisujiuzhen);
////        //输入姓名
////        Action.sendText(DianZiBingLi.name,"罗尔珍");
////        //输入年龄
////        Action.sendText(DianZiBingLi.age, String.valueOf(RanDom.randomAge()));
////        //输入身份证号
////        Action.sendText(DianZiBingLi.shenfenzhenghao,"450681196311187311");
////        //输入电话
////        Action.sendText(DianZiBingLi.tel,"139"+String.valueOf(RanDom.randomTel(8)));
////        //输入主诉
////        Action.sendText(DianZiBingLi.zhusu,"感冒");
////        //输入诊断信息
////        Action.sendText(DianZiBingLi.zhenduanxinxi,"感冒");
////        //选择发病日期
////        Action.click(DianZiBingLi.fabingriqi);
////        Action.click(DianZiBingLi.xuanzeriqi);
////        //点击保存
////        Action.click(DianZiBingLi.baocunbingli);
//        //点击西药处方
//        Action.click(JinRiJiuZhen.xiyaochufang);
//        //输入西药药品名称
//        Action.sendText(JinRiJiuZhen.yaopinmingcheng,"999");
//        Thread.sleep(1000);
//        Action.click(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[1]"));
//        //输入天数
//        Action.sendText(JinRiJiuZhen.tianshu,"10");
//        //输入总量
//        Action.sendText(JinRiJiuZhen.zongliang,"10");
//        //点击保存
//        Action.click(JinRiJiuZhen.baocunchufang);
//        Thread.sleep(2000);
//        //完成就诊
//        Action.click(JinRiJiuZhen.wanchengjiuzhen);
//        //点击确定完成就诊
//        Action.click(JinRiJiuZhen.quedingwanchengjiuzhen);
//        //点击收款模块
//        SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.shoukuan);
//        //输入搜索姓名
//        Action.sendText(ShouKuan.chaxuntiaojian,"证");
//        //点击查询
//        Action.click(ShouKuan.chaxun);
//        Thread.sleep(1000);
//        //点击全选
//        //Action.click(ShouKuan.quanxuan);
//        //点击一键收款
//        //Action.click(ShouKuan.yijianshoukuan);
//        //判断是否还有收款按钮




    }
}
