package org.underlab.commands;

import com.codeborne.selenide.Command;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.WebElementSource;

import javax.annotation.Nullable;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BtnProductVerificationCurrentWindow implements Command {
    @Nullable
    @Override
    public Object execute(SelenideElement proxy, WebElementSource webElementSource, @Nullable Object[] objects) {
        proxy.shouldBe(visible);
        actions().moveToElement(proxy).click().perform();
        String windowTitle = switchTo().window(0).getTitle().toLowerCase();
        WebDriverRunner.getWebDriver().navigate().back();
        return windowTitle;
    }
}
