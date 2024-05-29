package Page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.underlab.commands.BtnProductVerificationCurrentWindow;
import org.underlab.commands.BtnProductVerificationNewWindow;
import org.underlab.conditions.MyCustomConditions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.underlab.Constants.ConstantsLinks.*;


public class BasePage {
    private static final String LNG_EN = "EN";
    private static final String LNG_UA = "UA";
    private static final String LNG_PL = "PL";
    private static final String LNG_RU = "RU";
    private SelenideElement btnHome = $("a[id='menu-home']");

    private SelenideElement menuProducts = $("#menu-products");

    private SelenideElement browseOurBlog = $("div[class='text-block-18']");

    private SelenideElement Blog = $(".button-row");

    private SelenideElement icoAutomatedWebinars = $x("//img[contains(@src, 'automated')]");
    private SelenideElement icoPollsAndSurveys = $x("//img[contains(@src, 'polls')]");
    private SelenideElement icoWebRoom = $x("//img[contains(@src, 'webinar-room')]");
    private SelenideElement icoBroadcasting = $x("//img[contains(@src, 'menu-secure-broadcasting')]");
    private SelenideElement icoLiveWeb = $x("//img[contains(@src, 'live-webinars')]");
    private SelenideElement icoSharing = $x("//img[contains(@src, 'screen-sharing')]");
    private SelenideElement icoBranding = $x("//img[contains(@src, 'webinar-branding')]");
    private SelenideElement icoDiscoverWeb = $x("//img[contains(@src, 'what-is-a-webinar')]");
    private SelenideElement icoVideconf = $x("//img[contains(@src, 'conferencing')]");
    private SelenideElement icoRecording = $x("//img[contains(@src, 'recording')]");
    private SelenideElement icoAnalitics = $x("//img[contains(@src, 'analytics')]");
    private SelenideElement icoCTA = $x("//img[contains(@src, 'cta')]");
    private SelenideElement imgBrowseOurBlog = $x("//img[contains(@src, 'webinar-room')]");

    private SelenideElement linkSignForFreeMenuProduct = $("a[class='nav-cont-bottom-cont-right-link']");
    private SelenideElement icoWallet = $x("//img[contains(@src,'pricing-plans.svg')]");
    private SelenideElement icoDemo = $x("//img[contains(@src, 'demo.svg')]");
    private SelenideElement icoChat = $x("//img[contains(@title, 'Chat')]");


//////////////////////////////////////////////////////////////////////////////////////

    public SelenideElement menuResources = $("div[id='menu-resources']");


    private SelenideElement icoFAQ = $x("//img[contains(@src, 'faq')]");
    private SelenideElement icoGlossary = $x("//img[contains(@src, 'gloassary')]");
    private SelenideElement icoHelpCener = $x("//img[contains(@src, 'help-center')]");
    private SelenideElement icoContactUS = $x("//img[contains(@title, 'Contact')]");
    private SelenideElement icoWriteForUS = $x("//img[contains(@src, 'write-for-us')]");
    private SelenideElement icoBlog = $x("//img[contains(@src, 'menu-blog')]");
    private SelenideElement windowHelp = $("span[class='cc-w9jl cc-raer']");
    private SelenideElement imgHostMeeting = $x("//img[contains(@src, 'host-a-meeting.jpg')]");
    private SelenideElement imgJoinMeeting = $x("//img[contains(@src, 'join-a-meeting.jpg')]");
    private SelenideElement textAllVideoTutorials = $("div[class='text-block-155']");
    private SelenideElement btnWatchVideoInstant = $("div[class='text-block-134']");
    private SelenideElement btnWatchVideoJoin = $("div[class='text-block-133']");
    private SelenideElement linkJoinForFreeMenuResources = $(".nav-cont-bottom-cont-right-link-2");

    public SelenideElement menuFeatures = $("a[id='menu-features']");

    public SelenideElement menuPricing = $("a[id='menu-pricing']");


    public SelenideElement lngMenu = $(".dropdown-lang-wrapper");

