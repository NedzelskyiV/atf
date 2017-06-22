package com.tools.atf.test.Regression;

import Core.BaseTest;
import Web.WebPages.AdminPage;
import Web.WebPages.HomePage;
import Web.WebPages.MainMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*;

import static Core.TestData.ADMIN_USER_NAME;
import static Core.TestData.ADMIN_USER_PASS;
import static org.hamcrest.Matchers.is;

public class FirstTest extends BaseTest {

    @Test(alwaysRun = true)
    public void SimpleLoginAndLogOut() {
        new HomePage(driver).loadAndWaitUntilAvailable().goToLoginPage().loginAs(ADMIN_USER_NAME, ADMIN_USER_PASS);
        new AdminPage(driver).waitUntilAvailable().addNewPage("News4", "news3", "news3", true);
        new HomePage(driver).loadAndWaitUntilAvailable();
        Assert.assertTrue(new MainMenu(driver).isPagePresent("News4"));
        new MainMenu(driver).logOut();

        //        new HomePage(driver).loadAndWaitUntilAvailable().goToLoginPage();
//        new LoginPage(driver).waitUntilAvailable().loginAs("test", "test");
//        new AdminPage(driver).waitUntilAvailable();
//        new MainMenu(driver).waitUntilAvailable().logOut();

    }
}
