package page.xitongshezhi;

import org.openqa.selenium.By;

public class XinXiWeiHu {
    //仓库信息
    public static By cangkuxinxi=By.xpath("//*[@id=\"tab-cangku\"]");
    //新建仓库
    public static By xinjiancangku=By.xpath("//*[@id=\"pane-cangku\"]/div/div[3]");
    //新增仓库
    public static By xinzengcangku=By.xpath("//*[@id=\"warehouseDialog\"]/div[1]/div/div[1]/span");
    //确认
    public static By queren=By.xpath("//*[@id=\"warehouseDialog\"]/div[1]/div/div[3]/span/button[1]");
    //取消
    public static By quxiao=By.xpath("//*[@id=\"warehouseDialog\"]/div[1]/div/div[3]/span/button[2]");
    //商品信息
    public static By shangpinxinxi=By.xpath("//*[@id=\"tab-shangpin\"]");
    //添加商品
    public static By tianjiashangpin=By.xpath("//*[@id=\"pane-shangpin\"]/div[4]");
    //商品基本信息
    public static By shangpinjibenxinxi=By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/form/div[1]/div[1]");
    //取消
    public static By quxiao_shangpin=By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/div/button[2]");
    //保存
    public static By baocun=By.xpath("//*[@id=\"productEdit\"]/div/div/div[1]/div/button[1]");
    //供应商
    public static By gongyingshang=By.xpath("//*[@id=\"tab-gongying\"]");
    //新建供应商
    public static By xinjiangongyingshang=By.xpath("//*[@id=\"pane-gongying\"]/div/div[3]");
    //新增供应商
    public static By xinzenggongyingshang=By.xpath("//*[@id=\"supplierDialog\"]/div[1]/div/div[1]/span");
    //确认
    public static By queren_gongyingshang=By.xpath("//*[@id=\"supplierDialog\"]/div[1]/div/div[3]/span/button[1]");
    //取消
    public static By quxiao_gongyingshang=By.xpath("//*[@id=\"supplierDialog\"]/div[1]/div/div[3]/span/button[2]");
}
