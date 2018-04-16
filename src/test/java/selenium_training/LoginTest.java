package selenium_training;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends TestBase {
    @Test
    public void checkLoginWorks() {
        //driver.navigate().to("http://localhost:8888/litecart/admin/login.php");
        driver.get("http://admin:admin@localhost:8888/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        Assert.assertEquals("You are now logged in as admin", driver.findElement(By.cssSelector(".success")).getText());
    }
}
