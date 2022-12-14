package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$$;

@Feature("Главная страница")
@Owner("Alexander Shashkin")
public class BrowserstackAndroidSecondTest extends TestBase {
    @Test
    @Tag("selenide_android")
    @Story("Проверка наличия элементов на главном экране")
    @DisplayName("Проверка наличия заголовков In the news и Featured article на главном экране")
    void secondTest() {
        $$(MobileBy.id("org.wikipedia.alpha:id/view_card_header_title"))
                .filterBy(Condition.text("In the news")).shouldHave(CollectionCondition.sizeGreaterThan(0));
        $$(MobileBy.id("org.wikipedia.alpha:id/view_card_header_title"))
                .filterBy(Condition.text("Featured article")).shouldHave(CollectionCondition.sizeGreaterThan(0));

    }
}
