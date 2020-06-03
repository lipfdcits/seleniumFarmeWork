package com.lpf.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

//查找元素(显示等待)
public class elementFind extends openBrowser {
//    public static WebElement findElement(By by){
//        WebElement element=null;
//        try {
//            WebDriverWait wait=new WebDriverWait(driver,10);
//            wait.until(ExpectedConditions.presenceOfElementLocated(by));
//        }catch (Exception e){
//            System.out.println("元素"+by+"查找超时");
//            e.printStackTrace();
//        }
//        element=driver.findElement(by);
//        return  element;
//    }
//
//    public static List<WebElement> findElements(By by){
//        WebElement element=null;
//        try {
//            WebDriverWait wait=new WebDriverWait(driver,10);
//            wait.until(ExpectedConditions.presenceOfElementLocated(by));
//        }catch (Exception e){
//            System.out.println("元素"+by+"查找超时");
//            e.printStackTrace();
//        }
//        List<WebElement> list=driver.findElements(by);
//        return list;
//    }
    public static WebElement findElement(final By by){
        WebElement webElement=null;
        try {
            webElement=new WebDriverWait(driver,10).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        }catch (Exception e){
            System.out.print("元素"+by+"没找着");
            e.printStackTrace();
        }
        return webElement;
    }
    public static List<WebElement> findElements(final By by){
        List<WebElement> webElements=null;
        try {
            webElements=new WebDriverWait(driver,5).until(new ExpectedCondition<List<WebElement>>(){
                public List<WebElement> apply(WebDriver driver) {
                    return driver.findElements(by);
                }
            });
        }catch (Exception e){
            System.out.print("元素"+by+"定位超时");
            e.printStackTrace();
        }
        return webElements;
    }
}
