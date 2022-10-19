package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BrowserstackAndroidSecondTest extends TestBase {
    @Test
    void secondTest() throws MalformedURLException, InterruptedException {
        $$(MobileBy.id("org.wikipedia.alpha:id/view_card_header_title"))
                .filterBy(Condition.text("In the news")).shouldHave(CollectionCondition.sizeGreaterThan(0));
        $$(MobileBy.id("org.wikipedia.alpha:id/view_card_header_title"))
                .filterBy(Condition.text("Featured article")).shouldHave(CollectionCondition.sizeGreaterThan(0));

    }
}
