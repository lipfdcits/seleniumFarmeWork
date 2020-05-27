package com.lpf;

import com.lpf.driver.openBrowser;
import com.lpf.driver.findElement;
import com.lpf.driver.Action;
import com.lpf.driver.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class actionTest {
    @Test
    public static void action() throws InterruptedException {
        openBrowser.open("chrome");
        Action.get("www.baidu.com");
        Action.sendText(By.name("wd"),"selenium");
        Action.click(By.id("su"));
        Action.closed();
    }

    @Test
    public static void login() throws InterruptedException {
        login.loginAction();
    }

    @Test
    public static void getText() throws InterruptedException {
        openBrowser.open("edge");
        Action.get("www.baidu.com");
        String text = findElement.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[1]")).getText();
        System.out.println(text);
        Action.closed();
    }
    @Test
    public static void getTexts() throws InterruptedException {
        openBrowser.open("edge");
        Action.get("www.baidu.com");
        List<WebElement> list = findElement.findElements(By.xpath("//*[@id=\"s-top-left\"]/a"));
        for (int i = 0; i < list.size(); i++) {
            String text = list.get(i).getText();
            System.out.println(text);
        }
        Action.closed();
    }

}