package page.yishengqu;

import org.openqa.selenium.By;

public class ZhenJiChuFang {
    //新增处方
    public static By xinzengchufang= By.xpath("//*[@id=\"cardPrescription\"]/div[1]/div[2]");
    //组号
    public static By zuhao= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div/div/div/div/input");
    //药品名称
    public static By yaopinmingcheng= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[1]/div[2]/div/div/div/div[1]/input");
    //皮试
    public static By pishi= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[1]/div[3]/div/div/label/span[1]");
    //天数
    public static By tianshu= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[1]/div/div/div/input");
    //用法
    public static By yongfa= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[2]/div/div/div/div[1]/input");
    //频率
    public static By pinlv= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[3]/div/div/div/div[1]/input");
    //每次
    public static By meici= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[4]/div/div/div/input");
    //总量
    public static By zongliang= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[5]/div/div/div/input");
    //备注
    public static By beizhu= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[3]/div/div/div/div/div[1]/input");
    //新增按钮
    public static By xinzengButton= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/div[1]/div[2]");
    //附加费用
    public static By fujiafeiyong= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[2]/button[1]");
    //保存
    public static By baocun= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[2]/button[2]");
    //历史处方
    public static By lishichufang= By.xpath("//*[@id=\"tab-injectionLishi\"]");
        //开始日期
        public static By kaishiriqi= By.xpath("//*[@id=\"pane-injectionLishi\"]/div[1]/input[1]");
        //结束时间
        public static By jieshushijian= By.xpath("//*[@id=\"pane-injectionLishi\"]/div[1]/input[2]");
    //针剂模板
    public static By zhenjimuban= By.xpath("//*[@id=\"tab-injectionLuban\"]");
        //针剂输入
        public static By zhenjishuru= By.xpath("//*[@id=\"pane-injectionLuban\"]/div[1]/input");
}
