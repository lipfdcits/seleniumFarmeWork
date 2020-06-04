package page.chuangkouqu;

import org.openqa.selenium.By;

public class ZhenJi {
    //针剂
    public static By zhenji=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[1]");
    //待执行
    public static By daizhixing=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/label[1]/span");
    //已执行
    public static By yizhixing=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/label[2]/span");
    //查询
    public static By chaxun=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/button");
    //开始执行
    public static By kaishizhixing=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[3]/table/tbody/tr[1]/td[8]/div/div[1]");
    //执行单
    public static By zhixingdan=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[3]/table/tbody/tr[1]/td[7]/div/div[2]");
    //提交
    public static By tijiao= By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[3]/div/button[1]");
    //取消
    public static By quxiao=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[3]/div/button[2]");
    //关闭
    public static By guanbi1=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[3]/div/button");
    //针剂单_执行单
    public static By zhenjidan=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[2]/div/div[1]/p[3]");
    //执行记录
    public static By zhixingjilu=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[2]/div/div[2]/div/div[1]");
}
