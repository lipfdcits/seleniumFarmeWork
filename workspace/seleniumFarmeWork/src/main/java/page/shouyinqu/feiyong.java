package page.shouyinqu;

import org.openqa.selenium.By;

public class feiyong {
    //日结
    public static By rijie= By.xpath("//*[@id=\"tab-rijie\"]");
    //统计
    public static By tongji= By.xpath("//*[@id=\"tab-feiyong\"]");
    //新增
    public static By xinzeng= By.xpath("//*[@id=\"pane-rijie\"]/div[1]/button[1]");
    //查询
    public static By chaxun= By.xpath("//*[@id=\"pane-rijie\"]/div[1]/button[2]");
    //查询条件
    public static By chaxuntiaojian= By.xpath("//*[@id=\"pane-rijie\"]/div[1]/div[1]/input");
    //审核状态
    public static By shenhezhuangtai= By.xpath("//*[@id=\"pane-rijie\"]/div[1]/div[2]/div/input");
        //全部
        public static By quanbu= By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[1]");
        //待审核
        public static By daishenhe= By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[2]");
        //审核通过
        public static By shenhetongguo= By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[3]");
        //审核失败
        public static By shenheshibai= By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[4]");
    //开始日期
    public static By kaishiriqi= By.xpath("//*[@id=\"pane-rijie\"]/div[1]/div[3]/input[1]");
    //结束日期
    public static By jiehsuriqi= By.xpath("//*[@id=\"pane-rijie\"]/div[1]/div[3]/input[2]");
    //撤销
    public static By chexiao= By.xpath("//*[@id=\"pane-rijie\"]/div[2]/div[3]/table/tbody/tr[1]/td[14]/div/div");
    //编号
    public static By bianhao= By.xpath("//*[@id=\"pane-rijie\"]/div[2]/div[3]/table/tbody/tr[1]/td[1]/div");
    //知道了
    public static By zhidao= By.xpath("//*[@id=\"settleDay\"]/div[1]/div/div[3]/span/button");
    //订单号
    public static By dingdanhao= By.xpath("//*[@id=\"pane-feiyong\"]/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[2]/div");
    //X号
    public static By X= By.xpath("//*[@id=\"orderInfo\"]/div[1]/div/div[1]/button");
}
