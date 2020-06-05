package page.yunyingguanli;

import org.openqa.selenium.By;

public class YongHuYunYing {
    //用户统计
    public static By yonghutongji=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[1]/ul/li[1]/div");
    //用户分组
    public static By yonghufenzu=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[1]/ul/li[2]/div");
    //添加统计
    public static By tianjiatongji=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[1]/div[1]/button[1]");
    //确认
    public static By queren=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[3]/div/button");
    //用户列表
    public static By tonghuliebiao=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[1]/div[1]/button[2]");
    //返回
    public static By fanhui=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/span[3]");
    //档案
    public static By dangan=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[12]/div/span");
    //返回-档案
    public static By fanhuidangan=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[2]/span");
    //基本信息
    public static By jibenxinxi=By.xpath("//*[@id=\"pane-record\"]/div/div/div[1]/span");
    //就诊记录
    public static By jiuzhenjilu=By.xpath("//*[@id=\"tab-seeRecord\"]");
    //电子病历
    public static By dianzibingli=By.xpath("//*[@id=\"pane-seeRecord\"]/div/div/div[1]/div/div[2]/div[1]/text()");
    //消费记录
    public static By xiaofeijilu=By.xpath("//*[@id=\"tab-consumption\"]");
    //消费日期
    public static By xiaofeiriqi=By.xpath("//*[@id=\"pane-consumption\"]/div/div/div[3]/div[2]/table/thead/tr/th[1]/div");
    //疾病图谱
    public static By jibingtupu=By.xpath("//*[@id=\"tab-disease\"]");
    //消费图谱
    public static By xiaofeitupu=By.xpath("//*[@id=\"tab-expense\"]");
    //用户价值
    public static By yonghujiazhi=By.xpath("//*[@id=\"pane-expense\"]/div/div/div[1]/div[1]/span[1]");
    //用户占比
    public static By yonghuzhanbi=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div");
    //编辑分组
    public static By bianjifenzu=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[2]/div[1]/button[1]");
    //创建分层
    public static By chuangjianfenceng=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[2]/div[1]/button[2]");
}
