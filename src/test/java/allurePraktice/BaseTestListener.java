package allurePraktice;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTestListener {

    @Test
    void baseTestListener(){
        SelenideLogger.addListener("allur", new AllureSelenide());
        //Открыть Гитхаб
        open("https://github.com/");
        //Ввести в поиск название страницы "SDamir88/lession_6_parameterized_tests"
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("SDamir88/lession_6_parameterized_tests");
        $(".header-search-input").submit();
        //Проверка, что искомый репозиторий есть на странице
        $(".repo-list").should(text("SDamir88/lession_6_parameterized_tests"));
        $(By.linkText("SDamir88/lession_6_parameterized_tests")).click();
        //Проверить наличие поля Issue
        $("#issues-tab").should(text("issues"));



    }
}
