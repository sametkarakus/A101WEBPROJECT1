package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 60);
    }

    //**----- Go To URL
    public void goToUrl(String url) {
        driver.get(url);
    }

    //**----- Click Event'i gerçekleştir
    public void click(By by){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    //*------ Text and SendKeys
    public void sendKeys(By by,String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
}
