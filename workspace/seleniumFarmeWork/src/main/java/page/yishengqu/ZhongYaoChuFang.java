package page.yishengqu;

import org.openqa.selenium.By;

public class ZhongYaoChuFang {
    //饮片
    public static By yinpian= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/div/label[1]/span");
    //颗粒
    public static By keli= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/div/label[2]/span");
    //中药名称
    public static By zhongyaomingcheng= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/form/div[1]/div/div[1]/div/div/div/div[1]/input");
    //用量
    public static By yongliang= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/form/div[1]/div/div[2]/div/div/div/input");
    //总共
    public static By zonggong= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/form/div[5]/div[1]/div/div/div/div[1]/input");
    //用法
    public static By yongfa= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/form/div[5]/div[2]/div[1]/div/div/div/div/input");
    //频率
    public static By pinlv= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/form/div[5]/div[2]/div[2]/div/div/div/div/input");
    //剂量
    public static By jiliang= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/form/div[5]/div[2]/div[3]/div/div/div/div/input");
    //备注
    public static By beizhu= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[1]/div[2]/form/div[5]/div[3]/div/div/div/div/div[1]/input");
    //保存
    public static By baocun= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[2]/button[2]");
    //附加费用
    public static By fujiafeiyong= By.xpath("//*[@id=\"cardPrescription\"]/div[4]/div[2]/button[1]");
        //全选
        public static By quanxuan= By.xpath("//*[@id=\"addition\"]/div[1]/div/div[2]/div/div[2]/table/thead/tr/th[1]/div/label/span");
        //确认
        public static By queren= By.xpath("//*[@id=\"addition\"]/div[1]/div/div[3]/span/button[1]");
        //取消
        public static By quxiao= By.xpath("//*[@id=\"addition\"]/div[1]/div/div[3]/span/button[2]");
    //历史处方
    public static By lishichufang= By.xpath("//*[@id=\"tab-chineseLishi\"]");
        //开始日期
        public static By kaishiriqi= By.xpath("//*[@id=\"pane-chineseLishi\"]/div[1]/input[1]");
        //结束日期
        public static By jieshuriqi= By.xpath("//*[@id=\"pane-chineseLishi\"]/div[1]/input[2]");
    //处方模板
    public static By chufangmoban= By.xpath("//*[@id=\"tab-chineseMuban\"]");
        //处方输入
        public static By chufangshuru= By.xpath("//*[@id=\"pane-chineseMuban\"]/div[1]/input");
    //经方模板
    public static By jingfangmuban= By.xpath("//*[@id=\"tab-chineseJingfang\"]");
        //经方输入
        public static By jingfangshuru= By.xpath("//*[@id=\"pane-chineseJingfang\"]/div[1]/input");
}
