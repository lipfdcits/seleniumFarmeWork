package page.xitongshezhi;

import org.openqa.selenium.By;

public class FeiYongSheZhi {
    //附加费
    public static By fujiafei=By.xpath("//*[@id=\"tab-surcharge\"]");
    //挂号费
    public static By guahaofei=By.xpath("//*[@id=\"tab-registration\"]");
    //煎药费
    public static By jianyaofei=By.xpath("//*[@id=\"tab-tisanes\"]");
    //新增处方附加费
    public static By xinzengchufangfujiafei=By.xpath("//*[@id=\"pane-surcharge\"]/div/div/div[3]");
    //按次收费
    public static By ancishoufei=By.xpath("//*[@id=\"pane-tisanes\"]/div/div/div[1]/label[2]/span[2]");
    //按剂收费
    public static By anjishoufei=By.xpath("//*[@id=\"pane-tisanes\"]/div/div/div[1]/label[1]/span[2]");
    //保存
    public static By baocun=By.xpath("//*[@id=\"pane-tisanes\"]/div/div/div[6]/button");
}
