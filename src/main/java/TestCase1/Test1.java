package TestCase1;

import Base1.urlSetup;
import Object1.Register;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Test1 extends urlSetup {
    Faker faker = new Faker();
    String Firstname="Divya";
    String Lastname="Patel";
    String MobileNumber= "9624995088";
    String Email= faker.internet().emailAddress();
    String Password="Test@1234";
    Register re = new Register();

    public Test1(){

        url="https://staging-portal.shams.ae/frontend/register";
    }
    @Test
    public void enterRegisterDetails() throws InterruptedException {
        re.fillRegisterFormDetails(Firstname,Lastname,MobileNumber,Email,Password);


    }
}
