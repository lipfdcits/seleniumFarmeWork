package lpf.driver;

import org.testng.annotations.Test;

import java.util.Random;

public class RanDom {
    //生成N位随机数
    public static String randomTel(int length){
        String num=null;
        num=String.valueOf((long)(Math.random()*Math.pow(10,length))) ;
        return num;
    }
    //随机生成[0,2)的整数
    public static int randomSix(){
        Random random=new Random();
        return random.nextInt(2);
    }

    //随机生成[0,120)的整数
    public static int randomAge(){
        Random random=new Random();
        return random.nextInt(120);
    }
}
