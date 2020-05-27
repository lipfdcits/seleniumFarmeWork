package com.lpf.driver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoggerControler {
    private static Logger logger=null;
    private static LoggerControler logg=null;
    public static LoggerControler getlogger(Class<?> T){
        if (logger==null){
            //处理配置文件
            Properties proper=new Properties();
            try {
                String path = System.getProperty("user.dir");
                String filePath=path+"/config/log4j.properties";
                InputStream is=new FileInputStream(filePath);
                proper.load(is);
                }catch (IOException e){
                e.printStackTrace();
            }
            PropertyConfigurator.configure(proper);
            logger=Logger.getLogger(T);
            logg=new LoggerControler();
        }
        return logg;
    }

    public void info(String msg){
        logger.info(msg);
    }
    public void debug(String msg){
        logger.debug(msg);
    }
    public void warn(String msg){
        logger.warn(msg);
    }
    public void err(String msg){
        logger.error(msg);
    }
}
