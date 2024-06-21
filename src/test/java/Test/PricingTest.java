package Test;

import Page.PricingPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;
import static org.underlab.Constants.ConstantsLinks.*;

public class PricengTest extends BaseTest {
    @BeforeClass
    public void startPage() {
        open(PRICES_URI);
    }

    @Test
    public void testBlockSlider() {
        assertThat(PricingPage.getInstance().checkSliderPlans30()).contains("30","$240.00", "$25.00");
        assertThat(PricingPage.getInstance().checkSliderPlans500()).contains("500","$960.00", "$100.00");
        assertThat(PricingPage.getInstance().checkSliderPlans1000()).contains("1000+","$2400.00", "$250.00");

    }
}
