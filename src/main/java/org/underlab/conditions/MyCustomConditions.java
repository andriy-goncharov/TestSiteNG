package org.underlab.conditions;

import com.codeborne.selenide.WebElementCondition;
import com.codeborne.selenide.conditions.webdriver.UrlCondition;
import org.underlab.conditions.UrlEndsWith;

public class MyCustomConditions {


    public static UrlCondition urlEndsWith(String url){
        return new UrlEndsWith(url);
    }
}
