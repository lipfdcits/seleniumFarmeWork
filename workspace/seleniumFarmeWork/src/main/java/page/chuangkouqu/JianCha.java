package page.chuangkouqu;

import org.openqa.selenium.By;

public class JianCha {
    //检查
    public static By jiancha=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[1]");
    //待检查
    public static By daijiancha=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/label[1]/span");
    //已检查
    public static By yijiancha=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/label[2]/span");
    //开始执行
    public static By kaishizhixing=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[3]/table/tbody/tr[1]/td[8]/div/div[1]");
    //取消
    public static By quxiao=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[3]/div/button[2]");
    //提交
    public static By tijiao=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[3]/div/button[1]");
}
