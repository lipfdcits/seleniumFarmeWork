package page.chuangkouqu;

import org.openqa.selenium.By;

public class DingDan {
    //退款订单
    public static By tuikuandingdan=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[2]/div[1]/div");
        //退款  》
        public static By fanhui=By.xpath("//*[@id=\"refundRecord\"]/div[1]/div/div[1]/div");
    //待收款
    public static By daishoukuan=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[1]/div[1]/p");
    //待发药
    public static By daifayao=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[1]/div[2]");
    //待执行
    public static By daizhixing=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[1]/div[3]");
    //待检查
    public static By daijiancha=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[1]/div[4]");
    //待检验
    public static By daijianyan=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[1]/div[5]");
    //待理疗
    public static By daililiao=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[1]/div[6]");
    //收款
    public static By shoukuan=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[2]/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[14]/div/div");
        //应收金额
        public static By yingshoujine=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[2]/div[1]/div[1]/div[2]");
        //确认收款-取消
        public static By quxiao=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[2]");
        //确认收款-确认
        public static By queren= By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[1]");
            //微信支付
            public static By weixinzhifu=By.xpath("//*[@id=\"moneyQrcode\"]/div[1]/div/div[2]/div/div[4]/button[1]");
            //支付宝支付
            public static By zhifubaozhifu=By.xpath("//*[@id=\"moneyQrcode\"]/div[1]/div/div[2]/div/div[4]/button[2]");
            //支付成功
            public static By zhifuchenggong=By.xpath("//*[@id=\"moneySuccess\"]/div[1]/div/div[1]/span");
            //关闭
            public static By guanbi=By.xpath("//*[@id=\"moneySuccess\"]/div[1]/div/div[3]/span/button");
    //一键收款
    public static By yijianshoukuan=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[2]/div[2]/button[2]");
        //第一条订单
        public static By first=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[2]/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[1]/div/label/span");
        //第二条订单
        public static By second=By.xpath("//*[@id=\"saleMain\"]/div[1]/div[2]/div[3]/div[1]/div[3]/table/tbody/tr[2]/td[1]/div/label/span");
        //应收金额
        public static By yingshoujine_yijian=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[2]/div[1]/div[1]/div[2]");
        //取消
        public static By quxiao_yijian=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[2]");
        //确认
        public static By queren_yijian=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[1]");
            //微信支付
            public static By weixinzhifu_yijian=By.xpath("//*[@id=\"moneyQrcode\"]/div[1]/div/div[2]/div/div[4]/button[1]");
            //支付宝支付
            public static By zhifubaozhifu_yijian=By.xpath("//*[@id=\"moneyQrcode\"]/div[1]/div/div[2]/div/div[4]/button[2]");
            //支付成功
            public static By zhifuchenggong_yijian=By.xpath("//*[@id=\"moneySuccess\"]/div[1]/div/div[2]/div/p");
            //关闭
            public static By guanbi_yijian=By.xpath("//*[@id=\"moneySuccess\"]/div[1]/div/div[3]/span/button");
}
