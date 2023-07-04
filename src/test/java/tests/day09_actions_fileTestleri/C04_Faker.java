package tests.day09_actions_fileTestleri;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

public class C04_Faker extends TestBase {
    @Test
    public void test01(){

        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.internet().password());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.internet().avatar());
    }
}
