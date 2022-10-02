import Base.BaseTest;
import Pages.MainPage;
import org.testng.annotations.Test;

public class AllTests extends BaseTest {

    @Test
    public void testScenario() throws InterruptedException {
        new MainPage(driver).goToUrl();
        new MainPage(driver).goToProducts();
        new MainPage(driver).addToCart();
        new MainPage(driver).loginPages();
        //new MainPage(driver).addressSection();
    }
}

