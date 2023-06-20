package tests.day05_maven_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

 /*
        Junit'in bize kazandirdigi en onemli yeniliklerden biri
        @Test notasyonudur.

        Notasyon (annotation) kucuk bilgiler(meta data) barindiran yapilardir.
        sadece bir yazi ya da gosterim degillerdir
        yaptiklari islemler vardir

        @Test notasyonu siradan bir method'u
        tek basina calistirilabilir bir test method'una donusturur

        JUnit ile test method'lari istersek tek basina,
        istersek de class level'dan calistirilip
        tum testlerin birlikte calisabilecegi bir yapiya donusur.

        JUnit class icerisindeki test method'larini
        belirsiz bir sirada calistirir.
        Test method'larinin hangi sira ile calisacagini
        ONGOREMEYIZ ve DUZENLEYEMEYIZ
     */
// Bir class'da 3 farkli test olsa
// ve ben testleri istersem toplu, istersem bagimsiz olarak calistirabilsem

public class C04_JUnitNotasyonu {

    @Test
    public void amazonTesti() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String expectedUrlIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Amazon Url testi BASARILI");
        } else {
            System.out.println("Amazon Url testi BASARISIZ");
        }

        driver.close();
    }

@Test
    public void wisequarterTesti() {

        // Wise quarter anasayfaya gidip
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.wisequarter.com");

        // Title'in Wise Quarter icerdigini test edin
        String expectedTitleIcerik = "Wise Quarter";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Wise Quarter title testi PASSED");
        } else {
            System.out.println("Wise Quarter title testi FAILED");
        }

        // ve sayfayi kapatin
        driver.close();
    }

}


