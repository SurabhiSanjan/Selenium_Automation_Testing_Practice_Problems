package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;

public class LinkedIn_Robot extends BaseClass {
    @Test
    public void robot_LinkedIn_Login() throws AWTException, InterruptedException {
        driver.get("https://www.linkedin.com/");
        driver.findElement(By.id("session_key")).sendKeys("8544370256");
        Thread.sleep(500);
        driver.findElement(By.id("session_password")).sendKeys("Theend@1");
        Thread.sleep(500);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(7000);
    }
}
