package selenium_training;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class AllMenuSubmenuClicking extends TestBase {
    @Test
    public void checkOpeningAllMenuSubmenuWorks() {
        driver.get("http://admin:admin@localhost:8888/litecart/admin/login.php");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        for (int i = 0; i < driver.findElements(By.cssSelector("#box-apps-menu>li>a")).size(); i++) {
            driver.findElements(By.cssSelector("#box-apps-menu>li>a")).get(i).click();
            Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());
            for (int j = 0; j < driver.findElements(By.cssSelector("#box-apps-menu>li>ul>li>a")).size(); j++) {
                driver.findElements(By.cssSelector("#box-apps-menu>li>ul>li>a")).get(j).click();
                Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());
            }
        }
    }
}


