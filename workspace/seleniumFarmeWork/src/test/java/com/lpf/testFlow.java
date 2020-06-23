package com.lpf;

import com.lpf.driver.Action;
import com.lpf.driver.SwitchUtil;
import com.lpf.driver.login;
import com.lpf.flow.GuaHaoLiuCheng;
import com.lpf.flow.JinRiJiuZhenLiuCheng;
import com.lpf.flow.PaiBanLIuCheng;
import com.lpf.flow.ShouKuanLiuCheng;
import jxl.read.biff.BiffException;
import page.firstPage;
import page.shouyinqu.ShouKuan;

import java.awt.*;
import java.io.IOException;

public class testFlow {
    public static void main(String[] args) throws InterruptedException, IOException, BiffException, AWTException {
        //登陆
        login.loginAction("chrome", "https://testsaas.qingxiaoguo.com", "15110403429", "123456");
        //排班
        PaiBanLIuCheng.PaiBanFlow();
        //挂号
        GuaHaoLiuCheng.GuaHaoFlow();
        //就诊
        JinRiJiuZhenLiuCheng.JiuZhenflow();
        //收款
        ShouKuanLiuCheng.ShouKuanFlow();
    }
}
