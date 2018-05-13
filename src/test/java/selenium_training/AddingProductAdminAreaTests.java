package selenium_training;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AddingProductAdminAreaTests extends TestBase {
    @Test
    public void addingNewItemTests() throws IOException {
        Faker faker = new Faker();
        loginUnderAdmin();
        driver.findElement(By.linkText("Catalog")).click();
        driver.findElement(By.linkText("Add New Product")).click();

        driver.findElement(By.xpath("//input[@name='name[en]']")).sendKeys(faker.chuckNorris().fact());
        driver.findElement(By.xpath("//input[@name='code']")).sendKeys(faker.code().ean8());

        String filepath = "/Users/rb/selenium_training/src/test/resources/img/duck.img";
        WebElement uploadElement = driver.findElement(By.cssSelector("[type=\"file\"]"));
        uploadElement.sendKeys(System.getProperty("user.dir")+"/src/test/resources/img/duck.img");

//        upload.click();
//        upload.sendKeys(filepath);


        driver.findElement(By.xpath("//a[@href='#tab-information']")).click();

        driver.findElement(By.cssSelector("[name='manufacturer_id']")).click();
        driver.findElement(By.xpath("//*[@id='tab-information']/table/tbody/tr[1]/td/select/option[2]")).click();


        driver.findElement(By.xpath("//input[@name='short_description[en]']")).sendKeys(faker.harryPotter().quote());

        driver.findElement(By.xpath("//a[@href='#tab-prices']")).click();
        driver.findElement(By.xpath("//input[@name='purchase_price']")).sendKeys("1231232");
        driver.findElement(By.cssSelector("[name='purchase_price_currency_code']")).click();
        driver.findElement(By.xpath("//*[@id='tab-prices']/table[1]/tbody/tr/td/select/option[2]")).click();

        driver.findElement(By.xpath("//button[@name='save']")).click();
        driver.findElement(By.cssSelector(".success")).isDisplayed();
    }
}
