package page;

import org.openqa.selenium.By;

public class loginPage {
    //用户名
    public static By user= By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input");
    //密码
    public static By password= By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input");
    //登陆
    public static By login= By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]");
    //验证码登陆
    public static By YanZhengMa= By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[3]/div[2]/span/span[2]");
    //立即注册
    public static By LiJiZhuCe= By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[3]/div[3]/span");
    //获取验证码
    public static By huoquyanzhengma= By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[3]/button/span");
    //密码登录
    public static By mimadenglu= By.xpath("  //*[@id=\"app\"]/div/div[2]/div/div[3]/div[2]/span/span[2]");
}
