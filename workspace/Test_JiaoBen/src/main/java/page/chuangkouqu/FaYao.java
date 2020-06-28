package page.chuangkouqu;

import org.openqa.selenium.By;

public class FaYao {
    //订单号
    public static By dingdanhao=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[2]/table/thead/tr/th[1]/div");
    //查询
    public static By chaxun=By.xpath("//*[@id=\"mediDistribute\"]/div/div/div[2]/div[3]/div[2]/button/span");
    //西药
    public static By xiyao=By.xpath("//*[@id=\"tab-west\"]");
        //西药_待发放
        public static By daifafang_xiyao=By.xpath("//*[@id=\"mediDistribute\"]/div/div/div[2]/div[2]/div[1]/label[1]/span");
            //西药_发药
            public static By fayao_xiayao=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[3]/table/tbody/tr[1]/td[8]/div/div[1]");
                //选择发放
                public static By xuanzefafang=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[2]/div/div[2]/div[1]");
                //西药_提交
                public static By tijiao_xiyao=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[3]/div/button[1]");
                //西药_取消
                public static By quxiao_quxiao=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[3]/div/button[2]");
        //西药_已发放
        public static By yifafang_xiyao=By.xpath("//*[@id=\"mediDistribute\"]/div/div/div[2]/div[2]/div[1]/label[2]/span");
            //西药_药单
            public static By yaodan_xiyao=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[3]/table/tbody/tr[1]/td[7]/div/div[2]");
                //发放药品
                public static By fafangyaopin=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/table/thead/tr/th[1]/div");
                //关闭
                public static By guanbi_xiyao=By.xpath("//*[@id=\"disPrescription\"]/div[1]/div/div[3]/div/button");
    //中药
    public static By zhongyao=By.xpath("//*[@id=\"tab-chinese\"]");
        //中药_待发放
        public static By daifafang_zhongyao=By.xpath("//*[@id=\"mediDistribute\"]/div/div/div[2]/div[3]/div[1]/label[1]/span");
            //中药_发药
            public static By fayao_zhongyao=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[3]/table/tbody/tr[1]/td[9]/div/div[1]");
                //调配:
                public static By tiaopei=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[2]/div/div[2]/p[2]/span[3]");
                //中药_提交
                public static By tijiao_zhongyao=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[3]/div/button[1]");
                //中药_取消
                public static By quxiao_zhongyao=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[3]/div/button[2]");
        //中药_已发放
        public static By yifafang_zhongyao=By.xpath("//*[@id=\"mediDistribute\"]/div/div/div[2]/div[3]/div[1]/label[2]/span");
            //中药_药单
            public static By yaodan_zhongyao=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[3]/table/tbody/tr[1]/td[8]/div/div[2]");
                //审核:
                public static By shenhe=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[2]/div/div[2]/p[2]/span[2]");
                //关闭
                public static By guanbi_zhongyao=By.xpath("//*[@id=\"prescription\"]/div[1]/div/div[3]/div/button");
            //抓药方式
            public static By zhuayaofangshi=By.xpath("//*[@id=\"tableMediDistribute\"]/div[1]/div[2]/table/thead/tr/th[8]/div");
            //提交成功
            public static By tijiaochenggong=By.xpath("/html/body/div[2]");
}
