package Page;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.underlab.Constants.ConstantsLinks.CONTACT_URI;
import static org.underlab.Constants.ConstantsLinks.LOGIN_URI;

public class FeaturesPage extends BasePage {

    private SelenideElement imgCustomDomain = $("#custom-domain");

    ///////////// block scheduling
    private SelenideElement btnCreateWebinar = $("#w-tabs-0-data-w-tab-0 > img");
    private SelenideElement btnCustomization = $("#w-tabs-0-data-w-tab-1 > img");
    private SelenideElement btnIvite = $("#w-tabs-0-data-w-tab-2 > img");
    private SelenideElement btnContent = $("#w-tabs-0-data-w-tab-3 > img");

    private SelenideElement imgCreateWebinar = $x("//img[contains(@src, 'scheduled-webinars.png')]");
    private SelenideElement imgCustomization = $x("//img[contains(@src, 'webinar-preferences.png')]");
    private SelenideElement imgIvite = $x("//img[contains(@src, 'intended-audience.png')]");
    private SelenideElement imgContent = $x("//img[contains(@src, 'webinar-content.png')]");

    ///////////// block Meet face-to-face

    public SelenideElement btnVirtualConf = $("#w-tabs-1-data-w-tab-0 > img");
    public SelenideElement btnInstantMeeting = $("#w-tabs-1-data-w-tab-1 > img");
    public SelenideElement btnPrivateAccess = $("#w-tabs-1-data-w-tab-2 > img");

    private SelenideElement imgVirtualConf = $x("//img[contains(@src, 'feature-video-conferencing-mode')]");
    private SelenideElement imgInstantMeeting = $x("//img[contains(@src, 'instant-meetings')]");
    public SelenideElement imgPrivateAccess = $x("//img[contains(@src, 'private-access')]");

    /////////////// block experience

    public SelenideElement btnCustomLayout = $("#w-tabs-2-data-w-tab-0 > img");
    public SelenideElement btnCustomLanding = $("#w-tabs-2-data-w-tab-1 > img");
    public SelenideElement btnCustomEmails = $("#w-tabs-2-data-w-tab-2 > img");

    public SelenideElement imgCustomLayout = $x("//img[contains(@src, 'theme-and-layout.png')]");
    public SelenideElement imgCustomLanding = $x("//img[contains(@src, 'branded-landings.png')]");
    public SelenideElement imgCustomEmails = $x("//img[contains(@src, 'personalized-emails.png')]");

    ////////////// block Robust features

    public SelenideElement btnSlideShare = $("#w-tabs-3-data-w-tab-0 > img");
    public SelenideElement btnMediaShare = $("#w-tabs-3-data-w-tab-1 > img");
    public SelenideElement btnScreenShare = $("#w-tabs-3-data-w-tab-2 > img");
    public SelenideElement btnWhiteboard = $("#w-tabs-3-data-w-tab-3 > img");
    public SelenideElement btnCTA = $("#w-tabs-3-data-w-tab-4 > img");


    public SelenideElement imgSlideShare = $x("//img[contains(@src, 'feature-presentations-sharing.png')]");
    public SelenideElement imgMediaShare = $x("//img[contains(@src, 'feature-youtube-vimeo-mp4-player.png')]");
    public SelenideElement imgScreenShare = $x("//img[contains(@src, 'feature-screen-sharing.png')]");
    public SelenideElement imgWhiteboard = $x("//img[contains(@src, 'whiteboard.png')]");
    public SelenideElement imgCTA = $x("//img[contains(@src, 'cta.png')]");


    ////////////// block start now

    public SelenideElement btnGetStarted = $("div[class='text-block-34']");
    public SelenideElement btnContactSales = $("div[class='text-block-44']");


    public static FeaturesPage getInstance() {
        return new FeaturesPage();
    }

    public void checkBlockPersonalDomain() {
        imgCustomDomain.scrollIntoView(false);
        imgCustomDomain.shouldBe(visible).shouldBe(image);
    }

    public void checkBlockScheduling() {
        btnCreateWebinar.scrollIntoView(false);
        btnCustomization.shouldBe(visible).shouldBe(image).parent().click();
        imgCustomization.shouldBe(visible).shouldBe(image);
        btnCreateWebinar.shouldBe(visible).shouldBe(image).parent().click();
        imgCreateWebinar.shouldBe(visible).shouldBe(image);
        btnIvite.shouldBe(visible).shouldBe(image).parent().click();
        imgIvite.shouldBe(visible).shouldBe(image);
        btnContent.shouldBe(visible).shouldBe(image).parent().click();
        imgContent.shouldBe(visible).shouldBe(image);
    }

    public void checkBlockMeet() {
        btnVirtualConf.scrollIntoView(false);
        btnInstantMeeting.shouldBe(visible).shouldBe(image).parent().click();
        imgInstantMeeting.shouldBe(visible).shouldBe(image);
        btnVirtualConf.shouldBe(visible).shouldBe(image).parent().click();
        imgVirtualConf.shouldBe(visible).shouldBe(image);
        btnPrivateAccess.shouldBe(visible).shouldBe(image).parent().click();
        imgPrivateAccess.shouldBe(visible).shouldBe(image);
    }

    public void checkBlockExperience() {
        btnCustomLayout.scrollIntoView(false);
        btnCustomLanding.shouldBe(visible).shouldBe(image).parent().click();
        imgCustomLanding.shouldBe(visible).shouldBe(image);
        btnCustomLayout.shouldBe(visible).shouldBe(image).parent().click();
        imgCustomLayout.shouldBe(visible).shouldBe(image);
        btnCustomEmails.shouldBe(visible).shouldBe(image).parent().click();
        imgCustomEmails.shouldBe(visible).shouldBe(image);
    }
    public void checkBlockFeatures () {
        btnSlideShare.scrollIntoView(false);
        btnMediaShare.shouldBe(visible).shouldBe(image).parent().click();
        imgMediaShare.shouldBe(visible).shouldBe(image);
        btnSlideShare.shouldBe(visible).shouldBe(image).parent().click();
        imgSlideShare.shouldBe(visible).shouldBe(image);
        btnScreenShare.shouldBe(visible).shouldBe(image).parent().click();
        imgScreenShare.shouldBe(visible).shouldBe(image);
        btnWhiteboard.shouldBe(visible).shouldBe(image).parent().click();
        imgWhiteboard.shouldBe(visible).shouldBe(image);
        btnCTA.shouldBe(visible).shouldBe(image).parent().click();
        imgCTA.shouldBe(visible).shouldBe(image);
    }


    public String checkBtnGetstarted() {
        btnGetStarted.scrollIntoView(false);
        btnGetStarted.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().driver().url().contains(LOGIN_URI);
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }
    public String checkBtnContact() {
        btnContactSales.scrollIntoView(false);
        btnContactSales.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().driver().url().contains(CONTACT_URI);
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }


    /*
    todo - Переделать checkBtnGetstarted и checkBtnContact так же подумать над такими же в классе HomePage
    * */
}
