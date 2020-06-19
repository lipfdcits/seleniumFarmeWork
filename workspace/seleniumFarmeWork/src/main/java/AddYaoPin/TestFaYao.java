package AddYaoPin;

import com.lpf.driver.Action;
import com.lpf.driver.SwitchUtil;
import com.lpf.driver.elementFind;
import com.lpf.driver.login;
import com.lpf.driver.tools.JxlFun;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.chuangkouqu.FaYao;
import page.firstPage;
import page.selectHospital;
import page.shouyinqu.GuaHao;

import java.io.IOException;

public class TestFaYao {

    //登录
    @BeforeTest
    public void loginPage() throws InterruptedException {
        login.loginAction("chrome","https://saas.qingxiaoguo.com","15110403429","123456");
        Action.click(selectHospital.zhenshuo3);
    }
    //关闭浏览器
//    @AfterTest
//    public void closed() throws InterruptedException {
//        Action.closed();
//    }
    @Test
    public void shujudaoru() throws InterruptedException, IOException, BiffException {
        String path=System.getProperty("user.dir")+"\\TestExcle\\数据.xls";
        //点击信息维护
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[3]/li/div"));
        //点击信息维护
        Action.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[3]/li/ul/div[3]/a/li"));
        for (int i = 2; i < JxlFun.readRows(path,"数据")+1; i++) {

            //点击添加商品
            Action.click(By.xpath("//*[@id=\"pane-shangpin\"]/div[4]"));
            //点击商品分类
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[2]/div[1]/div[1]/div/div/div[1]/input"));
            //点击中草药                /html/body/div[2]/div[1]/div[1]/ul/li[3]/span
            Action.click(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[3]/span"));
            //点击
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[2]/div[1]/div[2]/div/div/div/input"));
            //点击颗粒
            Action.click(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]"));
            //输入商品名称
            Action.sendText(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[2]/div[2]/div/div/div/input"),JxlFun.readText(path,"数据",i,2));
            //点击剂型
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[2]/div[3]/div/div/div/div[1]/input"));
            //选择剂型
            Action.click(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[2]"));
            //点击商品规格
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[3]/div[4]/div/div/div/div[1]/input"));
            //选择g
            Action.click(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[3]"));
            //输入零售价
            Action.sendText(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[3]/div[5]/div/div/div/input"),JxlFun.readText(path+"\\TestExcle\\数据.xls","数据",i,7));
            //点击保存
            Action.click(By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/div/button[1]"));
        }
    }


}
