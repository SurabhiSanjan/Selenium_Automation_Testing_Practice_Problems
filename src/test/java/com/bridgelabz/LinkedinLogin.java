package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

public class LinkedinLogin extends BaseClass {
    @BeforeTest
    public void validateLoginPage() throws IOException {
        driver.navigate().to("https://www.linkedin.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title,"LinkedIn: Log In or Sign Up");

    }

    @AfterTest
    public void navigateLinkedInLogin(){
        boolean profile = driver.findElement(By.linkText("Surabhi Sanjan")).isDisplayed();
        if(profile){
            System.out.println("You are successfully logged In");
        }
    }
    @Test
    public void login() throws IOException, InterruptedException {
        driver.findElement(By.id("session_key")).sendKeys("8544370256");
        Thread.sleep(500);
        driver.findElement(By.id("session_password")).sendKeys("Theend@1");
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/button")).click();
        Thread.sleep(2000);
        screenshot();
    }
}
