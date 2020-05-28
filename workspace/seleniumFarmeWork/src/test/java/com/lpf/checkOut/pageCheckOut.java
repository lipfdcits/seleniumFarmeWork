package com.lpf.checkOut;

import com.lpf.driver.Action;
import com.lpf.driver.PageCheckOutUtil;
import com.lpf.driver.elementFind;
import com.lpf.driver.login;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.chuangkouqu.*;
import page.firstPage;
import page.selectHospital;
import page.shouyinqu.*;
import page.yishengqu.*;

import static page.firstPage.yishengqu;
import static page.yishengqu.jinrijiuzhen.kuaisujiuzhen;

//页面跳转检验
public class pageCheckOut {
    //登录成功后页面跳转检验
    @BeforeTest
    public void loginPage() {
        login.loginAction("chrome","https://testsaas.qingxiaoguo.com","15110403429","123456");

//        String text = elementFind.findElement(selectHospital.chuangjianzhensuo).getText();
//        Assert.assertEquals(text,"创建诊所");
//        //选择医院页面跳转至首页页面
//        PageCheckOutUtil.checkout("首页",selectHospital.zhensuo1,firstPage.shouyinqu,"收银区");
        Action.click(selectHospital.zhensuo1);
    }
    //关闭浏览器
    @AfterTest
    public void closed() throws InterruptedException {
        Action.closed();
    }
    //收银区页面跳转校验
    @Test
    public void ShouYinQuCheckOut() throws InterruptedException {
        //点击概览,查看页面跳转
        PageCheckOutUtil.checkout("概览",firstPage.gailan,gailan.yuyueguahao,"预约挂号");
        //点击挂号,查看页面跳转
        PageCheckOutUtil.checkout("挂号",firstPage.guahao,guahao.chakanyishengpaiban,"查看医生排班>");
        //点击收款,查看页面跳转
        PageCheckOutUtil.checkout("收款",firstPage.shoukuan,shoukuan.shoukuan,"收款");
        //点击退款,查看页面跳转
        PageCheckOutUtil.checkout("退款",firstPage.tuikuan, tuikuan.tuikuanTital,"退款");
        //点击费用,查看页面跳转
        PageCheckOutUtil.checkout("费用",firstPage.feiyong, feiyong.rijie,"日结");

    }
    //医生区页面校验
    @Test
    public void YiShengQuCheckOut() throws InterruptedException {
        //点击医生区,查看下拉框是否展开
        boolean panduan=elementFind.findElement(firstPage.jinrijiuzhen).isDisplayed();
        if(panduan==true) {
            //点击今日就诊,查看页面跳转
            PageCheckOutUtil.checkout("今日就诊",firstPage.jinrijiuzhen, jinrijiuzhen.kuaisujiuzhen,"快速就诊");
        }else if (panduan==false){
            Action.click(firstPage.yishengqu);
            //点击今日就诊,查看页面跳转
            PageCheckOutUtil.checkout("今日就诊",firstPage.jinrijiuzhen, jinrijiuzhen.kuaisujiuzhen,"快速就诊");
        }else {
            System.err.println();
        }
        //点击快速就诊,查看页面跳转
        PageCheckOutUtil.checkout("快速就诊",jinrijiuzhen.kuaisujiuzhen, KuaiSuJiuZhen.wanchengjiuzhen,"完成就诊");
        //点击电子病历,查看页面跳转
        PageCheckOutUtil.checkout("电子病历",KuaiSuJiuZhen.dianzibingli, DianZiBingLi.jibenxinxi,"基本信息");
        //点击徇证医学
        PageCheckOutUtil.checkout("徇证医学",firstPage.xunzhengyixue, XunZhengYixue.yongyaozhilan,"用药指南");
        //点击健康档案
        PageCheckOutUtil.checkout("健康档案",firstPage.jiankangdangan, JianKangDangAn.jiankangdangan,"健康档案");
    }

    //窗口区页面校验
    @Test
    public void chuangkouquPageCheckOut() throws InterruptedException {
        boolean panduan=elementFind.findElement(firstPage.dingdan).isDisplayed();
        if(panduan==true) {
            //点击订单,查看页面跳转
            PageCheckOutUtil.checkout("订单",firstPage.dingdan, DingDan.tuikuandingdan,"退款订单>");
        }else if (panduan==false){
            Action.click(firstPage.chuangkouqu);
            //点击订单,查看页面跳转
            PageCheckOutUtil.checkout("订单",firstPage.dingdan, DingDan.tuikuandingdan,"退款订单>");
        }else {
            System.err.println();
        }

        //点击零售,查看页面跳转
        PageCheckOutUtil.checkout("零售",firstPage.lingshou, LingShou.xinkaidingdan,"新开订单");
        //点击发药
        PageCheckOutUtil.checkout("发药",firstPage.fayao, FaYao.dingdanhao,"订单号");
        //点击针剂
        PageCheckOutUtil.checkout("针剂",firstPage.zhenji, ZhenJi.zhenji,"针剂");
        //点击检查
        PageCheckOutUtil.checkout("检查",firstPage.jiancha, JianCha.jiancha,"检查");
        //点击检验
        PageCheckOutUtil.checkout("检验",firstPage.jianyan,JianYan.jianyan,"检验");
        //点击理疗
        PageCheckOutUtil.checkout("理疗",firstPage.liliao,LiLiao.liliao,"理疗");



    }

}
