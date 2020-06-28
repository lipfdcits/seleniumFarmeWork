package lpf.driver;

import org.openqa.selenium.By;

import java.lang.reflect.Method;

public class SwitchUtil {
    public static void clickElement(By zongElement, By fenElement) throws InterruptedException {
        boolean panduan = elementFind.findElement(fenElement).isDisplayed();
        if (panduan) {
            Action.click(fenElement);
        } else {
            Action.click(zongElement);
            Action.click(fenElement);
        }
    }
}
