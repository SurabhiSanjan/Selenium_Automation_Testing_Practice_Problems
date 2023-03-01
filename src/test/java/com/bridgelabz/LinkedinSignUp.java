package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LinkedinSignUp extends BaseClass {
    @BeforeTest
    public void validateLoginPage(){
        driver.navigate().to("https://www.linkedin.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title,"LinkedIn: Log In or Sign Up");
    }

    @Test
    public void login() throws IOException, InterruptedException {
        driver.findElement(By.xpath("/html/body/nav/div/a[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("email-or-phone")).sendKeys("surabhisanjan@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Theend@1");
        Thread.sleep(500);
        driver.findElement(By.id("join-form-submit")).click();
        Thread.sleep(500);
        driver.findElement(By.id("first-name")).sendKeys("testing");
        driver.findElement(By.id("last-name")).sendKeys("Automation");
        driver.findElement(By.id("join-form-submit")).click();

        //identify number of iframes present in after clicking continue
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" +size);

        //finding out the index of iframe.
        for(int i=0; i<size; i++){
            driver.switchTo().frame(i);
            int total = driver.findElements(By.xpath("//iframe[@src='/checkpoint/challengeIframe/AQH555kj9nGLGgAAAYad17TwgqKB3B1tAigNUfFUu2I5KeRGyNMZR4Z8tT4icd9yINCKEzyXyTA1qlLD1tntiF3GPwkTrQ?ut=2bc41Y5-NfGaE1']")).size();
            System.out.println(total);
            driver.findElement(By.name("PhoneNumber")).sendKeys("7667428280");
            driver.findElement(By.name("register-phone-submit-button")).click();
            driver.switchTo().defaultContent();
        }
    }
}
