package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.IOException;

public class FacebookSignup extends BaseClass{

    @BeforeTest
    public void navigateFacebookLogin(){
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Facebook – log in or sign up");
        driver.findElement(By.linkText("Create new account")).click();
    }

    @Test
    public void newAccount_creation() throws InterruptedException, IOException {
        driver.findElement(By.name("firstname")).sendKeys("Surabhi");               //Enter First Name
        driver.findElement(By.name("lastname")).sendKeys("Sanjan");                //Enter Nast name
        driver.findElement(By.name("reg_email__")).sendKeys("8544370256");        //Enter Mobile Number
        driver.findElement(By.id("password_step_input")).sendKeys("san12@");     //Enter Email ID

        //Enter Date of Birth
        WebElement day = driver.findElement(By.name("birthday_day"));
        Select dd_date = new Select(day);
        dd_date.selectByVisibleText("5");
        Thread.sleep(1000);
        screenshot();

        //Enter Month of Birth
        WebElement month = driver.findElement(By.id("month"));
        month.sendKeys(Keys.ARROW_DOWN);
        Select dd_month = new Select(month);
        dd_month.selectByIndex(8);
        Thread.sleep(1000);
        screenshot();

        //Enter Year of Birth
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select dd_year = new Select(year);
        dd_year.selectByValue("1995");
        Thread.sleep(1000);
        screenshot();

        //Enter Gender
        driver.findElements(By.name("sex")).get(1).click();
        boolean flag = driver.findElements(By.name("sex")).get(0).isSelected();
        if(flag){
            System.out.println("female radiobutton is selected");
        } else{
            driver.findElements(By.name("sex")).get(0).click();
        } screenshot();


        //Click on Sign Up Button
        boolean button = driver.findElement(By.name("websubmit")).isDisplayed();
        if(button){
            driver.findElement(By.name("websubmit")).click();
        } screenshot();
    }
}
