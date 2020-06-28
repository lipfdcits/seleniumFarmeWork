package com.qingxiaoguo.test;

import lpf.driver.Action;
import lpf.driver.SwitchUtil;
import lpf.driver.login;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShangPinRuKu {
    @BeforeTest
    public void loginTest() throws InterruptedException {
        //登录
        login.loginAction("chrome","https://testsaas.qingxiaoguo.com","15110403429","123456");
        //选择医院
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]"));
    }
    @Test
    public void AddShangPin() throws InterruptedException {
        //点击商品入库
        SwitchUtil.clickElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[4]/li/div"),By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[4]/li/ul/div[2]/a/li"));
        //点击新增入库
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]"));
        //点击添加商品
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]"));
        //输入查询条件
        Action.sendText(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/input"),"寒水石");
        //点击查询
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/button"));
        //选中该药品
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[2]/div/div[3]/table/tbody/tr/td[1]/div/label/span"));
        //点击确定
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[4]/button[1]"));
        //输入入库数量
        Action.sendText(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[3]/table/tbody/tr/td[5]/div/div/input"),"1");
        //输入进货价
        Action.sendText(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[3]/table/tbody/tr/td[7]/div/div/input"),"0.20");
        //输入生产日期
        Action.sendText(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[3]/table/tbody/tr/td[9]/div/div/input"),"2020-05-05");
        //输入有效期
        Action.sendText(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[3]/table/tbody/tr/td[10]/div/div/input"),"2026-06-06");
        //输入生产批号
        Action.sendText(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[3]/table/tbody/tr/td[11]/div/div/input"),"123");
        //点击保存
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[4]/button[2]"));
        Thread.sleep(3000);
        //点击修改
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[3]/table/tbody/tr/td[11]/div/button[1]"));
        //获得商品名称
        String text=Action.getText(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[1]/div[3]/table/tbody/tr/td[2]/div"));
        System.out.println(text);
        if(text.equals("寒水石")){
            System.out.println("药品名称正确");
        }
        //点击保存
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[5]/button[2]"));
        //点击确认
        //Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[11]/div/button[2]/span"));
        //点击库存查询
        SwitchUtil.clickElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[1]/li/div"),By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[1]/li/ul/div[4]/a/li"));
        //输入查询条件
        Action.sendText(By.xpath("//*[@id=\"pane-goods\"]/div[2]/div[1]/input"),"寒水石");
        //点击查询
        Action.click(By.xpath("//*[@id=\"pane-goods\"]/div[2]/button"));
        //获取当前药品库存适量
        int kuncun = Integer.parseInt(Action.getText(By.xpath("//*[@id=\"pane-goods\"]/div[3]/div[3]/table/tbody/tr/td[6]/div")));
        System.out.println(kuncun);
    }
}
