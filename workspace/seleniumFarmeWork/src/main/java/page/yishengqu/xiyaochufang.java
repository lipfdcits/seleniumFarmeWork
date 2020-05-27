package page.yishengqu;

import org.openqa.selenium.By;

public class xiyaochufang {
    //新增处方
    public static By xinzeng= By.xpath("//*[@id=\"cardPrescription\"]/div[1]/div[2]");
    //历史处方
    public static By lishichufang= By.xpath("//*[@id=\"tab-westLishi\"]");
        //开始时间
        public static By kaishishijian= By.xpath("//*[@id=\"pane-westLishi\"]/div[1]/input[1]");
        //结束时间
        public static By jieshushijian= By.xpath("//*[@id=\"pane-westLishi\"]/div[1]/input[2]");
    //处方模板
    public static By chufangmoban= By.xpath("//*[@id=\"tab-westMuban\"]");
        //查询
        public static By chaxun= By.xpath("//*[@id=\"pane-westMuban\"]/div[1]/input");
    //存为模板
    public static By cunweimoban= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[2]/button[2]");
        //模板类型
        public static By mobanleixing= By.xpath("//*[@id=\"presAsTemp\"]/div[1]/div/div[2]/form/div[1]/div/div/div/div/input");
        //诊所模板
        public static By zhensuomoban= By.xpath("//*[@id=\"presAsTemp\"]/div[1]/div/div[2]/form/div[2]/div/div/div/label[2]/span[1]");
        //个人模板
        public static By gerenmoban= By.xpath("//*[@id=\"presAsTemp\"]/div[1]/div/div[2]/form/div[2]/div/div/div/label[1]/span[1]");
        //模板名称
        public static By mobanmingcheng= By.xpath("//*[@id=\"presAsTemp\"]/div[1]/div/div[2]/form/div[3]/div/div/div/input");
        //主治
        public static By zhuzhi= By.xpath("//*[@id=\"presAsTemp\"]/div[1]/div/div[2]/form/div[4]/div/div/div/input");
        //模板说明
        public static By mobanshuming= By.xpath("//*[@id=\"presAsTemp\"]/div[1]/div/div[2]/form/div[5]/div/div/div/input");
        //确认
        public static By queren= By.xpath("//*[@id=\"presAsTemp\"]/div[1]/div/div[3]/span/button[1]");
        //取消
        public static By quxiao= By.xpath("//*[@id=\"presAsTemp\"]/div[1]/div/div[3]/span/button[2]");
    //药品名称
    public static By yaopinmingcheng= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[1]/div/div/div/div/div/input");
    //天数
    public static By tianshu= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[1]/div/div/div/input");
    //总量
    public static By zongliang= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[2]/div[5]/div/div/div/input");
    //备注
    public static By beizhu= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[1]/div[2]/form/div/div[3]/div/div/div/div/div[1]/input");
    //附加费用
    public static By fujiafeiyong= By.xpath("//*[@id=\"cardPrescription\"]/div[2]/div[2]/button[1]");
        //全选
        public static By quanxuan= By.xpath("//*[@id=\"addition\"]/div[1]/div/div[2]/div/div[2]/table/thead/tr/th[1]/div/label/span");
        //附加费确认
        public static By fujiafeiqueren= By.xpath("//*[@id=\"addition\"]/div[1]/div/div[3]/span/button[1]");
        //附加费取消
        public static By fujiafeiquxiao= By.xpath("//*[@id=\"addition\"]/div[1]/div/div[3]/span/button[2]");
}
