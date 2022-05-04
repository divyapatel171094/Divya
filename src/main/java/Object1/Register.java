package Object1;

import Base1.driverSetup1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Register extends driverSetup1 {

    String FirstNameXpath="//input[@class='form-control material_input ng-pristine ng-invalid ng-touched']";

    String FirstnameCss = "body > app-root > div > app-register > section > div > div > div > div > main > form > div:nth-child(1) > div > input";
    String LastnameCss = "body > app-root > div > app-register > section > div > div > div > div > main > form > div:nth-child(2) > div > input";
    String CountrycodeCss="body > app-root > div > app-register > section > div > div > div > div > main > form > div:nth-child(3) > div > ngx-intl-tel-input > div > div > div.iti__selected-flag.dropdown-toggle > div.iti__arrow";
    String SelectIndiaCsss="#iti-0__item-in > span.iti__country-name";
    String EnterMobileNumberCss="#register";
    String EnterEmailCss="body > app-root > div > app-register > section > div > div > div > div > main > form > div:nth-child(4) > div > input";
    String EnterPasswordCss= "body > app-root > div > app-register > section > div > div > div > div > main > form > div.input_with_desc > div > div > input";
    String SubmitButtonCss="body > app-root > div > app-register > section > div > div > div > div > main > form > button";

    public void fillRegisterFormDetails(String Firstname, String Lastname, String MobileNumber, String Email, String Password) throws InterruptedException {
        Thread.sleep(1500);
//        driver.findElement(By.xpath(FirstNameXpath)).sendKeys(Firstname);
        driver.findElement(By.cssSelector(FirstnameCss)).sendKeys(Firstname);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(LastnameCss)).sendKeys(Lastname);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(CountrycodeCss)).click();
        Thread.sleep(20000);
        driver.findElement(By.cssSelector(SelectIndiaCsss)).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(EnterMobileNumberCss)).sendKeys(MobileNumber);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(EnterEmailCss)).sendKeys(Email);
        driver.findElement(By.cssSelector(EnterPasswordCss)).sendKeys(Password);


        String cssPath1 = "main>form>div:nth-child(6)>label";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(arguments[0],'::before').click();",cssPath1);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(SubmitButtonCss)).click();




    }
}
