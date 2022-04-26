package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {

    /**
     *This method will click on element
     */
    public void clickOnElement(By by){
        WebElement element = driver.findElement(by);
        element.click();
    }

    /**
     *This method will get text from element
     */
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text to element
     */

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElements(By by,String text) {
        driver.findElement(by).sendKeys(text);
    }

    public int getnumberfromelement(By by) {
        List<WebElement> actualNumberElement = driver.findElements(by);
        int actualNumber = actualNumberElement.size();
        return actualNumber;
    }








    //***************************Alert Methods*********************//

    /**
     * This method will switch to alert
     */
    public void switchToAlert(){
        driver.switchTo().alert();
    }
    /**
     * This method will accept to alert
     */

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    /**
     * This method will dismissto alert
     */

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

//    public void sendKeysAlert(){
//        driver.switchTo().alert().sendKeys();
//    }



    //***********************************Drop Down*************************************************************/



    /**
     * This method will select the option by visible text
     */
    public void selectByVisibleFromDropDown(By by , String text){
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }
    /**
     * This method will select the option by Index
     */

    public void selectByIndexFromDropDown(By by, int i ) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByIndex(i);
    }

    /**
     * This method will select the option by Value
     */

    public void selectByValueFromDropDown(By by , String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByValue(text);
    }





}
