package com.lpf.checkOut;

import com.lpf.driver.Action;
import com.lpf.driver.PageCheckOutUtil;
import com.lpf.driver.elementFind;
import com.lpf.driver.login;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.firstPage;
import page.selectHospital;
import page.shouyinqu.*;
import page.yishengqu.jinrijiuzhen;

//页面跳转检验
public class pageCheckOut {
    //登录成功后页面跳转检验
    @BeforeTest
    public void loginPage() {
        login.loginAction();

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
    //首页页面跳转校验
    @Test
    public void checkOut(){
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
        //点击医生区
        Action.click(firstPage.yishengqu);
        //点击今日就诊,查看页面跳转
        PageCheckOutUtil.checkout("今日就诊",firstPage.jinrijiuzhen, jinrijiuzhen.kuaisujiuzhen,"快速就诊");

    }

    @Test
    public void check(){

    }

}
