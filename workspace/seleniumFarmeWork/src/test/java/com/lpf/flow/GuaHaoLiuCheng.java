package com.lpf.flow;

import com.lpf.driver.Action;
import com.lpf.driver.SwitchUtil;
import com.lpf.driver.elementFind;
import com.lpf.driver.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.firstPage;
import page.selectHospital;
import page.xitongshezhi.ZhenSuoGuanLi;

import java.util.List;

public class GuaHaoLiuCheng {

    //登录成功后页面跳转检验
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
    public void GuaHaoFlow() throws InterruptedException {
        //点击诊所管理
        SwitchUtil.clickElement(firstPage.xitongshezhi, firstPage.zhensuoguanli);
        //遍历
        List<WebElement> list = elementFind.findElements(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div"));
//        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            String text = list.get(i).getText();
//            System.out.println(text);
            if (text.equals("排班设置")) {
                Action.click(ZhenSuoGuanLi.paibanshezhi);
                break;
            } else {
                continue;
            }
        }
//        //点击排班时间
//        Action.click(ZhenSuoGuanLi.paibanshijian);
//        //点击日期
//        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[6]/div"));

//        List<WebElement> list1 = elementFind.findElements(By.xpath("//*[@id=\"pane-scheduling\"]/div/div/div[2]/div[3]/table/tbody/tr[5]/td"));
//        for (int i = 0; i < list1.size(); i++) {
//            String text1 = list1.get(i).getText();
//            System.out.println(text1);
//            if (text1.equals("李鹏飞")) {
//                Action.click(ZhenSuoGuanLi.paibanshijian);
//                break;
//            } else {
//                continue;
//            }
//        }
        //点击排班设置后查询
        Action.sendText(ZhenSuoGuanLi.chaxun,"李鹏飞");
        //点击查询
        Action.click(ZhenSuoGuanLi.chaxunButton);
        //点击排班时间
        Action.click(ZhenSuoGuanLi.paibanshijian1);
        //点击日期
        Action.click(ZhenSuoGuanLi.riqi);
        //点击接诊
        Action.click(ZhenSuoGuanLi.jiezhen);
        //点击接诊诊室
        Action.click(ZhenSuoGuanLi.jiezhenzhenshi);
//        List<WebElement> list2=elementFind.findElements(By.xpath("/html/body/div[3]/div[1]/div[1]/ul"));
//        System.out.println(list2.size());
//        for (int i = 0; i < list2.size(); i++) {
//            String text2=list2.get(i).getText();
//            System.out.println(text2);
//        }
        //点击诊室
        Action.click(By.cssSelector("body > div.el-select-dropdown.el-popper > div.el-scrollbar > div.el-select-dropdown__wrap.el-scrollbar__wrap > ul > li:nth-child(2)"));
        //填写接诊人数
        Action.sendText(ZhenSuoGuanLi.jiezhenrenshu,"100");
//        //点击取消
//        Action.click(ZhenSuoGuanLi.quxiao);
        //点击确认
        Action.click(ZhenSuoGuanLi.queding);

        //html/body/div[3]/div[1]/div[1]/ul/li[1]/span
        //html/body/div[3]/div[1]/div[1]/ul/li[2]/span


    }
}


//*[@id="pane-scheduling"]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[7]/div/span
//*[@id="pane-scheduling"]/div/div/div[2]/div[3]/table/tbody/tr[2]/td[7]