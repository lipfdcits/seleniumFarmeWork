package com.lpf.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDriver {
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
            System.err.println("您输入有误:"+browser);
        }
        return driver;
    }

    public static void Closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
