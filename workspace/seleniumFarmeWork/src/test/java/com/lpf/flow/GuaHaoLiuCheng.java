package com.lpf.flow;

import com.lpf.driver.*;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.firstPage;
import page.selectHospital;
import page.shouyinqu.GuaHao;
import page.xitongshezhi.ZhenSuoGuanLi;
import test.JxlFun;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class GuaHaoLiuCheng {

    //登录成功后页面跳转检验
    @BeforeTest
    public void loginPage() throws InterruptedException {
        login.loginAction("chrome","https://testsaas.qingxiaoguo.com","15110403429","123456");
        Action.click(selectHospital.zhensuo1);
    }
    //关闭浏览器
//    @AfterTest
//    public void closed() throws InterruptedException {
//        Action.closed();
//    }
    @Test
    public void GuaHaoFlow() throws InterruptedException, IOException, BiffException {

        //点击挂号
        SwitchUtil.clickElement(firstPage.shouyinqu,firstPage.guahao);

        for (int i = 2; i < JxlFun.readRows("C:\\Users\\青小果6\\Desktop\\GuaHao.xls","Sheet1")+1; i++) {
            //点击选择诊室
            //Action.click(GuaHao.xuanzekeshi);
            //点击选择医生
            Action.click(GuaHao.xuanzeyisheng);
            Thread.sleep(1000);
            //选择耳鼻喉科
            //Action.click(GuaHao.erbihouke);
            //选择妇科
            //Action.click(GuaHao.fuke);
            //选择医生
            Action.click(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[6]"));
            //选择挂号日期
            Action.click(GuaHao.guahaoriqi);
            //输入姓名
            Action.sendText(GuaHao.name,JxlFun.readText("C:\\Users\\青小果6\\Desktop\\GuaHao.xls","Sheet1",i,1));
            //点击性别
            Action.click(GuaHao.gender);
            //点击女或男
            if ((RandomTel.random() % 2) == 1) {
                Action.click(GuaHao.woman);
            } else {
                Action.click(GuaHao.man);
            }
            //输入年龄
            Action.sendText(GuaHao.birthday,JxlFun.readText("C:\\Users\\青小果6\\Desktop\\GuaHao.xls","Sheet1",i,3));
            //输入手机号
            String tel="139"+ RandomTel.randomTel(9);
            Action.sendText(GuaHao.tel,tel);
//            String telText= Action.getText(GuaHao.tel);
//            while (telText.length()!=11){
//                String tel2="139"+ RandomTel.randomTel(8);
//                Action.sendText(GuaHao.tel,tel2);
//            }
            //输入身份证号
            //Action.sendText(GuaHao.shenfenzheng,"110101199003079016");
            //点击收款
            Action.click(GuaHao.shoukuan);
            //点击确定
            Action.click(GuaHao.quedingshoukuan);
            //点击关闭
            Action.click(GuaHao.guanbi);
            //刷新页面
            Action.refresh();
        }
    }





//    @Test
//    public void find(){
//        List<WebElement> list= elementFind.findElements(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div"));
//        for (int i = 0; i < list.size(); i++) {
//            String text=list.get(i).getText();
//            System.out.println(text);
//        }
//    }
//    @Test
//    public void find2(){
//        List<WebElement> list2=elementFind.findElements(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[1]/li/ul/div"));
//        for (int i = 0; i < list2.size(); i++) {
//            String text=list2.get(i).getText();
//            System.out.println(text);
//        }
//    }



}




//*[@id="pane-scheduling"]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[7]/div/span
//*[@id="pane-scheduling"]/div/div/div[2]/div[3]/table/tbody/tr[2]/td[7]