package starter.navigation;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SwitchToNewWindow;
import net.thucydides.core.annotations.Step;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class SwitchToDealsPage  implements Task {

    public SwitchToDealsPage(){}

    public static SwitchToDealsPage switchToDealsPageTab(){
        return Instrumented.instanceOf(SwitchToDealsPage.class).withProperties();
    }


    @Override
    @Step("{0} Switching to new Window")
    public <T extends Actor> void performAs(T t) {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow)){
                getDriver().switchTo().window(window);
                break;
            }
        }

    }
}
