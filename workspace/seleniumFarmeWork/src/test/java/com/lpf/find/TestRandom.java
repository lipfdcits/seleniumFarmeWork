package com.lpf.find;

import com.lpf.driver.RanDom;
import org.testng.annotations.Test;

public class TestRandom {
    @Test
    public void getRandom(){
        String a="139"+ RanDom.randomTel(9);
        System.out.println(a);
    }
}
