package page.shouyinqu;

import org.openqa.selenium.By;

public class TuiKuan {
    //退款
    public static By tuikuanTital=By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[1]");
    //订单号
    public static By dingdanhao= By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[1]/div");
    //退款操作
    public static By tuikuanButton= By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[12]/div/div");
    //日期-开始日期
    public static By kaishiriqi= By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[2]/div[1]/input[1]");
    //日期-结束日期
    public static By jieshuriqi= By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[2]/div[1]/input[2]");
    //退款状态
    public static By shoukuanzhuangtai= By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[2]/div[2]/div/input");
        //收款状态-全部
        public static By quanbuState= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[1]");
        //收款状态-已收款
        public static By yishoukuan= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[3]");
        //收款状态-待收款
        public static By daishoukuan= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[2]");
    //订单类型
    public static By dingdanleixing= By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[2]/div[3]/div/input");
        //全部
        public static By quanbuKind= By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[1]");
        //西药处方
        public static By xiyaochufang= By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[2]");
        //中药处方
        public static By zhongyaochufang= By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[3]");
        //针剂处方
        public static By zhenjichufang= By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[4]");
        //零售商品
        public static By lingshoushangpin= By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[5]");
        //检查
        public static By jiancha= By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[6]");
        //检验
        public static By jianyan= By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[7]");
        //理疗
        public static By liliao= By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[8]");
    //查询
    public static By chaxun= By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[2]/button");
    //查询条件
    public static By chaxuntiaojian= By.xpath("//*[@id=\"refundList\"]/div[1]/div/div[2]/div[4]/input");
}
