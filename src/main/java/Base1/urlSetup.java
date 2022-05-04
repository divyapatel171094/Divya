package Base1;

import org.testng.annotations.BeforeTest;

public class urlSetup extends driverSetup1{
    public String url = null;
    @BeforeTest
    public void setUrl(){
        driver.get(url);
    }
}
