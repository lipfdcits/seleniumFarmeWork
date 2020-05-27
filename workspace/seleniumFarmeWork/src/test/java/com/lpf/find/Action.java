package com.lpf.find;

import com.lpf.driver.SeleniumDriver;
import com.lpf.driver.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Action extends SeleniumDriver{
    //点击
    public static void click(By by){
        WebDriverUtils.findElement(by).click();
    }
    //文本框输入
    public static void sendText(By by,String text){
        WebElement element=WebDriverUtils.findElement(by);
        element.clear();
        element.sendKeys(text);
    }
    //打开网址
    public static void get(String url){
        if(url.startsWith("http")){
            driver.get(url);
        }else{
            String url2="https://"+url;
            driver.get(url2);
        }

    }
    //关闭网页
    public static void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
