package com.bridgelabz.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver = null;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
       driver.close();
    }
    public void screenshot() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\atulk\\IdeaProjects\\Selinium-java\\src\\screenshot/screenshot"+System.currentTimeMillis()+".png");
        FileUtils.copyFile(src, destination);
    }
}
