package com.lpf.driver;

import java.io.IOException;

public class windowsClick {

    public static void windowsC() {

        //利用AutoIT实现图片上传
        Runtime exe = Runtime.getRuntime();
        // Java 的Runtime 模块的getruntime.exec()方法可以调用exe 程序并执行。
        try {
            String str = System.getProperty("user.dir")+"\\TestExcle\\打印.exe";
            exe.exec(str);
            // 运行指定位置的.exe文件
        } catch (IOException e) {
            System.out.println("Error to run the exe");
            e.printStackTrace();
        }
    }
}
