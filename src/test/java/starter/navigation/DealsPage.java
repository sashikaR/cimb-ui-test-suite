package starter.navigation;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;


@DefaultUrl("https://deals.cimb.com/")
public class DealsPage extends PageObject {


    public Alert getAlert() {
        return getDriver().switchTo().alert();
    }

    public void closeAlert(){
        getDriver().switchTo().alert().dismiss();
    }

    public void closeBrowserNotification() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(2000);
    }
}
