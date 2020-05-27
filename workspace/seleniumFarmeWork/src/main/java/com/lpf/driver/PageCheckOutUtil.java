package com.lpf.driver;

import org.openqa.selenium.By;

public class PageCheckOutUtil {
    public static boolean checkout(String pageName,By clickElement,By secondElement,String expectText){
        boolean panduan;
        Action.click(clickElement);
        String text = elementFind.findElement(secondElement).getText();
        if(text.equals(expectText)){
            panduan=true;
            System.out.println("跳转---"+pageName+"---页面校验:成功");
        }else{
            panduan=false;
            System.out.println("跳转---"+pageName+"---页面校验:失败");
        }
        return panduan;
    }
}
