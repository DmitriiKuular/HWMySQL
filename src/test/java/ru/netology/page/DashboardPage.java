package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;


public class DashboardPage {
    private SelenideElement heading = $("[data-test-id=dashboard]");
    private SelenideElement buttonReload = $("[data-test-id='action-reload']");


    public DashboardPage() {
        heading.shouldBe(visible).shouldHave(exactText("  Личный кабинет"));
    }

}
