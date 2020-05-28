package page.yishengqu;

import org.openqa.selenium.By;

public class KuaiSuJiuZhen {
    //电子病历
    public static By dianzibingli= By.xpath("//*[@id=\"tab-record\"]");
    //西药处方
    public static By xiyaochufang= By.xpath("//*[@id=\"tab-west\"]");
    //中药处方
    public static By zhongyaochufang= By.xpath("//*[@id=\"tab-chinese\"]");
    //针剂处方
    public static By zhenjichufang= By.xpath("//*[@id=\"tab-injection\"]");
    //检查
    public static By jiancha= By.xpath("//*[@id=\"tab-check\"]");
    //检验
    public static By jianyan= By.xpath("//*[@id=\"tab-inspection\"]");
    //理疗
    public static By liliao= By.xpath("//*[@id=\"tab-physicalTherapy\"]");
    //保存
    public static By baocun= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[8]/button");
    //完成就诊
    public static By wanchengjiuzhen= By.xpath("//*[@id=\"treating\"]/div[1]/div/div[1]/div");

}
