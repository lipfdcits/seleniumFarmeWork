package page.yishengqu;

import org.openqa.selenium.By;

public class JinRiJiuZhen {
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
    //药品名称
    public static By yaopinmingcheng=By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[1]/div/div/div/div[1]/div[1]/input");
    //西药处方
    public static By xiyaochufang=By.xpath("//*[@id=\"tab-west\"]");
    //天数
    public static By tianshu=By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[1]/div/div/div[1]/input");
    //总量
    public static By zongliang=By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[5]/div/div/div[1]/input");
    //保存
    public static By baocunchufang=By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[2]/button[2]");
    //附加费
    public static By fujiafei=By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[2]/button[1]");
        //附加费确认
        public static By querenfujiafei=By.xpath("//*[@id=\"addition\"]/div[1]/div/div[3]/span/button[1]");
        //全选附加费
        public static By quanxuanfujiafei=By.xpath("//*[@id=\"addition\"]/div[1]/div/div[2]/div/div[2]/table/thead/tr/th[1]/div/label/span");
    //完成就诊
    public static By wanchengjiuzhen=By.xpath("//*[@id=\"treating\"]/div[1]/div[1]/div[1]/div");
    //确定完成就诊
    public static By quedingwanchengjiuzhen=By.xpath("/html/body/div[3]/div/div[3]/button[2]");

}
