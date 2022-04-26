package testsuit;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {
    String BaseUrl = "https://www.saucedemo.com/";

    @Before
    public void setup() {
        openBrowser(BaseUrl);
    }


    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        //locate and Enter “standard_user” username
        sendTextToElement(By.id("user-name"),"standard_user");

        //locate and Enter “secret_sauce” password
        sendTextToElement(By.id("password"),"secret_sauce");

        // Click on ‘LOGIN’ button
        clickOnElement(By.id("login-button"));

        // Verify the text “PRODUCTS”
        String expectedMessage = "PRODUCTS";
        String actualMessage= getTextFromElement(By.xpath("//span[contains(text(),'Products')]"));
        Assert.assertEquals(expectedMessage,actualMessage);
    }




    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //locate and Enter “standard_user” username
        sendTextToElement(By.id("user-name"),"standard_user");

        //locate and Enter “secret_sauce” password
        sendTextToElement(By.id("password"),"secret_sauce");

        // Click on ‘LOGIN’ button
        clickOnElement(By.id("login-button"));

        //Verify that six products are displayed on page
        int expectedNumber = 6;
        Assert.assertEquals(expectedNumber,getnumberfromelement(By.className("inventory_item")));


    }






    @After
    public void teardown() {
        closeBrowser();
    }


}
