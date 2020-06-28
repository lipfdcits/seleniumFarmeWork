package page.chuangkouqu;

import org.openqa.selenium.By;

public class LingShou {
    //新开订单
    public static By xinkaidingdan=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[1]/div[1]");
    //商品
    public static By shangpin=By.xpath("//*[@id=\"tab-product\"]");
        //商品名称
        public static By shangpinmingcheng=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[2]/div[1]/div[2]/table/thead/tr/th[1]/div");
            //加入购物车_商品
            public static By shangpinjiaru=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[5]/div/div");
    //项目
    public static By xiangmu=By.xpath("//*[@id=\"tab-project\"]");
        //产品名称
        public static By chanpinmingcheng=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[2]/div[2]/div[2]/table/thead/tr/th[1]/div");
            //加入购物车_项目
            public static By xiangmujiaru=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[2]/div[2]/div[3]/table/tbody/tr/td[4]/div/div");
    //挂单
    public static By guadan=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[2]/div[4]/div/div[3]/div[4]");
    //收款
    public static By shoukuan=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[2]/div[4]/div/div[3]/div[3]");
        //收款明细
        public static By shoukuanmingxi=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[2]/div[4]");
        //确定
        public static By queding=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[1]");
        //取消
        public static By quxiao=By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[2]");
    //姓名输入框
    public static By xingmingshuru=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[1]/div[2]/form/div/div[1]/div[1]/div/div[1]/div[1]/input");
        //请输入姓名
        public static By qingshuruxingming=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[1]/div[2]/form/div/div[1]/div[1]/div/div[2]");
    //电话输入框
    public static By dianhua=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[1]/div[2]/form/div/div[3]/div/div/div[1]/input");
        //请输入电话
        public static By qingshurushoujihao=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[1]/div[2]/form/div/div[3]/div/div/div[2]");
    //清空
    public static By qingkong=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[2]/div[4]/div/div[1]/span");
    //暂无内容
    public static By zanwuneirong=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[2]/div[4]/div/div[2]/div/div/div");
    //查询
    public static By chaxun=By.xpath("//*[@id=\"newOrder\"]/div[1]/div/div[3]/div[1]/button");

}
