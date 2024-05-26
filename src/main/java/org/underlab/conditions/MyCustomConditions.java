package org.underlab.conditions;


import com.codeborne.selenide.conditions.webdriver.UrlCondition;


public class MyCustomConditions {


    public static UrlCondition urlEndsWith(String url){
        return new UrlEndsWith(url);
    }
}
