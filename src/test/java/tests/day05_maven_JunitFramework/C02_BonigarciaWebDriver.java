package tests.day05_maven_JunitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C02_BonigarciaWebDriver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
    }
}

    git init
    git add .
        git commit -m "Day05"
        git branch -M main
        git remote add origin https://github.com/veyselDursun/team116_JUNIT.git
        git push -u origin main