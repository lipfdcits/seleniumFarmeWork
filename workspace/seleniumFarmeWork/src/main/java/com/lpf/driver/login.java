package com.lpf.driver;

import org.openqa.selenium.WebDriver;
import page.loginPage;

public class login extends openBrowser {

    public static void loginAction(String browser,String url,String user,String pwd) throws InterruptedException {
        //打开浏览器
        WebDriver driver = openBrowser.open(browser);
        //页面全屏
        Action.maxSize();
        //输入网址
        Action.get(url);
        //定位用户名输入框并输入
        Action.sendText(loginPage.user,user);
        //定位密码输入框并输入
        Action.sendText(loginPage.password,pwd);
        //点击登录按钮
        Action.click(loginPage.login);

    }

}
