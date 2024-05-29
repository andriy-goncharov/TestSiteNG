package Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeClass;


import java.time.Duration;



public class BaseTest {

    @BeforeClass
    public void setUp() {
        Configuration.timeout = Duration.ofSeconds(10).toMillis();
        Configuration.baseUrl = "https://myownconference.com";
        Configuration.browserSize = "1024x768";
        selectBrowser("chrome");
    }

    private void selectBrowser(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                Configuration.browser = "chrome";
                break;
            case "firefox":
                Configuration.browser = "firefox";
                break;
            case "ie":
                Configuration.browser = "ie";
                break;
            case "edge":
                Configuration.browser = "edge";
                break;
            case "safari":
                Configuration.browser = "safari";
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name");
        }
    }


}
