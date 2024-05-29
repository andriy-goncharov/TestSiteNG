package Test;

import Page.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;
import static org.underlab.Constants.ConstantsLinks.*;

public class HomePageTest extends BaseTest {
    @BeforeClass
    public void startPage() {
        open("/");
    }

    @Test
    public void testBlokckfirstMenu() {
        assertThat(HomePage.getInstance().testSignUP()).contains(NAME_PAGE_PANEL);
        assertThat(HomePage.getInstance().testlinkSeeAction()).contains(NAME_ROOM);
        HomePage.getInstance().imgStartMenu();
        assertThat(HomePage.getInstance().testlinkDiscoverMore()).contains(NAME_PAGE_FEATURES);
        assertThat(HomePage.getInstance().testBlockCollaborate()).contains(NAME_PAGE_PANEL);


    }

    @Test
    public void testBlockPosts1() {
        assertThat(HomePage.getInstance().testBtnAllPosts()).contains(NAME_BLOG_START_PAGE);
        assertThat(HomePage.getInstance().testImageVirtualClassroom()).contains(NAME_BLOG_CLASSROOM);
        assertThat(HomePage.getInstance().testImageOnlineMeeting()).contains(NAME_BLOG_MEETING);
        assertThat(HomePage.getInstance().testImageWibenarFeedback()).contains(NAME_BLOG_WEBINAR_FEEDBACK);
        assertThat(HomePage.getInstance().testBtnTestRoom()).contains(NAME_ROOM);
        assertThat(HomePage.getInstance().testBtnContact()).contains(NAME_PAGE_CONTACT);
        assertThat(HomePage.getInstance().testGetStartedNow()).contains(NAME_PAGE_PANEL);
    }


    @Test
    public void testMenu() {
        assertThat(HomePage.getInstance().selectAutomatedWebinars()).contains(NAME_PAGE_AUTOWEB);
        assertThat(HomePage.getInstance().selectPollsAndSurveys()).contains(NAME_PAGE_POLLS_SURVEYS);
        assertThat(HomePage.getInstance().selectWebinarRoom()).contains(NAME_PAGE_WEBINAR_ROOM);
        assertThat(HomePage.getInstance().selectSecureBroadcasting()).contains(NAME_PAGE_SECURE_TECH);
        assertThat(HomePage.getInstance().selectLiveWebinars()).contains(NAME_PAGE_LIVE_WEB);
        assertThat(HomePage.getInstance().selectDiscoverWeb()).contains(NAME_PAGE_WHAT_IS_WEB);
        assertThat(HomePage.getInstance().selectScreenSharing()).contains(NAME_PAGE_SHARING);
        assertThat(HomePage.getInstance().selectwebinarBranding()).contains(NAME_PAGE_BRANDING);
        assertThat(HomePage.getInstance().selectVideoConferencing()).contains(NAME_PAGE_VIDEO_CONF);
        assertThat(HomePage.getInstance().selectWebinarRecording()).contains(NAME_PAGE_REC);
        assertThat(HomePage.getInstance().selectWebinarAnalytics()).contains(NAME_PAGE_ANALYTICS);
        assertThat(HomePage.getInstance().selectCTA()).contains(NAME_PAGE_CTA);
        assertThat(HomePage.getInstance().selectBrowseOurBlog()).contains(NAME_BLOG_START_PAGE);
        assertThat(HomePage.getInstance().selectPricingMenuProduct()).contains(NAME_PAGE_PRICING);
        assertThat(HomePage.getInstance().selectDemoMenuProduct()).contains(NAME_ROOM);
        assertThat(HomePage.getInstance().selectChatMenuProduct()).contains(NAME_PAGE_CONTACT);
    }

    @Test
    public void testMenuResources() {
        assertThat(HomePage.getInstance().selectFAQ()).contains(NAME_PAGE_FAQ);
        assertThat(HomePage.getInstance().selectGlossary()).contains(NAME_PAGE_GLOSSARY);
//        HomePage.getInstance().selectHelpCenter(); // не под нами
        assertThat(HomePage.getInstance().selectContact()).contains(NAME_PAGE_CONTACT);
        assertThat(HomePage.getInstance().selectWriteForUs()).contains(NAME_PAGE_WRITE_US);

        assertThat(HomePage.getInstance().selectBlog()).contains(NAME_BLOG_START_PAGE);
        HomePage.getInstance().selecAllVideoTutorials();
        HomePage.getInstance().selectHostInstantMeeting();
        HomePage.getInstance().selectJoinMeeting();
        assertThat(HomePage.getInstance().selectJoinInMenuResources()).contains(NAME_PAGE_PANEL);


    }

    @Test
    public void testMenuFeaturesPricing() {
        assertThat(HomePage.getInstance().selectFeatures()).contains(NAME_PAGE_FEATURES);
        assertThat(HomePage.getInstance().selectPricing()).contains(NAME_PAGE_PRICING);

    }

    @Test
    public void myTestFooter() {

        assertThat(HomePage.getInstance().checkFooterGuestWrite()).contains(NAME_PAGE_WRITE_US);
        assertThat(HomePage.getInstance().checkFooterContact()).contains(NAME_PAGE_CONTACT);
        assertThat(HomePage.getInstance().checkFooterSiteMap()).contains(NAME_PAGE_SITEMAP);
        assertThat(HomePage.getInstance().checkFootFeatures()).contains(NAME_PAGE_FEATURES);
        assertThat(HomePage.getInstance().checkFootDictionary()).contains(NAME_PAGE_GLOSSARY);
        assertThat(HomePage.getInstance().checkFootTutorials()).contains(NAME_PAGE_SUPPORT);
        assertThat(HomePage.getInstance().checkFootPricing()).contains(NAME_PAGE_PRICING);
        assertThat(HomePage.getInstance().checkFootFAQ()).contains(NAME_PAGE_FAQ);
        assertThat(HomePage.getInstance().checkFootStreaming()).contains(NAME_PAGE_LIVE_WEB);
        assertThat(HomePage.getInstance().checkFootAutomation()).contains(NAME_PAGE_AUTOWEB);
        assertThat(HomePage.getInstance().checkFootConferencing()).contains(NAME_PAGE_VIDEO_CONF);
        assertThat(HomePage.getInstance().checkFootSharing()).contains(NAME_PAGE_SHARING);
        assertThat(HomePage.getInstance().checkFootfootSurveys()).contains(NAME_PAGE_POLLS_SURVEYS);
        assertThat(HomePage.getInstance().checkFootWebinarRoom()).contains(NAME_PAGE_WEBINAR_ROOM);
        assertThat(HomePage.getInstance().checkFootAnalytics()).contains(NAME_PAGE_ANALYTICS);
        assertThat(HomePage.getInstance().checkFootBranding()).contains(NAME_PAGE_BRANDING);
        assertThat(HomePage.getInstance().checkFootRecording()).contains(NAME_PAGE_REC);
        assertThat(HomePage.getInstance().checkFootAgreements()).contains(NAME_PAGE_AGREEMENTS);
        assertThat(HomePage.getInstance().checkFootPrivacy()).contains(NAME_PAGE_PRIVACY);
        assertThat(HomePage.getInstance().checkFootRefund()).contains(NAME_PAGE_REFUND);
        assertThat(HomePage.getInstance().checkFootRegister()).contains(NAME_PAGE_PANEL);
        assertThat(HomePage.getInstance().checkFootLogin()).contains(NAME_PAGE_PANEL);
        HomePage.getInstance().checkBtnTop();

    }


}