    public SelenideElement lngRU = $("a[hreflang='ru']");
    public SelenideElement lngEN = $("a[hreflang='en']");
    public SelenideElement lngUA = $("a[hreflang='uk']");
    public SelenideElement lngPL = $("a[hreflang='pl']");
    public SelenideElement linkSign = $(".header-menu-item-sign-in-button");


    //////////// Footer
    private SelenideElement footContact = $x("//div[@class='footer-link-div']/a[@href='./contact/']");
    private SelenideElement footArticles = $x("//div[@class='footer-link-div']/a[@href='./write-for-us/']");
    private SelenideElement footMap = $x("//div[@class='footer-link-div']/a[@href='./sitemap/']");
    private SelenideElement footFeatures = $x("//div[@class='footer-link-div']/a[@href='./features/']");
    private SelenideElement footDictionary = $x("//div[@class='div-block-47']/a[@href='./glossary/']");
    private SelenideElement footTutorials = $x("//a[contains(@href, 'https://support.myownconference.com/en/category/videos-1eu9d52/')]");
    private SelenideElement footPricing = $x("//div[@class='footer-link-div']/a[@href='./pricing/']");
    private SelenideElement footFAQ = $x("//div[@class='footer-link-div']/a[@href='./faq/']");
    private SelenideElement footStreaming = $x("//div[@class='footer-link-div']/a[@href='./live-webinars/']");
    private SelenideElement footAutomation = $x("//div[@class='footer-link-div']/a[@href='./automated-webinars/']");
    private SelenideElement footConferencing = $x("//div[@class='footer-link-div']/a[@href='./video-conferencing/']");
    private SelenideElement footSharing = $x("//div[@class='footer-link-div']/a[@href='./screen-sharing/']");
    private SelenideElement footOnlineSurveys = $x("//div[@class='footer-link-div']/a[@href='./polls-and-surveys/']");
    private SelenideElement footWebinarRoom = $x("//div[@class='footer-link-div']/a[@href='./webinar-room/']");
    private SelenideElement footAnalytics = $x("//div[@class='footer-link-div']/a[@href='./webinar-analytics/']");
    private SelenideElement footBranding = $x("//div[@class='footer-link-div']/a[@href='./webinar-branding/']");
    private SelenideElement footRecording = $x("//div[@class='footer-link-div']/a[@href='./webinar-recording/']");
    private SelenideElement footAgreements = $x("//div[@class='footer-link-div']/a[@href='./user-agreements/']");
    private SelenideElement footPrivacy = $x("//div[@class='footer-link-div']/a[@href='./privacy-policy/']");
    private SelenideElement footRefund = $x("//div[@class='footer-link-div']/a[@href='./refund-policy/']");
    private SelenideElement footRegister = $x("//div[@class='footer-link-div-register']/a[contains(@href,'app.myownconference.com/en/signup')]");
    private SelenideElement footLogin = $x("//div[@class='footer-link-div']/a[contains(@href,'app.myownconference.com/en')]");

    public SelenideElement btnBackTop = $(".back-to-top-text");





    public void HomeEN() {
        btnHome.shouldBe(visible).should(clickable).click();
        webdriver().shouldHave(MyCustomConditions.urlEndsWith(".com"));
    }

