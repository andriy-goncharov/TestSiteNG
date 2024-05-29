package Page;

import com.codeborne.selenide.SelenideElement;
import org.underlab.commands.BtnProductVerificationNewWindow;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class HomePage extends BasePage {


    private SelenideElement btnSignup = $("a[id='signup-a']");
    private SelenideElement btnSeeAction = $(".see-a-demo-button");
    private SelenideElement btnDiscoverMore = $(".secondary-button");
    private SelenideElement btnSignUPToday = $("#test-room-a");
    private SelenideElement imageCloudPoweredForUltimate = $("img[class='image-24']");
    private SelenideElement btnAllPosts = $("div[class='text-block-148']");
    private SelenideElement btnBrowserBased = $("a[data-w-tab='1-browser-based']");
    private SelenideElement btnSimplifiedScheduling = $("a[data-w-tab='2-simplified-scheduling']");
    private SelenideElement btnSeamlessStreaming = $("a[data-w-tab='3-seamless-streaming']");
    private SelenideElement imageHostEngagingWebinarsSeamlessly = $("img[title='Host engaging webinars seamlessly from your favorite browser']");
    private SelenideElement imageStreamlinedWebinarSchedulingFor = $("img[title='Streamlined webinar scheduling for maximum impact.']");
    private SelenideElement imageDeliverEngagingWebinarsWith = $("img[title='Deliver engaging webinars with real-time interaction and ultra-low latency.']");
    private SelenideElement imageVirtualClassroom = $("img[title*='classrooms']");
    private SelenideElement imageOnlineMeeting = $("img[title='Unlock the secrets of effective remote collaboration with online meetings.']");
    private SelenideElement imageWibenarFeedback = $("img[title*='potential']");
    private SelenideElement btnTestRoom = $("#test-room-b");
    private SelenideElement btnContact = $("#contact");
    private SelenideElement btnGetStartedNow = $(".home-cta-button");
    private SelenideElement imageBoost = $(".image-boost");


    public static HomePage getInstance() {
        return new HomePage();
    }

    public void imgStartMenu() {
        btnBrowserBased.scrollIntoView(true);
        btnBrowserBased.shouldBe(visible).shouldBe(clickable).click();
        imageHostEngagingWebinarsSeamlessly.shouldBe(visible).shouldBe(image);
        btnSimplifiedScheduling.shouldBe(visible).shouldBe(clickable).click();
        imageStreamlinedWebinarSchedulingFor.shouldBe(visible).shouldBe(image);
        btnSeamlessStreaming.shouldBe(visible).shouldBe(clickable).click();
        imageDeliverEngagingWebinarsWith.shouldBe(visible).shouldBe(image);

    }

    public String testSignUP() {
        return btnSignup.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testlinkSeeAction() {
        return btnSeeAction.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testlinkDiscoverMore() {
        btnDiscoverMore.scrollIntoView(false);
        return btnDiscoverMore.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testBlockCollaborate() {
        btnSignUPToday.scrollIntoView(false);
        imageCloudPoweredForUltimate.shouldBe(visible).shouldBe(image);
        return btnSignUPToday.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testBtnAllPosts() {
        btnAllPosts.scrollIntoView(false);
        return btnAllPosts.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testImageVirtualClassroom() {
        imageVirtualClassroom.scrollIntoView(false);
        imageVirtualClassroom.shouldBe(visible).shouldBe(image);
        return imageVirtualClassroom.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testImageOnlineMeeting() {
        imageOnlineMeeting.scrollIntoView(false);
        imageOnlineMeeting.shouldBe(visible).shouldBe(image);
        return imageOnlineMeeting.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testImageWibenarFeedback() {
        imageWibenarFeedback.scrollIntoView(false);
        imageWibenarFeedback.shouldBe(visible).shouldBe(image);
        return imageWibenarFeedback.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testBtnTestRoom() {
        btnTestRoom.scrollIntoView(false);
        btnTestRoom.shouldBe(visible);
        return btnTestRoom.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testBtnContact() {
        btnContact.scrollIntoView(false);
        btnContact.shouldBe(visible);
        return btnContact.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public String testGetStartedNow() {
        btnGetStartedNow.scrollIntoView(false);
        imageBoost.shouldBe(visible).shouldBe(image);
        btnGetStartedNow.shouldBe(visible);
        return btnGetStartedNow.execute(new BtnProductVerificationNewWindow()).toString();
    }

    public void checkBtnTop() {
        btnBackTop.scrollIntoView(false);
        btnBackTop.should(visible).should(clickable).click();
        btnSignup.shouldBe(visible).shouldBe(clickable);
    }
}
