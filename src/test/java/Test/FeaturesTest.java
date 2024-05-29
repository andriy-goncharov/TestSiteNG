package Test;

import Page.FeaturesPage;
import Page.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Test.HomePageTest.*;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;
import static org.underlab.Constants.ConstantsLinks.*;

public class FeaturesTest extends BaseTest {
    @BeforeClass
    public void startPage() {
        open(FEATURES_URI);
    }

    @Test
    public void tesBlockContent(){

        FeaturesPage.getInstance().checkBlockScheduling();
        FeaturesPage.getInstance().checkBlockMeet();
        FeaturesPage.getInstance().checkBlockExperience();
        FeaturesPage.getInstance().checkBlockFeatures();
        assertThat(FeaturesPage.getInstance().checkBtnGetstarted()).contains(NAME_PAGE_PANEL);
        assertThat(FeaturesPage.getInstance().checkBtnContact()).contains(NAME_PAGE_CONTACT);
    }
    @Test
    public void testShortMenuProduct(){
        FeaturesPage.getInstance().checkBlockPersonalDomain();
        assertThat(HomePage.getInstance().selectwebinarBranding()).contains(NAME_PAGE_BRANDING);
        assertThat(HomePage.getInstance().selectVideoConferencing()).contains(NAME_PAGE_VIDEO_CONF);
        assertThat(HomePage.getInstance().selectWebinarRecording()).contains(NAME_PAGE_REC);
        assertThat(HomePage.getInstance().selectWebinarAnalytics()).contains(NAME_PAGE_ANALYTICS);
        assertThat(HomePage.getInstance().selectCTA()).contains(NAME_PAGE_CTA);
    }
    @Test
    public void testShortFooter(){
        assertThat(HomePage.getInstance().checkFooterGuestWrite()).contains(NAME_PAGE_WRITE_US);
        assertThat(HomePage.getInstance().checkFooterContact()).contains(NAME_PAGE_CONTACT);
        assertThat(HomePage.getInstance().checkFooterSiteMap()).contains(NAME_PAGE_SITEMAP);
        assertThat(HomePage.getInstance().checkFootDictionary()).contains(NAME_PAGE_GLOSSARY);
        assertThat(HomePage.getInstance().checkFootTutorials()).contains(NAME_PAGE_SUPPORT);
        assertThat(HomePage.getInstance().checkFootPricing()).contains(NAME_PAGE_PRICING);
        assertThat(HomePage.getInstance().checkFootFAQ()).contains(NAME_PAGE_FAQ);
        assertThat(HomePage.getInstance().checkFootStreaming()).contains(NAME_PAGE_LIVE_WEB);
        assertThat(HomePage.getInstance().checkFootAutomation()).contains(NAME_PAGE_AUTOWEB);
        assertThat(HomePage.getInstance().checkFootConferencing()).contains(NAME_PAGE_VIDEO_CONF);
        assertThat(HomePage.getInstance().checkFootSharing()).contains(NAME_PAGE_SHARING);
    }


}
