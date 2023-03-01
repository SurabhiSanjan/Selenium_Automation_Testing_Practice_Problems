package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsDemo extends BaseClass{
    @Test
    public void demoLocators () throws InterruptedException {
       WebElement phone = driver.findElement(By.id("deftphnumber"));
       phone.sendKeys("8544370256");
       driver.findElement(By.name("fullName")).sendKeys("Surabhi sanjan");
       driver.findElement(By.cssSelector("input#deftemail")).sendKeys("surabhi@2.com");

       WebElement passOutYear = driver.findElement(By.xpath("//*[@id=\"deftyear\"]"));
       passOutYear.sendKeys(Keys.PAGE_DOWN);
       Thread.sleep(500);
       passOutYear.click();
       driver.findElement(By.xpath("/html/body/section[1]/div/div[6]/div[2]/div[2]/div[2]/div/div[2]/div[1]")).click();
       Thread.sleep(500);

        WebElement qualification = driver.findElement(By.id("deftdegree"));
        qualification.sendKeys(Keys.PAGE_DOWN);
        qualification.click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/section[1]/div/div[6]/div[2]/div[2]/div[3]/div/div[2]/div[1]")).click();
        Thread.sleep(500);

        boolean button = driver.findElement(By.id("deftsbtn")).isDisplayed();
        if(button){
            driver.findElement(By.id("deftsbtn")).click();
        }
    }
}
