package page;

import org.openqa.selenium.By;

public class selectHospital {
    //登录姓名
    public static By loginName= By.xpath("//*[@id=\"mainHeader\"]/div[1]/div[2]/span/span");
    //联合医产图标
    public static By lianheyichantubiao= By.xpath("//*[@id=\"mainHeader\"]/div[1]/div[1]");
    //意见
    public static By yijian= By.xpath("//*[@id=\"mainHeader\"]/div[1]/div[2]/div[2]/svg");
    //创建诊所
    public static By chuangjianzhensuo= By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[1]/div[2]/button");
    //诊所一
    public static By zhensuo1= By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div/div");
    //诊所二
    public static By zhensuo2= By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]");
}
