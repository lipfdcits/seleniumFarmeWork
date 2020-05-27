package com.lpf.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

//查找元素(显示等待)
public class elementFind extends openBrowser {
    public static WebElement findElement(By by){
        WebElement element=null;
        try {
            WebDriverWait wait=new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            System.out.println("元素"+by+"查找超时");
            e.printStackTrace();
        }
        element=driver.findElement(by);
        return  element;
    }

    public static List<WebElement> findElements(By by){
        WebElement element=null;
        try {
            WebDriverWait wait=new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            System.out.println("元素"+by+"查找超时");
            e.printStackTrace();
        }
        List<WebElement> list=driver.findElements(by);
        return list;
    }
}
