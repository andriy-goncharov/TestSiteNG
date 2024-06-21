package Page;

import com.codeborne.selenide.*;
import org.openqa.selenium.interactions.Actions;
import org.underlab.commands.BtnProductVerificationNewWindow;

import java.util.ArrayList;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;
import static org.underlab.Constants.ConstantsLinks.CONTACT_URI;
import static org.underlab.Constants.ConstantsLinks.LOGIN_URI;

public class PricingPage extends BasePage {


    private SelenideElement fieldPlan = $("div[id='plan-attendees-a']");
    private SelenideElement fieldPriceYear = $("#plan-price-y");
    private SelenideElement fieldPriceMonth = $("#plan-price-m");
    private SelenideElement priceSlider = $("#plans-slider");
    private ElementsCollection priceSliderMarks = $$("div[class='slider-mark']");

    private SelenideElement btnTryNowBasic = $("a[class^='btn-free-plan']");
    private SelenideElement btnTryBusinessPlan = $("#business-plan-try");
    private SelenideElement btnContactSales = $("a[class^='btn-enterprise-plan']");

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

    public ArrayList checkSliderPlan500() {
        ArrayList<String> result = new ArrayList<>();
         priceSlider.click();
        result.add(fieldPlan.getText());
        result.add(fieldPriceYear.getText());
        result.add(fieldPriceMonth.getText());
        return result;
    }
    public ArrayList checkSliderPlan1000() {
        ArrayList<String> result = new ArrayList<>();
        int targetOffset = priceSliderMarks.get(0).getLocation().getX();
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.clickAndHold(priceSlider)
                .moveByOffset(targetOffset,0).release().perform();

        result.add(fieldPlan.getText());
        result.add(fieldPriceYear.getText());
        result.add(fieldPriceMonth.getText());
        return result;
    }
    public ArrayList checkSliderPlan30() {
        ArrayList<String> result = new ArrayList<>();
        fieldPlan.click();
        result.add(fieldPlan.getText());
        result.add(fieldPriceYear.getText());
        result.add(fieldPriceMonth.getText());
        return result;
    }
    public String testSignUPBasic() {
        btnTryNowBasic.scrollIntoView(false);
        btnTryNowBasic.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().driver().url().contains(LOGIN_URI);
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }
    public String testSignUPBusines() {
        btnTryBusinessPlan.scrollIntoView(false);
        btnTryBusinessPlan.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().driver().url().contains(LOGIN_URI);
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }
    public String testBtnContactSales() {
        btnContactSales.scrollIntoView(false);
        btnContactSales.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().driver().url().contains(CONTACT_URI);
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }
    public void testAllPricingPlans(){
        btnAllPricingPlans.scrollIntoView(false);
        btnAllPricingPlans.shouldBe(visible).shouldBe(clickable).click();
        planBusines30.shouldBe(visible).shouldBe(clickable);
    }
}
