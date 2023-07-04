package tests.day09_actions_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C05_FileExists {

    @Test
    public void test01(){

         // C:\\Users\\Admin\\Downloads\\avatar.png

        Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\Admin\\Downloads\\avatar.png")));
    }

    @Test
    public void dinamikTest(){

        System.out.println(System.getProperty("user.dir"));

        String dinamikDosyaYolu = System.getProperty("user.home") + "\\Downloads\\avator.png";

        System.out.println(dinamikDosyaYolu);

    }
}
