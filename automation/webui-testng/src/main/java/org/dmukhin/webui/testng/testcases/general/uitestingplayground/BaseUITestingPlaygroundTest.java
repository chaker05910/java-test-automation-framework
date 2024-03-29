package org.dmukhin.webui.testng.testcases.general.uitestingplayground;

import org.dmukhin.webui.testng.pageobjects.uitestingplayground.HomePage;
import org.dmukhin.webui.testng.testcases.general.BaseTest;

/**
 * Base test class for UI Testing Playground test cases. Provides setup and teardown methods and
 * initializes the HomePage object.
 */
public class BaseUITestingPlaygroundTest extends BaseTest {

    protected final HomePage homePage = new HomePage();

    /**
     * Retrieves the web URL for UI Testing Playground from the environment settings.
     *
     * @return The web URL for UI Testing Playground.
     */
    protected String getWebUrl() {
        return environmentProvider.getSettings("uitestingplayground").getWebUrl();
    }
}
