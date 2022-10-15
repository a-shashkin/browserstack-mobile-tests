package tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BrowserstackAndroidSampleAppTest extends TestBase {
    @Test
    void searchTest() throws MalformedURLException, InterruptedException {
        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container")).shouldHave(sizeGreaterThan(0));
    }
}
