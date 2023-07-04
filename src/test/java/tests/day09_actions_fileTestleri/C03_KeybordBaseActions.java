package tests.day09_actions_fileTestleri;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_KeybordBaseActions extends TestBase {

    @Test
    public void test01(){

        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");

        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//a[@class='_agmp _28le btn btnS medBtn mfsm touchable']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).click();

        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        //4- Kaydol tusuna basalim
    }
}
