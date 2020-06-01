package com.lpf.driver;

import org.openqa.selenium.By;




public class PageCheckOutUtil {
    public static void checkout(String pageName,By clickElement,By secondElement,String expectText) throws InterruptedException {

        Action.click(clickElement);
        String text = elementFind.findElement(secondElement).getText();
        if(text.equals(expectText)){
            System.out.println("跳转---"+pageName+"---页面校验:成功");
        }else{
            System.err.println("跳转---"+pageName+"---页面校验:失败,预期:"+expectText+",实际:"+text);

        }

    }
}
