package allurePraktice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class BaseTestLambdaStep {

    private static final String REPO = "SDamir88/lession_6_parameterized_tests";

    @Test
    void baseTestLambdaStep(){

        step("Open home page", () -> {
            open("https://github.com/");
        });

        step("Looking for a repository" + REPO, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPO);
            $(".header-search-input").submit();
        });

        step("Check if the repository is found " + REPO, () -> {
            $(".repo-list").should(text("SDamir88/lession_6_parameterized_tests"));
        });

        step("Opening the repository " + REPO, () -> {
            $(By.linkText("SDamir88/lession_6_parameterized_tests")).click();
        });

        step("Checking for tabs Issue", () -> {
            $("#issues-tab").should(text("issues"));
        });

    }
}
