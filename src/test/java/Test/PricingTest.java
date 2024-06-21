package Test;

import Page.HomePage;
import Page.PricingPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;
import static org.underlab.Constants.ConstantsLinks.*;

public class PricingTest extends BaseTest {
    @BeforeClass
    public void startPage() {
        open(PRICES_URI);
    }

    @Test
    public void testBlockSlider() {
        assertThat(PricingPage.getInstance().checkSliderPlan30()).contains("30","$240.00", "$25.00");
        assertThat(PricingPage.getInstance().checkSliderPlan500()).contains("500","$960.00", "$100.00");
        assertThat(PricingPage.getInstance().checkSliderPlan1000()).contains("1000+","$2400.00", "$250.00");
    }
    @Test
    public void testBtnsPlans(){
        assertThat(PricingPage.getInstance().testSignUPBasic()).contains(NAME_PAGE_PANEL);
        assertThat(PricingPage.getInstance().testSignUPBusines()).contains(NAME_PAGE_PANEL);
        assertThat(PricingPage.getInstance().testBtnContactSales()).contains(NAME_PAGE_CONTACT);
        PricingPage.getInstance().testAllPricingPlans();
    }
}
