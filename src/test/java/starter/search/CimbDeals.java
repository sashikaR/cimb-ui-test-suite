package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CimbDeals {

    public static Target CIMB_HOME_PAGE_POP_UP_FIND_OUT_MORE= Target.the("CIMB Home Page Pop-up Window")
            .located(By.xpath("(//a[contains(.,'Find Out More')])[3]"));

    public static Target CIMB_DEALS_HOME_ADD = Target.the("Close the Add CIMB home page").located(By.xpath("//dialog[@data-uuid='938bd821-a1d1-44e6-94a1-5a47829a7063']"));

    public static Target CIMB_DEALS_PAGE_BRWSR_ALERT = Target.the("Close the browser notification alert").located(By.xpath("//div[@class='btn font-bold'][contains(.,'Accept and Close')]"));

    public static Target CIMB_DEALS_LINK = Target.the("CIMB Deals link").located(By.xpath("(//a[contains(.,'CIMB Deals')])[2]"));

    public static Target CIMB_DEALS_E_COMMERCE = Target.the("CIMB Deals link").located(By.xpath("//span[@class='pl-2 pr-2'][contains(.,'e-commerce')]"));

    public static Target CIMB_DEALS_VIEW_ALL = Target.the("View All").located(By.xpath("//a[@href='/my/e-commerce'][contains(.,'View All')]"));

    public static Target CIMB_DEALS_OCTO_TRAVEL = Target.the("OctoTravel").located(By.xpath("//div[@class='card-body'][contains(.,'e-commerce • OCTOTRAVEL 30% OFF for Domestic Flights Valid until 30 Sep 2022')]"));

    public static Target CIMB_DEALS_OCTO_TRAVEL_SIMILAR_DEALS = Target.the("OctoTravel Similar Deals").located(By.xpath("//p[@class='section-title pl-3'][contains(.,'Similar Deals')]"));

    public static Target CIMB_DEALS_OCTO_TRAVEL_HIGHLIGHT = Target.the("Highlights").located(By.xpath("//a[@class='nav-link active'][contains(.,'Highlights')]"));

    public static Target OCTO_TRAVEL_LIST_1 = Target.the("Deals Details").located(By.xpath("//div[@id='ngb-tab-0-panel']/div[1]/p[1]"));

    public static Target OCTO_TRAVEL_SIMILAR_DEALS = Target.the("Similar Deals").located(By.xpath("//p[@class='section-title pl-3'][contains(.,'Similar Deals')]"));

    public static Target OCTO_TRAVEL_SIMILAR_DEAL_1 = Target.the("OctoTravel").located(By.xpath("//p[contains(.,'e-commerce • OctoTravel')]"));

    public static Target OCTO_TRAVEL_SIMILAR_DEAL_2 = Target.the("Youbeli").located(By.xpath("//p[contains(.,'e-commerce • Youbeli')]"));

    public static Target OCTO_TRAVEL_SIMILAR_DEAL_3 = Target.the("Traveloka").located(By.xpath("//p[contains(.,'e-commerce • Traveloka')]"));

    public static Target OCTO_TRAVEL_SIMILAR_DEAL_4 = Target.the("Guardian").located(By.xpath("//p[contains(.,'e-commerce • Guardian')]"));




}
