package com.lpf.log4j;

import com.lpf.driver.logger.LoggerControler;
import org.testng.annotations.Test;

public class log4jTest {
    final static LoggerControler log = LoggerControler.getLogger(log4jTest.class);
    @Test
    public void testCase(){
        log.info("这是info");

    }
}
