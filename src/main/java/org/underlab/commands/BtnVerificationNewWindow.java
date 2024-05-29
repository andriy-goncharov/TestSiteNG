package org.underlab.commands;

import com.codeborne.selenide.Command;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementSource;
import org.underlab.conditions.MyCustomConditions;

import javax.annotation.Nullable;

import java.util.Arrays;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BtnVerificationNewWindow implements Command {
    @Nullable
    @Override
    public Object execute(SelenideElement proxy, WebElementSource webElementSource, @Nullable Object[] objects) {
        proxy.should(visible).should(clickable).click();
        String pageTitle = switchTo().window(1).getTitle().toLowerCase();
        webdriver().shouldHave(MyCustomConditions.urlEndsWith(Arrays.stream(objects).findFirst().toString()));
        closeWindow();
        switchTo().window(0);
        return pageTitle;
    }
}
