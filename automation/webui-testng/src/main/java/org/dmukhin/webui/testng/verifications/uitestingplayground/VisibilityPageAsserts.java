package org.dmukhin.webui.testng.verifications.uitestingplayground;

import io.qameta.allure.Step;
import org.dmukhin.webui.testng.pageobjects.uitestingplayground.VisibilityPage;
import org.dmukhin.webui.testng.pageobjects.uitestingplayground.VisibilityPage.Elements;
import org.dmukhin.webui.testng.verifications.BaseAsserts;

/**
 * Verification assertions class for VisibilityPage in UITestingPlayground.
 */
public class VisibilityPageAsserts extends BaseAsserts {

  private final Elements visibilityPageElements;

    /**
     * Constructs a VisibilityPageAsserts instance with the provided VisibilityPage.
     *
     * @param visibilityPage The VisibilityPage instance to verify.
     */
    VisibilityPageAsserts(VisibilityPage visibilityPage) {
        this.visibilityPageElements = visibilityPage.elements();
        LOGGER.info("Validating visibility page");
    }

    /**
     * Verifies that the remove button is not visible.
     *
     * @return The current VisibilityPageAsserts instance.
     */
    @Step("Verify Remove Button Not Visible on Visibility Page")
    public VisibilityPageAsserts isRemoveButtonNotVisible() {
        verifyElementNotVisible(visibilityPageElements.removedButton);
        return this;
    }
}
