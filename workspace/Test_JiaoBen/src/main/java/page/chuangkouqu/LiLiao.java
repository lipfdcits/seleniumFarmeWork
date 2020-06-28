package page.chuangkouqu;

import org.openqa.selenium.By;

public class LiLiao {
    //理疗
    public static By liliao=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[1]");
    //待理疗
    public static By daililiao=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/label[1]/span");
    //已理疗
    public static By yililiao=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/label[2]/span");
    //开始执行
    public static By kaishizhixing=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[3]/table/tbody/tr[1]/td[8]/div/div[1]");
    //提交
    public static By tijiao=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[3]/div/button[1]/span");
    //取消
    public static By quxiao=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[3]/div/button[2]");
}
