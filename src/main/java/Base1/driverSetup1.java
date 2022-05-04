package Base1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup1 {
    public static WebDriver driver = null;
    public  driverSetup1() {
        if (driver == null) {
            setUp();
            driver.manage().window().maximize();
        }
    }
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

}
