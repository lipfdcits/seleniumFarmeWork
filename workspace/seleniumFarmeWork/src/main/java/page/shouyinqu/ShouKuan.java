package page.shouyinqu;

import org.openqa.selenium.By;

public class ShouKuan {
    //收款
    public static By shoukuan=By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[1]");
    //一键收款
    public static By yijianshoukuan=By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[2]/button[2]");
    //第一个订单
    public static By firstdingdan=By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[1]/div/label/span/span");
    //支付宝支付
    public static By zhifubaozhifu=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[2]/div[3]/div[2]");
    //应收金额_一键支付
    public static By yingshoujine_yijian=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[2]/div[1]/div[1]/div[2]");
    //取消
    public static By quxiaozhifu=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[2]");
    //收款按钮
    public static By shoukuanButton= By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[14]/div/div");
        //确认收款
        public static By querenshoukuan=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[1]/span");
        //收款-确认
        public static By queren=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[1]");
        //收款-取消
        public static By quxiao=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[2]");
        //应收金额
        public static By yingshoujine=By.xpath("//*[@id=\"moneySuccess\"]/div[1]/div/div[2]/div/p");
        //关闭
        public static By guanbi=By.xpath("//*[@id=\"moneySuccess\"]/div[1]/div/div[3]/span/button");
    //查询
    public static By chaxun= By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[2]/button");
    //订单号
    public static By dingdanhao= By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/span");
        //单价
        public static By danjia=By.xpath("//*[@id=\"receiptInfo\"]/div[1]/div/div[2]/div[1]/div/div[2]/table/thead/tr/th[3]/div");
        //订单详情-取消
        public static By dingdanquxiao=By.xpath("//*[@id=\"receiptInfo\"]/div[1]/div/div[2]/div[2]/div/button");
    //日期-开始日期
    public static By kaishiriqi= By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[2]/div[1]/input[1]");
    //日期-结束日期
    public static By jieshuriqi= By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[2]/div[1]/input[2]");
    //收款状态
    public static By shoukuanzhuangtai= By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[2]/div[2]/div/input");
        //收款状态-全部
        public static By quanbuState= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[1]");
        //收款状态-已收款
        public static By yishoukuan= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[3]");
        //收款状态-待收款
        public static By daishoukuan= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[2]");
    //订单类型
    public static By dingdanleixing= By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[2]/div[3]/div/input");
        //全部
        public static By quanbuKind= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[1]");
        //挂号订单
        public static By guahaodingdan= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[2]");
        //西药处方
        public static By xiyaochufang= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[3]");
        //中药处方
        public static By zhongyaochufang= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[4]");
        //针剂处方
        public static By zhenjichufang= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[5]");
        //零售商品
        public static By lingshoushangpin= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[6]");
        //检查
        public static By jiancha= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[7]");
        //检验
        public static By jianyan= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[8]");
        //理疗
        public static By liliao= By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[9]");
    //查询条件
    public static By chaxuntiaojian= By.xpath("//*[@id=\"receiptList\"]/div[1]/div/div[2]/div[4]/input");
}
