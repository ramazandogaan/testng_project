import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utllity.BaseDriver;

public class BaseUITest {


    protected final Logger LOGGER= LogManager.getLogger(this.getClass());
    WebDriver driver;

    @BeforeClass
    public void init(){
        driver = BaseDriver.driver("https://automationexercise.com");
        LOGGER.info("Web sitesi açıldı");
    }
    @AfterClass
    public void quitTest(){
        driver.quit();
        LOGGER.info("Tarayıcı kapandı");
    }
}
