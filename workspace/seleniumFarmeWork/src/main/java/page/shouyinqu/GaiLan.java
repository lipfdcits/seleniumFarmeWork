package page.shouyinqu;

import org.openqa.selenium.By;

public class GaiLan {
    //预约挂号
    public static By yuyueguahao= By.xpath("//*[@id=\"cashMain\"]/div[1]/div[1]/div[1]/div/div[2]/div");
    //待收款
    public static By daishoukuan= By.xpath("//*[@id=\"cashMain\"]/div[1]/div[1]/div[2]/div/div[1]/p[2]");
    //待退款
    public static By daituikuan= By.xpath("//*[@id=\"cashMain\"]/div[1]/div[1]/div[3]/div/div[1]/p[2]");
    //订单编号(首行)
    public static By dingdanbianhao= By.xpath("//*[@id=\"cashMain\"]/div[1]/div[2]/div[2]/div/div[3]/table/tbody/tr[1]/td[1]");
    //查询
    public static By chaxun= By.xpath("//*[@id=\"cashMain\"]/div[1]/div[2]/div[1]/button");
    //退号
    public static By tuihao= By.xpath("//*[@id=\"cashMain\"]/div[1]/div[2]/div[2]/div/div[3]/table/tbody/tr[1]/td[11]/div/div[1]");
    //打印
    public static By dayin= By.xpath("//*[@id=\"cashMain\"]/div[1]/div[2]/div[2]/div/div[3]/table/tbody/tr[1]/td[11]/div/div[2]");
}
