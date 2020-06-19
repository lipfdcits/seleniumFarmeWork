package com.lpf.driver.tools;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;

public class Yzm {
    /**
     * 使用Tesseract-OCR识别图片验证码
     */
    public static String read_yzm() {
        String cmd = "cmd /c start D:/yanzhengma/tesseract.bat";
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //线程阻塞3秒等待tesseract.bat执行完成
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //执行tesseract.bat识别图片后生成result.txt文件中保存识别后验证码
        //读取result.txt文件获取验证码
//          ReadTxt
        String yzmTxt = readTxt("D:/yanzhengma/result.txt");
        return yzmTxt;
    }
    /**传入txt路径读取txt文件
     * @param txtPath
     * @return 返回读取到的内容
     */
    public static String readTxt(String txtPath) {
        File file = new File(txtPath);
        if(file.isFile() && file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuffer sb = new StringBuffer();
                String text = null;
                while((text = bufferedReader.readLine()) != null){
                    sb.append(text);
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static void pageYzm(File screenshot, WebElement ele) throws IOException {

        // Get entire page screenshot
        BufferedImage fullImg = ImageIO.read(screenshot);
        // Get the location of element on the page
        org.openqa.selenium.Point point= ele.getLocation();
        // Get width and height of the element
        int eleWidth= ele.getSize().getWidth();
        int eleHeight= ele.getSize().getHeight();
        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth,eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);
        // Copy the element screenshot to disk
        File screenshotLocation= new File("D:/yanzhengma/yzm.png");
        FileUtils.copyFile(screenshot, screenshotLocation);
    }

}

