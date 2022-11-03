package org.example.factory;

import org.example.properties.PropertyFolder;
import org.example.properties.converters.SupportedBrowserConverter;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

    public WebDriver getWebDriver(){

        return SupportedBrowserConverter.valueOfWebBrowsers(
                new PropertyFolder().readProperty("browser")
        ).getWebDriver();
    }
}
