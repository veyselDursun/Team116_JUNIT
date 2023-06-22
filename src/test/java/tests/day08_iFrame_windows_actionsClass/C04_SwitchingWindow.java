package tests.day08_iFrame_windows_actionsClass;

import org.junit.Test;
import utilities.TestBaseQuit;

public class C04_SwitchingWindow extends TestBaseQuit {

    @Test

    public void test01(){
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.


        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.


        //● Click Here butonuna basın.


        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.


        //● Sayfadaki textin “New Window” olduğunu doğrulayın.


        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.



    }
}
