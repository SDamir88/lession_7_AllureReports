package allurePraktice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @Test
    void baseTest(){
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
