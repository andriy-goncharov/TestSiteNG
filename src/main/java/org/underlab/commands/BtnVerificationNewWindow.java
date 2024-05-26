package org.underlab.commands;

import com.codeborne.selenide.Command;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementSource;

import javax.annotation.Nullable;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BtnVerificationNewWindow implements Command {
    @Nullable
    @Override
    public Object execute(SelenideElement proxy, WebElementSource webElementSource, @Nullable Object[] objects) {
        actions().moveToElement(proxy).click().perform();
        String windowTitle = switchTo().window(1).getTitle().toLowerCase();
        closeWindow();
        switchTo().window(0);
        return windowTitle;
    }
}
