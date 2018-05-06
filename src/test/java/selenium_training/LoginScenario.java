package selenium_training;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class LoginScenario extends TestBase {
    @Test
    public void test() {
        Faker faker = new Faker();
        Random random = new Random();
        String newEmail = faker.name().username() + random.longs() + "gmail.com";
        String password = "123123123";

        driver.get("http://localhost:8888/litecart/");
        driver.findElement(By.xpath("//form[@name='login_form']/table//a[@href='http://localhost:8888/litecart/en/create_account']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(faker.address().cityName());
        driver.findElement(By.cssSelector(".select2-selection__rendered")).click();
        driver.findElement(By.xpath("//ul[@role='tree']/li[225]")).click();
        driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(faker.number().digits(5));
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(newEmail);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(faker.number().digits(5));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='confirmed_password']")).sendKeys(password);
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        driver.findElement(By.cssSelector(".success")).isDisplayed();

        driver.findElement(By.xpath("//a[@href='http://localhost:8888/litecart/en/logout']")).click();
        driver.findElement(By.cssSelector(".success")).isDisplayed();

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(newEmail);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@name='login']")).click();

        driver.findElement(By.cssSelector(".success")).isDisplayed();

        driver.findElement(By.xpath("//a[@href='http://localhost:8888/litecart/en/logout']")).click();
        driver.findElement(By.cssSelector(".success")).isDisplayed();
    }
}
