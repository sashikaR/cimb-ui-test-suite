package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DriverTask;
import starter.navigation.DealsPage;

import java.awt.*;

public class LookForDeals {

    static DealsPage dealsPage;


    public static Performable switchToAlert() {
        dealsPage = new DealsPage();
        return new DriverTask(driver -> dealsPage.getAlert() );
    }

    public static Performable dismissedAlert() {
        dealsPage = new DealsPage();
        return new DriverTask(driver -> dealsPage.getAlert().dismiss() );
    }

    public static Performable closeBrowserNotification() {
        dealsPage = new DealsPage();
        return Task.where("{0} close to deals page browser Notification",
                actor -> {
                    try {
                        dealsPage.closeBrowserNotification();
                    } catch (AWTException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

    }
}
