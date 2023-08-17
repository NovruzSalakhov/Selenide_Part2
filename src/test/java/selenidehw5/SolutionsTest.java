package selenidehw5;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class SolutionsTest {
    @Test
    void selenideSolutionsEnterprise () {
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".header-menu-wrapper").$(byText("Enterprise")).click();
        $(".application-main  h1").shouldHave(text("Build like the best"));
    }
}
