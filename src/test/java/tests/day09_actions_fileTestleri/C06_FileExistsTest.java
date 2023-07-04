package tests.day09_actions_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_FileExistsTest extends TestBase {

    @Test
    public void test01(){

        //1. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        //2. avator.png dosyasını indirelim
        driver.findElement(By.xpath("//a[@href='download/avatar.png']")).click();
        bekle(5);

        //3. Dosyanın başarıyla indirilip indirilmediğini test edelim
        String dinamikDosyaYolu = System.getProperty("user.home") + "\\Downloads\\avator.png";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));


    }
}
