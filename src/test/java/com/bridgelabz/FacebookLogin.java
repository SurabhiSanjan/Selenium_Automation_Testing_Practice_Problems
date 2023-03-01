package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FacebookLogin extends BaseClass {
    @BeforeTest
    public void validateLoginPage(){
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Facebook – log in or sign up");
    }

    @AfterTest
    public void navigateFacebookLogin(){
        String title2 = driver.getTitle();
        Assert.assertEquals(title2,"Facebook");
    }
    @Test
    public void login() throws IOException, InterruptedException {
        driver.findElement(By.id("email")).sendKeys("testingtestdatablz@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("pass")).sendKeys("testing123");
        Thread.sleep(500);
        driver.findElement(By.name("login")).click();
        Thread.sleep(500);


    }

}
