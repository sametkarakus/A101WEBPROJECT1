package Constant;


import org.openqa.selenium.By;

public class Constant {

    public static String WEBSITE_LINK = "https://www.a101.com.tr/";
    public static By ACCEPT_COOKIES = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    public static By GIYIM = By.xpath("//a[@title='GİYİM & AKSESUAR']");
    public static By KADIN_IC_GIYIM = By.xpath("//a[@data-value='1565']");
    public static By DIZ_ALTI_CORAP = By.xpath("//a[@data-value='1567']");
    public static By IMAGE_CHECKING = By.xpath("//img[@src='https://ayb.akinoncdn.com/products/2020/11/11/54870/d8dbaefe-f64e-45a0-b6d7-e483e4aaf225_size250x250_quality100_cropCenter.jpg']");

    public static By SIYAH_CONTROL = By.xpath("//span[contains(text(),'SİYAH')]");

    public static By SEPETE_EKLE = By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']");
    public static By SEPETE_GIT = By.xpath("//a[@class='go-to-shop']");
    public static By SEPETI_ONAYLA = By.xpath("//a[@href='/orders/checkout/']");
    public static By UYE_OLMADAN_DEVAM_ET = By.xpath("//a[@title='ÜYE OLMADAN DEVAM ET']");
    public static By EMAIL_SECTION = By.xpath("//input[@name='user_email']");
    public static By EMAIL_SUBMIT_BUTTON = By.xpath("//button[@class='button block green']");
    public static By NEW_ADDRESS = By.xpath("(//a[@title='Yeni adres oluştur'])[1]");
    public static By MY_ADDRESS = By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']");


    public static By MY_PHONE = By.xpath("//input[@name='phone_number']");
    public static By CITY = By.xpath("//select[@name='city']");
    public static By CITY2 = By.xpath("//option[@value='40']");
    public static By TOWNSHIP = By.xpath("//select[@name='city']");
    public static By TOWNSHIP2 = By.xpath("//option[@value='479']");
    public static By DISTRICT = By.xpath("//select[@name='district']");
    public static By DISTRICT2 = By.xpath("//option[@value='36144']");

    public static By SECTIGINIZ_ADRES = By.xpath("//button[@class='button green js-set-country js-prevent-emoji']");
    public static By KAYDET_DEVAM_ET = By.xpath("//button[@class='button block green js-proceed-button']");

}
