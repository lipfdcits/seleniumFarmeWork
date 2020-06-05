package page.xitongshezhi;

import org.openqa.selenium.By;

public class ZhenSuoGuanLi {
    //设备管理
    public static By shebeiguanli=By.xpath("//*[@id=\"tab-config\"]");
    //设备信息
    public static By shebeixinxi=By.xpath("//*[@id=\"pane-config\"]/div/div/div[6]");
    //诊所设置
    public static By zhensuoshezhi=By.xpath("//*[@id=\"tab-clinic\"]");
    //诊所名称
    public static By zhensuomingcheng=By.xpath("//*[@id=\"pane-clinic\"]/div/div/form/div[1]/div/div[1]");
    //科室管理
    public static By keshiguanli=By.xpath("//*[@id=\"tab-department\"]");
    //新增科室
    public static By xinzengkeshi=By.xpath("//*[@id=\"pane-department\"]/div/div/div[2]");
    //岗位设置
    public static By gangweishezhi =By.xpath("//*[@id=\"tab-jobs\"]");
    //新增岗位
    public static By xinzenggangwei=By.xpath("//*[@id=\"pane-jobs\"]/div/div/div[2]");
    //成员管理
    public static By chengyuanguanli=By.xpath("//*[@id=\"tab-member\"]");
    //邀请新成员
    public static By yaoqingxinchengyuan=By.xpath("//*[@id=\"pane-member\"]/div/div/div[3]");
    //排班设置
    public static By paibanshezhi=By.xpath("//*[@id=\"tab-scheduling\"]");
    //排班时间
    public static By paibanshijian=By.xpath("//*[@id=\"pane-scheduling\"]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[7]/div/span");
    //提成设置
    public static By tichengshezhi=By.xpath("//*[@id=\"tab-commission\"]");
    //提成属性
    public static By tichengshuxing=By.xpath("//*[@id=\"pane-commission\"]/div/div/div[1]/div[3]/table/tbody/tr/td[4]/div/div[1]");
}
