package com.lpf;

import com.lpf.driver.SeleniumDriver;
import com.lpf.find.Action;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class actionTest {
    @Test
    public static void action() throws InterruptedException {
        SeleniumDriver.open("chrome");
        Action.get("www.baidu.com");
        Action.sendText(By.name("wd"),"selenium");
        Action.click(By.id("su"));
        SeleniumDriver.Closed();
    }
}
