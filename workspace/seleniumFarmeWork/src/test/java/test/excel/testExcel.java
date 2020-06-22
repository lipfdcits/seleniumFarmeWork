package test.excel;


import com.lpf.driver.tools.JxlFun;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class testExcel {
    @Test
    public void getExcel() throws IOException, BiffException {
        int a= JxlFun.readColumns("C:\\Users\\青小果6\\Desktop\\testExcel.xls","Sheet1");
        System.out.println(a);
    }

    @Test
    public void testReadText() throws IOException, BiffException {
        String a= JxlFun.readText("C:\\Users\\青小果6\\Desktop\\testExcel.xls","Sheet1",2,1);
        System.out.println(a);
    }

    @Test
    public void testReadRows() throws IOException, BiffException {
        int a=JxlFun.readRows("C:\\Users\\青小果6\\Desktop\\test1.xls","Sheet1");
        System.out.println(a);
    }

    @Test
    public void testReadColumns() throws IOException, BiffException {
        int a=JxlFun.readColumns("C:\\Users\\青小果6\\Desktop\\test1.xls","Sheet1");
        System.out.println(a);
    }

    @Test
    public void testAppendFormatTitle() throws WriteException, IOException, BiffException {
        JxlFun.appendFormatTitle("C:\\Users\\青小果6\\Desktop\\test1.xls","Sheet2",2,2,"TEST");
        System.out.println("OK");
    }

    @Test
    public void testAppendText() throws WriteException, IOException, BiffException {
        JxlFun.appendFormatTitle("C:\\Users\\青小果6\\Desktop\\test1.xls","Sheet2",3,3,"TEST");
        System.out.println("OK");
    }

    @Test
    public void random(){
        Random random=new Random();
        int a=random.nextInt(2);
        System.out.println(a);
    }



}
