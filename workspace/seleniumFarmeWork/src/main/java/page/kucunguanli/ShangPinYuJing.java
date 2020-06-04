package page.kucunguanli;

import org.openqa.selenium.By;

public class ShangPinYuJing {
    //有效期预警
    public static By youxiaoqiyujing=By.xpath("//*[@id=\"tab-validity\"]");
    //库存预警
    public static By kucunyujing=By.xpath("//*[@id=\"tab-inventory\"]");
    //预警设置
    public static By yujingshezhi_youxiaoqiyujing=By.xpath("//*[@id=\"pane-validity\"]/div/div/div[3]");
    //全选
    public static By quanxuan=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div/div[2]/table/thead/tr/th[1]/div/label/span/span");
    //批量设置
    public static By piliangshezhi=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[1]/button");
    //返回
    public static By fanhui=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[2]/button[1]");
    //库存预警-预警设置
    public static By kucunyujing_kucunyujing=By.xpath("//*[@id=\"pane-inventory\"]/div/div/div[3]");
}
