package com.bridgelabz;
import com.bridgelabz.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class WindowHandling extends BaseClass{
    @Test
    public void getWindoehandle(){
     driver.findElement(By.xpath("//*[text ='New Window']")).click();
     String mainwindow = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        Iterator<String> iterator = allWindow.iterator();
        while (iterator.hasNext()){
         String childWindow = iterator.next();
         if(mainwindow.equalsIgnoreCase(childWindow)){
             driver.switchTo().window(childWindow);
             WebElement text = driver.findElement(By.id("sampleHeading"));
             System.out.println(text.getText());
         }
        }
    }
}
