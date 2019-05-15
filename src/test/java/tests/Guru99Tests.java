package tests;

import manager.AppiumServer;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import screens.LoginScreen;

@RunWith(SerenityRunner.class)
public class Guru99Tests {

    private LoginScreen loginScreen = new LoginScreen();

    @Managed(driver = "appium")
    private WebDriver driver;

    @BeforeClass
    public static void setUp() {
        AppiumServer.start();
    }

    @AfterClass
    public static void endTest() {
        AppiumServer.stop();
    }

    @Test
    public void verifyNewCustomerCanBeCreatedTest() {
        driver.get("http://demo.guru99.com/v4/");
    }

}
