package com.udemy.automation_design_patterns.factory;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GoogleFactory {

    private static final Function<WebDriver, GooglePage> ENG = GoogleEnglish::new;
    private static final Function<WebDriver, GooglePage> FR = GoogleFrench::new;
    private static final Function<WebDriver, GooglePage> SA = GoogleArabic::new;

    private static final Map<String, Function<WebDriver, GooglePage>> MAP = new HashMap<>();

    static {
        MAP.put("ENG", ENG);
        MAP.put("FR", FR);
        MAP.put("SA", SA);
    }

    public static GooglePage get(String language, WebDriver driver) {
        return MAP.get(language).apply(driver);
    }

}
