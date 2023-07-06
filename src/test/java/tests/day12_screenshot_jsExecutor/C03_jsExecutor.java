package tests.day12_screenshot_jsExecutor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_jsExecutor extends TestBase {

    @Test
    public void test01(){

        // wisequaerter ana sayfaya gidelim

        driver.get("https://www.wisequarter.com");

        // jsExecutor kullanarak contact linkini tiklayin

        WebElement contactLinkElement = driver.findElement(By.xpath("//a[text()='Contact']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();",contactLinkElement); // executor ile to Click google yazinca --arguments[0].click();-- copyalaya bilinir

        bekle(2);

        //



    }

}
