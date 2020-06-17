package com.lpf.driver;

import org.testng.annotations.Test;

import java.util.Random;

public class RandomTel {
    //生成N位随机数
    public static String randomTel(int length){
        String num=null;
        num=String.valueOf((long)(Math.random()*Math.pow(10,length))) ;
        return num;
    }

    public static int random(){
        Random random=new Random();
        int a=random.nextInt(2);
        return a;
    }

}
