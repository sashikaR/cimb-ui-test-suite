package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToCimb {

    DealsPage dealsPage;

    public static Performable theCimbHomePage() {
        return Task.where("{0} opens the CIMB home page",
                Open.browserOn().the(HomePage.class));
    }

    public static Performable theCimbDealsPage() {
        return Task.where("{0} opens the CIMB deals page",
                Open.browserOn().the(DealsPage.class));
    }
}