    public String selectAutomatedWebinars() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoAutomatedWebinars.shouldBe(visible).shouldBe(clickable).shouldBe(image);
        return icoAutomatedWebinars.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectPollsAndSurveys() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoPollsAndSurveys.shouldBe(visible).shouldBe(clickable).shouldBe(image);
        return icoPollsAndSurveys.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectWebinarRoom() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoWebRoom.should(visible).should(clickable).shouldBe(image);
        return icoWebRoom.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectSecureBroadcasting() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoBroadcasting.shouldBe(visible).shouldBe(clickable).shouldBe(image);
        return icoBroadcasting.parent().execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String selectLiveWebinars() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoLiveWeb.should(visible).should(clickable).shouldBe(image);
        return icoLiveWeb.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectScreenSharing() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoSharing.should(visible).should(clickable).shouldBe(image);
        return icoSharing.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectwebinarBranding() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoBranding.should(visible).should(clickable).shouldBe(image);
        return icoBranding.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectDiscoverWeb() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoDiscoverWeb.should(visible).should(clickable).shouldBe(image);
        return icoDiscoverWeb.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectVideoConferencing() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoVideconf.should(visible).should(clickable).shouldBe(image);
        return icoVideconf.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectWebinarRecording() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoRecording.should(visible).should(clickable).shouldBe(image);
        return icoRecording.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectWebinarAnalytics() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoAnalitics.should(visible).should(clickable).shouldBe(image);
        return icoAnalitics.parent().execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectCTA() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoCTA.should(visible).should(clickable).shouldBe(image);
        return icoCTA.parent().execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String selectBrowseOurBlog() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        imgBrowseOurBlog.should(visible).should(clickable).shouldBe(image);
        return browseOurBlog.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String selectJoinInMenuProduct() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        linkSignForFreeMenuProduct.should(visible).should(clickable);
        return linkSignForFreeMenuProduct.execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectPricingMenuProduct() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoWallet.should(visible).should(clickable).isImage();
        return icoWallet.execute(new BtnProductVerificationCurrentWindow()).toString();
    }

    public String selectDemoMenuProduct() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoDemo.should(visible).should(clickable);
        return icoDemo.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String selectChatMenuProduct() {
        menuProducts.should(visible).should(clickable);
        actions().moveToElement(menuProducts).perform();
        icoChat.should(visible).should(clickable);
        return icoChat.execute(new BtnProductVerificationNewWindow()).toString();
    }

//////////////////////// menu resources

    public String selectFAQ() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        icoFAQ.should(visible).should(clickable).shouldHave(image);
        return icoFAQ.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String selectGlossary() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        icoGlossary.should(visible).should(clickable).shouldBe(image);
        return icoGlossary.parent().execute(new BtnProductVerificationNewWindow()).toString();
    }

    public void selectHelpCenter() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        icoHelpCener.should(visible).should(clickable).shouldBe(image).click();
        windowHelp.should(visible).should(clickable);
    }

    public String selectContact() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        icoContactUS.should(visible).should(clickable).shouldBe(image);
        return icoContactUS.parent().execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String selectWriteForUs() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        icoWriteForUS.should(visible).should(clickable).shouldBe(image);
        return icoWriteForUS.parent().execute(new BtnProductVerificationNewWindow()).toString();
    }


    public String selectBlog() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        icoBlog.should(visible).should(clickable).shouldBe(image);
        return icoBlog.parent().execute(new BtnProductVerificationNewWindow()).toString();
    }

    public void selecAllVideoTutorials() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        textAllVideoTutorials.shouldBe(visible).shouldBe(clickable).click();
        WebDriverRunner.url().startsWith("youtube");
        switchTo().window(1);
        closeWindow();
        switchTo().window(0);
    }


    public void selectHostInstantMeeting() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        btnWatchVideoInstant.shouldBe(visible).shouldBe(clickable);
        imgHostMeeting.shouldBe(visible).shouldBe(clickable).shouldBe(image).click();
        WebDriverRunner.url().startsWith("youtube");
        switchTo().window(1);
        closeWindow();
        switchTo().window(0);
    }

    public void selectJoinMeeting() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        btnWatchVideoJoin.shouldBe(visible).shouldBe(clickable);
        imgJoinMeeting.shouldBe(visible).shouldBe(clickable).shouldBe(image).click();
        WebDriverRunner.url().startsWith("youtube");
        switchTo().window(1);
        closeWindow();
        switchTo().window(0);
    }

    public String selectJoinInMenuResources() {
        menuResources.should(visible).should(clickable);
        actions().moveToElement(menuResources).perform();
        linkJoinForFreeMenuResources.should(visible).should(clickable);
        return linkJoinForFreeMenuResources.execute(new BtnProductVerificationNewWindow()).toString();
    }


    //////////////////////////////////////// menu Features


    public void selecLinguage(String lng) {
        lngMenu.click();
        lngEN.should(visible).should(clickable);
        lngUA.should(visible).should(clickable);
        lngPL.should(visible).should(clickable);
        lngRU.should(visible).should(clickable);
        switch (lng) {
            case LNG_PL:
                lngPL.click();
                webdriver().shouldHave(MyCustomConditions.urlEndsWith("/pl"));
                break;
            case LNG_UA:
                lngPL.click();
                webdriver().shouldHave(MyCustomConditions.urlEndsWith("/uk"));
                break;
            case LNG_RU:
                lngRU.click();
                webdriver().shouldHave(MyCustomConditions.urlEndsWith("/ru"));
                break;
            default:
                lngEN.click();
        }

    }
