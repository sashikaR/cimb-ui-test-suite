package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jfr.Description;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.navigation.DealsPage;
import starter.navigation.HomePage;
import starter.navigation.SwitchToDealsPage;
import starter.search.CimbDeals;
import starter.search.LookForDeals;

import java.time.Duration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static starter.search.CimbDeals.*;

public class CimbDealsStepDefinitions {

    HomePage homePage;
    CimbDeals cimbDeals;


    @Given("{actor} is on CIMB Home Page")
    public void followingCiamDeals(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(homePage).then(
//                        Click.on(By.xpath("//dialog[@data-uuid='938bd821-a1d1-44e6-94a1-5a47829a7063']"))
                        Click.on(CIMB_DEALS_HOME_ADD)
                )
        );
        actor.attemptsTo(
//                Click.on(By.xpath("//div[@class='btn font-bold'][contains(.,'Accept and Close')]"))
                Click.on(CIMB_DEALS_PAGE_BRWSR_ALERT)
        );
    }

    @When("{actor} click on CIMB Deals")
    public void he_click_on_cimb_deals(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                Click.on(CIMB_DEALS_LINK).afterWaitingUntilEnabled(),
                SwitchToDealsPage.switchToDealsPageTab(),
                LookForDeals.closeBrowserNotification(),
                WaitUntil.the(CimbDeals.CIMB_DEALS_E_COMMERCE,isVisible()).forNoMoreThan(120).seconds()
        );
    }

    @And("{actor} click on View All for Travel n Lifestyle")
    public void he_click_on_View_All_for_Travel_n_Lifestyle(Actor actor) throws InterruptedException {
        actor.attemptsTo(Click.on(cimbDeals.CIMB_DEALS_VIEW_ALL),
                WaitUntil.the(CimbDeals.CIMB_DEALS_OCTO_TRAVEL,isVisible()).forNoMoreThan(120).seconds()
        );
    }

    @And("{actor} would like to explore more for OctoTravel Visa Flights")
    public void viewAllforOctoTravelVisaFlights(Actor actor) {
        actor.attemptsTo(Click.on(cimbDeals.CIMB_DEALS_OCTO_TRAVEL),
                WaitUntil.the(CimbDeals.CIMB_DEALS_OCTO_TRAVEL_SIMILAR_DEALS,isVisible()).forNoMoreThan(120).seconds()
        );
    }

    @Then("{actor} will be able to see its details and other similar deals beneath it")
    public void should_see_information_about_similar_deals(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                WaitUntil.the(CimbDeals.CIMB_DEALS_OCTO_TRAVEL_HIGHLIGHT,isVisible()).forNoMoreThan(120).seconds(),
                Ensure.that(CimbDeals.OCTO_TRAVEL_LIST_1).hasText("Exclusively for CIMB Visa Credit Card!\n" +
                        "Enjoy 30% discount on your domestic flights when you book only on OctoTravel website or mobile app!\n" +
                        "Promo Codes: VISAFLIGHT30\n" +
                        "Visit OctoTravel NOW\n" +
                        "Booking period: 1 July 2022 - 30 September 2022\n" +
                        "Travel period: 1 July 2022 - 31 December 2022\n" +
                        "Terms and conditions apply."),
                Ensure.that(CimbDeals.OCTO_TRAVEL_SIMILAR_DEAL_1).hasText("E-COMMERCE • OCTOTRAVEL"),
                Ensure.that(CimbDeals.OCTO_TRAVEL_SIMILAR_DEAL_2).hasText("E-COMMERCE • YOUBELI"),
                Ensure.that(CimbDeals.OCTO_TRAVEL_SIMILAR_DEAL_3).hasText("E-COMMERCE • TRAVELOKA"),
                Ensure.that(CimbDeals.OCTO_TRAVEL_SIMILAR_DEAL_4).hasText("E-COMMERCE • GUARDIAN")
        );
    }
}
