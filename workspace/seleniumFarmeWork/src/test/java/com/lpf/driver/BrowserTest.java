package com.lpf.driver;

import org.testng.annotations.Test;

public class BrowserTest {
    @Test
    public void openBrowser(){
        SeleniumDriver.open("edge");
    }
}
