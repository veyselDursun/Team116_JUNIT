package tests.day10_waits_cookies_webTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C01_ExplicitlyWait {

//  1. Bir class olusturun : WaitTest
//  2. Iki tane metod olusturun : implicitWait() , explicitWait()
//   Iki metod icin de asagidaki adimlari test edin.
//  3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
//  4. Remove butonuna basin.
//  5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
//  6. Add buttonuna basin
//  7. It’s back mesajinin gorundugunu test edin

    @Test
    public void implicitlyWaitTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //  4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        //  5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
       WebElement itsGoneElement = driver.findElement(By.xpath("//p[@id='It's gone!']"));
       Assert.assertTrue(itsGoneElement.isDisplayed());

        //  6. Add buttonuna basin
        driver.findElement(By.xpath("//button[text()='Add']")).click();


        //  7. It’s back mesajinin gorundugunu test edin

        WebElement itsBackElementi = driver.findElement(By.xpath("//p@id='message']"));
        Assert.assertTrue(itsBackElementi.isDisplayed());

        driver.close();

    }


    @Test
    public void explicitWaitTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        //  3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //  4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        //  5. “It’s gone!” mesajinin goruntulendigini dogrulayin.

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

        /*
            visibilityOf() method'u bize 2 secenek sunuyor
            - Eger webelement'i locate edebiliyorsak, once locate edip
              sonra o elementi istenen condition icin beklemesini isteyebiliriz
            - Eger kullanacagimiz elementi locate EDEMIYORSAK
              o zaman locate islemi ile bekleme islemini birlikte yapabiliriz.
         */
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement itsGoneElementi= driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(itsGoneElementi.isDisplayed());

        //  6. Add buttonuna basin
        driver.findElement(By.xpath("//button[text()='Add']")).click();


        //  7. It’s back mesajinin gorundugunu test edin

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement itsBackElementi = driver.findElement(By.xpath("//p[@id='message']"));

        Assert.assertTrue(itsBackElementi.isDisplayed());
        driver.close();




    }


}
