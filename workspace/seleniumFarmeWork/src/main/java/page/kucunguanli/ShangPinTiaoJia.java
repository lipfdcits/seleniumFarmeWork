package page.kucunguanli;

import org.openqa.selenium.By;

public class ShangPinTiaoJia {
    //商品调价
    public static By shangpintiaojia=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[1]");
    //新增调价
    public static By xinzengtiaojia=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[3]/div[2]");
    //新增调价(标题)
    public static By xinzengtiaojiaTitle=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[1]");
    //添加商品
    public static By tianjiashangpin=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]");
    //返回
    public static By fanhui=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[4]/button[1]");
    //保存
    public static By baocun=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div[4]/button[2]");
    //添加商品(标题)
    public static By tianjiashangpinTitle=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[1]/div/span[2]");
    //确定
    public static By queding=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[4]/button[1]");
    //取消
    public static By quxiao=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[4]/button[2]");
}
