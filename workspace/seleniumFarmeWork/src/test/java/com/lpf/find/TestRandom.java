package com.lpf.find;

import com.lpf.driver.RandomTel;
import org.testng.annotations.Test;

public class TestRandom {
    @Test
    public void getRandom(){
        String a="139"+ RandomTel.randomTel(9);
        System.out.println(a);
    }
}
