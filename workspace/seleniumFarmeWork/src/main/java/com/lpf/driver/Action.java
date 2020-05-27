package com.lpf.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Action extends openBrowser {
    //页面全屏
    public static void maxSize(){
        driver.manage().window().maximize();
    }
    //点击
    public static void click(By by){
        elementFind.findElement(by).click();
    }
    //文本框输入
    public static void sendText(By by,String text){
        WebElement element= elementFind.findElement(by);
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
    //获取单个文本
    public static String getText(By by){
        return elementFind.findElement(by).getText();
    }
    //获取多个文本值
    public static List<String> getTexts(By by){
        List<WebElement> elementsList = elementFind.findElements(by);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < elementsList.size(); i++) {
            String text=elementsList.get(i).getText();
            list.add(text);
        }
        return list;
    }

}
