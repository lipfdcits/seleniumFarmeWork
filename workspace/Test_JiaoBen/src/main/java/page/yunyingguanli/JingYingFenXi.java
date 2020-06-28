package page.yunyingguanli;

import org.openqa.selenium.By;

public class JingYingFenXi {
    //销售分析
    public static By xiaoshoufenxi=By.xpath("//*[@id=\"tab-salesAnalysis\"]");
    //销售趋势
    public static By xiaoshouqushi=By.xpath("//*[@id=\"pane-salesAnalysis\"]/div/div/div[2]/div[1]/span");
    //就诊分析
    public static By jiuzhenfenxi=By.xpath("//*[@id=\"tab-clinicAnalysis\"]");
    //趋势
    public static By qushi=By.xpath("//*[@id=\"pane-clinicAnalysis\"]/div/div/div/div[2]/div[1]/div[1]/div/span");
    //客单价
    public static By kedanjia=By.xpath("//*[@id=\"tab-guestPrice\"]");
    //平均客单价
    public static By pingjunkedanjia=By.xpath("//*[@id=\"pane-guestPrice\"]/div/div/div[1]/div[1]/span");
    //客流分析
    public static By keliufenxi=By.xpath("//*[@id=\"tab-passengerFlowAnalysis\"]");
    //用户画像
    public static By yonghuhuaxiang=By.xpath("//*[@id=\"pane-passengerFlowAnalysis\"]/div/div/div[3]/div[1]/div");
    //员工分析
    public static By yuangongfenxi=By.xpath("//*[@id=\"tab-staffAnalysis\"]");
    //理疗师
    public static By liliaoshi=By.xpath("//*[@id=\"pane-staffAnalysis\"]/div/div/div[1]/div[1]/div[1]/div/div[3]");
}
