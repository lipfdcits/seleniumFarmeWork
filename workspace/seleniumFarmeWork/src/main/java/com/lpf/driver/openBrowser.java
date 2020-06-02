package com.lpf.driver;

import com.lpf.driver.logger.LoggerControler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//打开浏览器
public class openBrowser {
    final static LoggerControler log = LoggerControler.getLogger(openBrowser.class);
    public static WebDriver driver;
    public static WebDriver open(String browser){
        String path=System.getProperty("user.dir");
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",path+"/driver/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",path+"/driver/IEDriverServer.exe");
            driver=new InternetExplorerDriver();
        }else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver",path+"/driver/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if(browser.equals("edge")){
            System.setProperty("webdriver.edge.driver",path+"/driver/msedgedriver.exe");
            driver=new EdgeDriver();
        }else{
            log.warning("您传入的浏览器名称有误"+browser);
        }
        return driver;
    }



}
