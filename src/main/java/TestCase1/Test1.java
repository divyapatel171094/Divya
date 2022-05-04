package TestCase1;

import Base1.urlSetup;
import Object1.Register;
import org.testng.annotations.Test;

public class Test1 extends urlSetup {

    String Firstname="Divya";
    String Lastname="Patel";
    String MobileNumber= "9624995088";
    String Email= "divya.patel1@yopmail.com";
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
