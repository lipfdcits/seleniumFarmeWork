package com.lpf.driver;

import org.openqa.selenium.WebDriver;
import page.loginPage;

public class login extends openBrowser {

    public static void loginAction(){
        //打开浏览器
        WebDriver driver = openBrowser.open("chrome");
        //页面全屏
        Action.maxSize();
        //输入网址
        Action.get("https://testsaas.qingxiaoguo.com");
        //定位用户名输入框并输入
        Action.sendText(loginPage.user,"15110403429");
        //定位密码输入框并输入
        Action.sendText(loginPage.password,"123456");
        //点击登录按钮
        Action.click(loginPage.login);

    }

}
