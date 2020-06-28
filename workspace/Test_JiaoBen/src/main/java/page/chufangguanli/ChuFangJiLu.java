package page.chufangguanli;

import org.openqa.selenium.By;

public class ChuFangJiLu {
    //处方记录
    public static By chufangjilu=By.xpath("//*[@id=\"prescriptionRecord\"]/div/div[1]/div[1]");
    //详情
    public static By xiangqing=By.xpath("//*[@id=\"prescriptionRecord\"]/div/div[1]/div[3]/div[3]/table/tbody/tr[1]/td[10]/div/div");
    //关闭
    public static By guanbi=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[3]/div/button");
}
