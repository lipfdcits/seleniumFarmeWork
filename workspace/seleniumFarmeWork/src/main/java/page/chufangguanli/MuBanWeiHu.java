package page.chufangguanli;

import org.openqa.selenium.By;

public class MuBanWeiHu {
    //经方模板
    public static By jingfangmuban=By.xpath("//*[@id=\"tab-classic\"]");
    //西药处方
    public static By xiyaochufang=By.xpath("//*[@id=\"tab-west\"]");
    //西药新增
    public static By xinzengxiyao=By.xpath("//*[@id=\"tempManage\"]/div[1]/div/div[2]/button");
    //中药处方
    public static By zhongyaochufang =By.xpath("//*[@id=\"tab-chinese\"]");
    //中药新增
    public static By xinzengzhongyao=By.xpath("//*[@id=\"tempManage\"]/div[1]/div/div[2]/button");
    //针剂
    public static By zhenji=By.xpath("//*[@id=\"tab-injection\"]");
    //针剂新增
    public static By xinzengzhenji=By.xpath("//*[@id=\"tempManage\"]/div[1]/div/div[2]/button");
}
