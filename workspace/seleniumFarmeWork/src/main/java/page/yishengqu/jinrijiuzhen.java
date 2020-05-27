package page.yishengqu;

import org.openqa.selenium.By;

public class jinrijiuzhen {
    //候诊中
    public static By houzhenzhong= By.xpath("//*[@id=\"tab-waiting\"]");
    //治疗中
    public static By zhiliaozhong= By.xpath("//*[@id=\"tab-treating\"]");
    //已完成
    public static By yiwancheng= By.xpath("//*[@id=\"tab-ended\"]");
    //等待中
    public static By dengdaizhong= By.xpath("//*[@id=\"pane-waiting\"]/div/div[1]/div[3]/label[1]/span");
    //过号
    public static By guohao= By.xpath("//*[@id=\"pane-waiting\"]/div/div[1]/div[3]/label[2]/span");
    //过号按钮
    public static By guohaoButton= By.xpath("//*[@id=\"pane-waiting\"]/div/div[2]/div[1]");
    //呼叫
    public static By hujiao= By.xpath("//*[@id=\"pane-waiting\"]/div/div[2]/div[2]");
    //开始治疗
    public static By kaishizhiliao= By.xpath("//*[@id=\"pane-waiting\"]/div/div[2]/div[3]");
    //快速就诊
    public static By kuaisujiuzhen= By.xpath("//*[@id=\"doctorMain\"]/div[1]/div/div[1]/div");
}
