

package Page;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;

import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class PricingPage extends BasePage {


    private SelenideElement fieldPlan = $("div[id='plan-attendees-a']");
    private SelenideElement fieldPriceYear = $("#plan-price-y");
    private SelenideElement fieldPriceMonth = $("#plan-price-m");
    private SelenideElement priceSlider = $("#plans-slider");
    private ElementsCollection priceSliderMarks = $$("div[class='slider-mark']");

    private SelenideElement btnTryNowBasic = $("a[class^='btn-free-plan']");
    private SelenideElement btnTryBusinessPlan = $("#business-plan-try");
    private SelenideElement btnContactSales = $("btn-enterprise-plan");

    public SelenideElement btnAllPricingPlans = $(".btn-all-plans");

    public SelenideElement btnTryNowDay = $(".btn-one-day-try");

    public SelenideElement btnGoListAllPlans = $(".btn-one-day-plans.w-inline-block");
    private ElementsCollection btnsGetStarted =$$(".pricing11_top-row-content-4");

    public SelenideElement btnBusinessPlan = $("#w-tabs-0-data-w-tab-0");
    public SelenideElement btnEnterprisePlan = $("div[class='text-block-105']");

    public SelenideElement planBusines30 = $("a[aria-controls='w-tabs-1-data-w-pane-0'] div");
    public SelenideElement planBusines150 = $("a[aria-controls='w-tabs-1-data-w-pane-3'] div");
    public SelenideElement planBusines500 = $("a[aria-controls='w-tabs-1-data-w-pane-7'] .text-block-88");

    public SelenideElement planEnterprise600 = $("a[aria-controls='w-tabs-2-data-w-pane-0']");
    public SelenideElement planEnterprise1000 = $("a[aria-controls='w-tabs-2-data-w-pane-4'] div");
    public SelenideElement planEnterprise5000 = $("a[aria-controls='w-tabs-2-data-w-pane-7']");



   



    public static PricingPage getInstance() {
        return new PricingPage();
    }

    public ArrayList checkSliderPlans500() {
        ArrayList<String> result = new ArrayList<>();
        priceSlider.dragAndDrop(to(priceSliderMarks.get(6))).click();
        result.add(fieldPlan.getText());
        result.add(fieldPriceYear.getText());
        result.add(fieldPriceMonth.getText());
        return result;
    }
    public ArrayList checkSliderPlans1000() {
        ArrayList<String> result = new ArrayList<>();
        priceSlider.dragAndDrop(to(priceSliderMarks.last())).click();
        result.add(fieldPlan.getText());
        result.add(fieldPriceYear.getText());
        result.add(fieldPriceMonth.getText());
        return result;
    }
    public ArrayList checkSliderPlans30() {
        ArrayList<String> result = new ArrayList<>();
        priceSlider.dragAndDrop(to(priceSliderMarks.first())).click();
        result.add(fieldPlan.getText());
        result.add(fieldPriceYear.getText());
        result.add(fieldPriceMonth.getText());
        return result;
    }
    public String testSignUP() {
        return new String();
//        return btnSignup.execute(new BtnProductVerificationNewWindow()).toString();
    }
}
