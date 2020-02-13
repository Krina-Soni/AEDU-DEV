package AEDU.Testcases;
import AEDU.constants.CommonVar;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import AEDU.Reports.ReportClass;
import java.sql.SQLException;

public class Basecase extends ReportClass{
    public static WebDriver driver;
    @BeforeMethod
    public void initialize() throws SQLException
    {
//        System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"chromedriver");
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--remote-debugging-port=9222");
//        options.addArguments("headless");

        System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"chromedriver");
        driver = new ChromeDriver();
        CommonVar common = new CommonVar();
        driver.get(common.url);
        driver.manage().window().maximize();
    }
}
