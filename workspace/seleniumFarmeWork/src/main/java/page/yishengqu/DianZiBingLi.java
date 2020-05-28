package page.yishengqu;

import org.openqa.selenium.By;

public class DianZiBingLi {
    //基本信息
    public static By jibenxinxi=By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[1]");
    //姓名
    public static By name= By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[2]/div[1]/div/div/div/div[1]/input");
    //性别
    public static By sex= By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[2]/div[2]/div/div/div/div[1]/input");
        //男
        public static By man= By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]");
        //女
        public static By woman= By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]");
    //年龄
    public static By age= By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[2]/div[3]/div[2]/div/div/input");
    //身高
    public static By shengao= By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[2]/div[4]/div/div/div/input");
    //体重
    public static By tizhong= By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[2]/div[6]/div/div/div/input");
    //电话
    public static By tel= By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[3]/div[1]/div/div/div/div[1]/input");
    //职业
    public static By job= By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[3]/div[3]/div/div/div/div/input");
    //来源
    public static By laiyuan= By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[3]/div[4]/div/div/div/div/input");
    //主诉
    public static By zhusu= By.xpath("//*[@id=\"diseaseInput\"]");
    //发病日期
    public static By fabingriqi= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/input");
    //选择日期
    public static By xuanzeriqi= By.xpath("/html/body/div[8]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[6]");
    //是否传染
    public static By shifouchuanran= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[2]/div[3]/div/div/div/svg[2]");
    //体温
    public static By tiwen= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[3]/div[1]/div/div/div/input");
    //呼吸
    public static By huxi= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[3]/div[2]/div/div/div/input");
    //脉搏
    public static By maibo= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[3]/div[3]/div/div/div/input");
    //血压-低压
    public static By diya= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[3]/div[4]/div[1]/div/div/input");
    //血压-高压
    public static By gaoya= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[3]/div[4]/div[2]/div/div/input");
    //过敏史
    public static By guominshi= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[4]/div/div/div/div/input");
    //既往史
    public static By jiwangshi= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[5]/div/div/div/div/input");
    //诊断信息
    public static By zhenduanxinxi= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[6]/div/div/div/div/input");
    //医嘱
    public static By yizhu= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[7]/div/div/div/div/div[1]/input");
    //历史病历
    public static By lishibingli= By.xpath("//*[@id=\"tab-lishi\"]");
    //辅助诊断
    public static By fuzhuzhenduan= By.xpath("//*[@id=\"tab-fuzhu\"]");
    //修改
    public static By xiugai= By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[2]/button");
    //查看历史病历
    public static By chakan= By.xpath("//*[@id=\"cardHistory\"]/div[2]/p[3]/span");
}