////////////////////////////// footer

    public String checkFooterELsNewWindow(SelenideElement footerElement, String adress) {
        footerElement.scrollIntoView(false);
        footerElement.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().shouldHave(MyCustomConditions.urlEndsWith(adress));
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }

    public String checkFooterELsThisWindow(SelenideElement footerElement, String adress) {
        footerElement.scrollIntoView(false);
        footerElement.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(0).getTitle().toLowerCase();
        webdriver().shouldHave(MyCustomConditions.urlEndsWith(adress));
        WebDriverRunner.getWebDriver().navigate().back();
        return pageTitle;
    }


    public String checkFooterContact() {
        return checkFooterELsNewWindow(footContact, CONTACT_URI);
    }

    public String checkFooterGuestWrite() {
        return checkFooterELsNewWindow(footArticles, CUEST_WRITE_URI);
    }

    public String checkFooterSiteMap() {
        return checkFooterELsNewWindow(footMap, SITE_MAP_URI);
    }

    public String checkFootFeatures() {
        return checkFooterELsThisWindow(footFeatures, FEATURES_URI);
    }

    public String checkFootDictionary() {
        return checkFooterELsNewWindow(footDictionary, DICTIONARY_URI);
    }

    public String checkFootTutorials() {
        return checkFooterELsNewWindow(footTutorials, TUTORIALS_URI);
    }

    public String checkFootPricing() {
        return checkFooterELsThisWindow(footPricing, PRICES_URI);
    }

    public String checkFootFAQ() {
        return checkFooterELsNewWindow(footFAQ, FAQ_URI);
    }

    public String checkFootStreaming() {
        return checkFooterELsThisWindow(footStreaming, LIVE_WEBINARS_URI);
    }

    public String checkFootAutomation() {
        return checkFooterELsThisWindow(footAutomation, AUTOMATED_URI);
    }

    public String checkFootConferencing() {
        return checkFooterELsThisWindow(footConferencing, CONFERENCING_URI);
    }

    public String checkFootSharing() {
        return checkFooterELsThisWindow(footSharing, SHARING_URI);
    }

    public String checkFootfootSurveys() {
        return checkFooterELsThisWindow(footOnlineSurveys, SURVEYS_URI);
    }

    public String checkFootWebinarRoom() {
        return checkFooterELsThisWindow(footWebinarRoom, ROOM_URI);
    }

    public String checkFootAnalytics() {
        return checkFooterELsThisWindow(footAnalytics, ANALYTICS_URI);
    }

    public String checkFootBranding() {
        return checkFooterELsThisWindow(footBranding, BRANDING_URI);
    }

    public String checkFootRecording() {
        return checkFooterELsThisWindow(footRecording, RECORDING_URI);
    }

    public String checkFootAgreements() {
        return checkFooterELsNewWindow(footAgreements, AGREEMENTS_URI);
    }

    public String checkFootPrivacy() {
        return checkFooterELsNewWindow(footPrivacy, PRIVACY_URI);
    }

    public String checkFootRefund() {
        return checkFooterELsNewWindow(footRefund, REFUND_URI);
    }

    public String checkFootRegister() {
        footRegister.scrollIntoView(false);
        footRegister.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().driver().url().contains(LOGIN_URI);
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }

    public String checkFootLogin() {
        footLogin.scrollIntoView(false);
        footLogin.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().driver().url().contains(LOGIN_URI);
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }

    public String selectFeatures() {
        return checkFooterELsThisWindow(menuFeatures, FEATURES_URI);
    }

    public String selectPricing() {
        return checkFooterELsThisWindow(menuPricing, PRICES_URI);

    }



}
