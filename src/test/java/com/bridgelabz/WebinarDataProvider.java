package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebinarDataProvider extends BaseClass {
    @Test(description = "To use dataprovider for autofilling multiple data", priority = 0, dataProvider = "dataprovider")
    @Parameters
    public void webinarAutoFill(String phoneNo, String emailId) throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");
        driver.findElement(By.name("ContactNumber")).sendKeys(phoneNo);
        Thread.sleep(500);
        driver.findElement(By.id("deftemail")).sendKeys(emailId);
        Thread.sleep(500);
    }

    @DataProvider(name = "dataprovider")
    public static Object[][] getDataForWebinar(){
         return new Object[][] {
            {"8544370256","abc@gmail.com"},
            {"7586952365","fgj@gmail.com"},
            {"9865362569", "hkj@gmail.com"}
            };
        }
    }

