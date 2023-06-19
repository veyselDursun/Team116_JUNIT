package day05_maven_Junitframework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BonigarciaWebDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        Thread.sleep(3000);
        driver.close();

    }
}

    git init
    git add .
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/veyselDursun/team116_JUNIT.git
        git push -u origin main