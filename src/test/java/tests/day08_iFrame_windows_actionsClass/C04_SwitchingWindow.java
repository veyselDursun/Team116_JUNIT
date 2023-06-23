package tests.day08_iFrame_windows_actionsClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseQuit;
import java.util.Set;

public class C04_SwitchingWindow extends TestBaseQuit {

    @Test
    public void test01(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement openingYaziElementi= driver.findElement(By.tagName("h3"));
        String expectedYazi = "Opening a new window";
        String actualyazi = openingYaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualyazi);

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
                // gorevde bu sayfaya geri donus oldugu icin handle degerini kaydedelim
        String ilkSayfaWHD = driver.getWindowHandle();
        System.out.println("ilk sayfa whd : " + ilkSayfaWHD);

        //● Click Here butonuna basın.
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();

        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        /*
            KONTROLUMUZ disinda yeni bir tab veya window acilinca
            driver otomatik olarak oraya gecmez
            Yeni sayfaya gecebilmek icin ikinci sayfanin Window Handle degerini bulmaliyiz
            Bunun icin
         */
        Set<String> wHDSeti = driver.getWindowHandles();
        System.out.println(wHDSeti);

        String ikinciSafyaHandle ="";
        for (String each: wHDSeti
        ) {
            if (!each.equals(ilkSayfaWHD)){
                ikinciSafyaHandle=each;
            }
        }
        driver.switchTo().window(ikinciSafyaHandle);
        expectedTitle ="New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

        bekle(5);
    }
}

