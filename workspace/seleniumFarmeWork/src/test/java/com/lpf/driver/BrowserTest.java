package com.lpf.driver;

import org.testng.annotations.Test;

public class BrowserTest {
    @Test
    public void openBrowser() throws InterruptedException {
        openBrowser.open("edge");
        Thread.sleep(3000);
        Action.closed();
    }
}
