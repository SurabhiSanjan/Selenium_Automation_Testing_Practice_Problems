package com.bridgelabz;
import org.openqa.selenium.JavascriptExecutor;
import com.bridgelabz.Base.BaseClass;
import org.testng.annotations.Test;

public class JavaScriptExe extends BaseClass {
    @Test(description = "demonstration of javascriptExecutor")
    public void execute() throws InterruptedException {
        driver.get("https://www.guru99.com/api-testing.html");
        JavascriptExecutor execute = (JavascriptExecutor) driver;
        System.out.println("execute script : "+ execute.executeScript("return window.length"));

        int numberOfFrames = Integer.parseInt(execute.executeScript("return window.length").toString());
        System.out.println("No of frames :" + numberOfFrames);

        execute.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(500);
    }
}
