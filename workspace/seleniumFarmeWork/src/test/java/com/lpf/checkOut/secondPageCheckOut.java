package com.lpf.checkOut;

import com.lpf.driver.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.firstPage;
import page.selectHospital;
import page.shouyinqu.*;
import page.yishengqu.DianZiBingLi;
import page.yishengqu.JinRiJiuZhen;
import page.yishengqu.XunZhengYixue;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;

public class secondPageCheckOut {
    
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
    @BeforeMethod
    public void clickElement(Method method) throws InterruptedException {
        String methodName = method.getName();
        switch (methodName){
            case "gailan":
                SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.gailan);
                break;
            case "guahao":
                SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.guahao);
                break;
            case "shoukuan":
                SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.shoukuan);
                break;
            case "tuikuan":
                SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.tuikuan);
                break;
            case "feiyong":
                SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.feiyong);
                break;
            case "jinrijiuzhen":
                SwitchUtil.clickElement(firstPage.yishengqu,firstPage.jinrijiuzhen);
                break;
            case "xunzhengyixue":
                SwitchUtil.clickElement(firstPage.yishengqu,firstPage.xunzhengyixue);
                break;
            case "jiankangdangan":
                SwitchUtil.clickElement(firstPage.yishengqu,firstPage.jinrijiuzhen);
                break;
            case "dingdan":
                SwitchUtil.clickElement(firstPage.chuangkouqu,firstPage.dingdan);
                break;
            case "lingshou":
                SwitchUtil.clickElement(firstPage.chuangkouqu,firstPage.lingshou);
                break;
            case "fayao":
                SwitchUtil.clickElement(firstPage.chuangkouqu,firstPage.fayao);
                break;
            case "zhenji":
                SwitchUtil.clickElement(firstPage.chuangkouqu,firstPage.zhenji);
                break;
            case "jiancha":
                SwitchUtil.clickElement(firstPage.chuangkouqu,firstPage.jiancha);
                break;
            case "jianyan":
                SwitchUtil.clickElement(firstPage.chuangkouqu,firstPage.jianyan);
                break;
            case "liliao":
                SwitchUtil.clickElement(firstPage.chuangkouqu,firstPage.liliao);
                break;
            case "shouyegailan":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.shouyegailan);
                break;
            case "shangpinruku":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.shangpinruku);
                break;
            case "shangpinchuku":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.shangpinchuku);
                break;
            case "kucunchaxun":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.kucunchaxun);
                break;
            case "kucunpandian":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.kucunpandian);
                break;
            case "shangpinyujing":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.shangpinyujing);
                break;
            case "shangpinbaosun":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.shangpinbaosun);
                break;
            case "shangpintiaojia":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.shangpintiaojia);
                break;
            case "jinxiaocuntongji":
                SwitchUtil.clickElement(firstPage.kucunguanli,firstPage.jinxiaocuntongji);
                break;
            case "shourutongji":
                SwitchUtil.clickElement(firstPage.caiwuguanli,firstPage.shourutongji);
                break;
            case "zhichutongji":
                SwitchUtil.clickElement(firstPage.caiwuguanli,firstPage.zhichutongji);
                break;
            case "feiyongmingxi":
                SwitchUtil.clickElement(firstPage.caiwuguanli,firstPage.feiyongmingxi);
                break;
            case "caiwubaobiao":
                SwitchUtil.clickElement(firstPage.caiwuguanli,firstPage.caiwubaobiao);
                break;
            case "rijieshenhe":
                SwitchUtil.clickElement(firstPage.caiwuguanli,firstPage.rijieshenhe);
                break;
            case "mubanweihu":
                SwitchUtil.clickElement(firstPage.chufangguanli,firstPage.mobanweihu);
                break;
            case "chufangjilu":
                SwitchUtil.clickElement(firstPage.chufangguanli,firstPage.chufangjilu);
                break;
            case "yonghuyunying":
                SwitchUtil.clickElement(firstPage.yunyingguanli,firstPage.yonghuyunying);
                break;
            case "jingyingfenxi":
                SwitchUtil.clickElement(firstPage.yunyingguanli,firstPage.jingyingfenxi);
                break;
            case "zhensuoguanli":
                SwitchUtil.clickElement(firstPage.xitongshezhi,firstPage.zhensuoguanli);
                break;
            case "zidiankuweihu":
                SwitchUtil.clickElement(firstPage.xitongshezhi,firstPage.zidiankuweihu);
                break;
            case "xinxiweihu":
                SwitchUtil.clickElement(firstPage.xitongshezhi,firstPage.xinxiweihu);
                break;
            case "feiyongshezhi":
                SwitchUtil.clickElement(firstPage.xitongshezhi,firstPage.feiyongshezhi);
                break;
            case "jichushezhi":
                SwitchUtil.clickElement(firstPage.xitongshezhi,firstPage.jichushezhi);
                break;
        }
    }
    @Test
    public void gailan() throws InterruptedException, AWTException {
        //点击预约挂号,查看并校验页面跳转
        PageCheckOutUtil.checkout("预约挂号", GaiLan.yuyueguahao, GuaHao.chakanyishengpaiban,"查看医生排班>");
        Action.click(firstPage.gailan);
        //点击待收款,查看并校验页面跳转
        PageCheckOutUtil.checkout("待收款",GaiLan.daishoukuan, ShouKuan.shoukuan,"收款");
        Action.click(firstPage.gailan);
        //点击待退款,查看并校验页面跳转
        PageCheckOutUtil.checkout("待退款",GaiLan.daituikuan, TuiKuan.tuikuanTital,"退款");
        Action.click(firstPage.gailan);
        //点击挂号编号.查看并校验页面跳转
        PageCheckOutUtil.checkout("挂号编号",GaiLan.dingdanbianhao,GaiLan.nianling,"年龄:");
        Action.click(firstPage.gailan);
        //点击退号
        PageCheckOutUtil.checkout("退号",GaiLan.tuihao,GaiLan.querentuikuan,"确认退款");
        Action.click(GaiLan.quxiao);
    }
    @Test
    public void guahao() throws InterruptedException {
        //点击查看医生排班
        PageCheckOutUtil.checkout("查看医生排班",GuaHao.chakanyishengpaiban,GuaHao.yishengpaiban,"医生排班");
        Action.click(GuaHao.quxiao);
    }
    @Test
    public void shoukuan() throws InterruptedException {
        //点击收款按钮
        PageCheckOutUtil.checkout("收款按钮",ShouKuan.shoukuanButton,ShouKuan.querenshoukuan,"确认收款");
        Action.click(ShouKuan.quxiao);
        //点击收款按钮
        PageCheckOutUtil.checkout("收款按钮",ShouKuan.shoukuanButton,ShouKuan.querenshoukuan,"确认收款");
        //点击确定
        PageCheckOutUtil.checkout("支付成功",ShouKuan.queren, ShouKuan.zhifuchenggong,"支付成功");
        //点击关闭
        PageCheckOutUtil.checkout("关闭",ShouKuan.guanbi,ShouKuan.shoukuan,"收款");
        //点击订单号
        PageCheckOutUtil.checkout("订单号",ShouKuan.dingdanhao,ShouKuan.danjia,"单价");
        Action.click(ShouKuan.dingdanquxiao);
    }
    @Test
    public void tuikuan() throws InterruptedException {
        //点击退款按钮
        PageCheckOutUtil.checkout("退款",TuiKuan.tuikuanButton,TuiKuan.querentuikuan,"确认退款");
        //点击取消
        PageCheckOutUtil.checkout("退款取消",TuiKuan.quxiao,TuiKuan.tuikuanTital,"退款");
    }
    @Test
    public void feiyong() throws InterruptedException {
        //点击日结
        PageCheckOutUtil.checkout("日结", FeiYong.rijie,FeiYong.xinzeng,"新增");
        //点击新增
        PageCheckOutUtil.checkout("新增",FeiYong.xinzeng,FeiYong.xinzengrijie,"新增日结");
        //点击取消
        PageCheckOutUtil.checkout("取消",FeiYong.quxiao,FeiYong.rijie,"日结");
    }
    @Test
    public void jinrijiuzhen() throws InterruptedException {
        //点击快速就诊
        PageCheckOutUtil.checkout("快速就诊", JinRiJiuZhen.kuaisujiuzhen, DianZiBingLi.jibenxinxi,"基本信息");
    }
    @Test
    public void xunzhengyixue() throws InterruptedException {
        //点击诊疗指南
        PageCheckOutUtil.checkout("诊疗指南", XunZhengYixue.zhenliaozhinan,XunZhengYixue.fuke,"妇科");
    }

}
