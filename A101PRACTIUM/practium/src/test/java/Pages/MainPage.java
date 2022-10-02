package Pages;

import Base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

import static Constant.Constant.*;

public class MainPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public MainPage(WebDriver driver ) {
        super(driver);
    }

    //** Go to URL
    public MainPage goToUrl(){
        goToUrl(WEBSITE_LINK);
        logger.info("A101 URL'e gidildi");
        click(ACCEPT_COOKIES);
        logger.info("Cookies kabul edildi.");
        return this;
    }

    public MainPage goToProducts() throws InterruptedException {
        click(GIYIM);
        logger.info("Giyim'e tiklandi");
        click(KADIN_IC_GIYIM);
        logger.info("Kadın iç giyime tiklandı");
        click(DIZ_ALTI_CORAP);
        logger.info("Diz altı çorap tiklandi");
        click(IMAGE_CHECKING);
        logger.info("Product'a tiklandi");
        Thread.sleep(5000);
        System.out.println("Siyah Kontrol");
        //Assert.assertEquals(SIYAH_CONTROL,"SIYAH"); --Siyah Ürün Kontrolü
        return this;
    }

    public MainPage addToCart(){
        click(SEPETE_EKLE);
        logger.info("Ürün Sepete Eklendi");
        click(SEPETE_GIT);
        logger.info("Sepete Gidildi");
        click(SEPETI_ONAYLA);
        logger.info("Sepet Onaylandi");
        return this;
    }

    public MainPage loginPages(){
        click(UYE_OLMADAN_DEVAM_ET);
        logger.info("Uye olmadan devam et");

        //---- Email Section
        sendKeys(EMAIL_SECTION,"test@gmail.com");
        logger.info("Mail adresi girildi");
        click(EMAIL_SUBMIT_BUTTON);
        logger.info("Email submit edildi.");
        return this;
    }

    public MainPage addressSection() throws InterruptedException {
        //---- Adress Section
        click(NEW_ADDRESS);
        logger.info("Yeni Adres oluşturuluyor.");
        click(MY_ADDRESS);
        logger.info("Yeni adres oluşturuluyor");

        WebDriver driver = null;
        Actions actions = new Actions(driver);
        WebElement Form = driver.findElement(MY_ADDRESS);
        actions.click(Form).
                sendKeys("EV")
                .sendKeys(Keys.TAB)
                .sendKeys("Test ")
                .sendKeys(Keys.TAB)
                .sendKeys("Test")
                .perform();
        WebElement phone = driver.findElement(MY_PHONE);
        Thread.sleep(5000);
        phone.sendKeys("1234567890");

        driver.findElement(CITY).click();
        Thread.sleep(5000);
        driver.findElement(CITY2).click();
        Thread.sleep(5000);
        driver.findElement(TOWNSHIP).click();
        Thread.sleep(5000);
        driver.findElement(TOWNSHIP2).click();
        Thread.sleep(5000);
        driver.findElement(DISTRICT).click();
        Thread.sleep(5000);
        driver.findElement(DISTRICT2).click();

        WebElement Adress = driver.findElement(By.xpath("//textarea[@name='line']"));
        Adress.sendKeys("Akşemsettin Mahallesi Akgül Caddesi İbrahimefendi Sokak Numara 18 Daire 2");
        WebElement Postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
        Postcode.sendKeys("34000");
        Thread.sleep(5000);

        driver.findElement(SECTIGINIZ_ADRES).click();
        driver.findElement(KAYDET_DEVAM_ET).click();

        String odemeKontrol = "https://www.a101.com.tr/orders/checkout/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(odemeKontrol));
        return this;
    }


}
