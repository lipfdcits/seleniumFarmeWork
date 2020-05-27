package com.lpf.log4j;

import com.lpf.driver.LoggerControler;
import org.testng.annotations.Test;

public class log4jTest {
    final static LoggerControler log = LoggerControler.getlogger(log4jTest.class);
    @Test
    public void testCase(){
        log.info("这是info");
        log.debug("这是debug");
        log.warn("这是warn");
        log.err("这是err");
    }
}
