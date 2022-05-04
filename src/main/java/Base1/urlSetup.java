package Base1;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class urlSetup extends driverSetup1{
    public String url = null;
    @BeforeTest
    public void setUrl(){
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }
}
