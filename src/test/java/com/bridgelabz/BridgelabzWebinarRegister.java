package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BridgelabzWebinarRegister extends BaseClass {
    @Test
    public void webinar() throws InterruptedException {
        driver.navigate().to("https://bldev.bridgelabz.com/webinar");
        //Enter Valid Mobile Number
        boolean flag1 = driver.findElement(By.id("deftphnumber")).isDisplayed();
        if (flag1) {
            Thread.sleep(500);
            driver.findElement(By.id("deftphnumber")).sendKeys("8544370256");
            Thread.sleep(500);
        }

        //Enter email id
        boolean flag2 = driver.findElement(By.id("deftemail")).isDisplayed();
        if (flag2) {
            Thread.sleep(500);
            driver.findElement(By.id("deftemail")).sendKeys("arg@gmail.com");
            Thread.sleep(500);
        }

        //Enter Full Name
        boolean flag3 = driver.findElement(By.id("deftusername")).isDisplayed();
        if (flag3) {
            Thread.sleep(500);
            driver.findElement(By.id("deftusername")).sendKeys("Surabhi Sanjan");
            Thread.sleep(500);
        }

        //Select Year of Pass Out
        Thread.sleep(500);
        WebElement element1 = driver.findElement(By.name("passoutYear"));
        boolean flag0 = element1.isDisplayed();
        if(flag0) {
            element1.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(500);
            element1.click();
            driver.findElement(By.xpath("/html/body/section[1]/div/div[6]/div[2]/div[2]/div[2]/div/div[2]/div[2]")).click();
            Thread.sleep(500);
        }

        //Select Educational Qualification
        Thread.sleep(500);
        WebElement element2 = driver.findElement(By.id("deftdegree"));
        boolean flag = element2.isDisplayed();
        if(flag) {
            element2.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(500);
            element2.click();
            driver.findElement(By.xpath("/html/body/section[1]/div/div[6]/div[2]/div[2]/div[3]/div/div[2]/div[1]")).click();
            Thread.sleep(500);
        }

        //Click ENTER ROOM Button
        boolean flag4 = driver.findElement(By.id("deftsbtn")).isDisplayed();
        if (flag4) {
            driver.findElement(By.id("deftsbtn")).click();
        }

        //Print List of Elements in the <div> tag
        List<WebElement> e = driver.findElements(By.xpath("//div"));
        System.out.println("No of elements : " + e.size());
        for(int i =0; i<e.size(); i++){
            System.out.println("Element Text : " + e.get(i).getAttribute("value"));
        }
    }
}

