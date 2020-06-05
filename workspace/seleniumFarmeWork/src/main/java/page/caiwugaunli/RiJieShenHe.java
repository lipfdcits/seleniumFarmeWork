package page.caiwugaunli;

import org.openqa.selenium.By;

public class RiJieShenHe {
    //日结审核
    public static By rijieshenhe=By.xpath("//*[@id=\"dailyReview\"]/div/div[1]/div[1]");
    //详情
    public static By xiangqing=By.xpath("//*[@id=\"dailyReview\"]/div/div[1]/div[3]/div[3]/table/tbody/tr[1]/td[15]/div/span[1]");
    //知道了
    public static By zhidaole=By.xpath("//*[@id=\"settleDay\"]/div[1]/div/div[3]/span/button");
    //日结详情
    public static By rijiexiangqing=By.xpath("//*[@id=\"settleDay\"]/div[1]/div/div[1]/span");
    //重审
    public static By chongshen=By.xpath("//*[@id=\"dailyReview\"]/div/div[1]/div[3]/div[3]/table/tbody/tr[1]/td[15]/div/span[2]");
    //日结审核(标题)
    public static By rijieshenheTitle=By.xpath("//*[@id=\"settleDay\"]/div[1]/div/div[1]/span");
    //审核通过
    public static By shenhetongguo=By.xpath("//*[@id=\"settleDay\"]/div[1]/div/div[2]/form/div[2]/div[1]/div/div/label[1]/span[2]");
    //审核失败
    public static By shenheshibai=By.xpath("//*[@id=\"settleDay\"]/div[1]/div/div[2]/form/div[2]/div[1]/div/div/label[2]/span[2]");
    //确认
    public static By queren=By.xpath("//*[@id=\"settleDay\"]/div[1]/div/div[3]/span/div/button[2]");
    //取消
    public static By quexiao=By.xpath("//*[@id=\"settleDay\"]/div[1]/div/div[3]/span/div/button[1]");
}
