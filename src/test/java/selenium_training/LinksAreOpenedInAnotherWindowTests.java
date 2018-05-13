package selenium_training;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class LinksAreOpenedInAnotherWindowTests extends TestBase {

    @Test
    public void test() {
        loginUnderAdmin();
        Assert.assertEquals("You are now logged in as admin", driver.findElement(By.cssSelector(".success")).getText());

        driver.get("http://localhost:8888/litecart/admin/?app=countries&doc=countries");

        List<WebElement> allCountries = driver.findElements(By.xpath("//a[@title='Edit']"));
        allCountries.get(new Random().nextInt(allCountries.size())).click();

        String parentWindow = driver.getWindowHandle();
        List<WebElement> buttonsToOpenInNewTab = driver.findElements(By.xpath("//i[@class='fa fa-external-link']"));

        for (WebElement buttonForClicking : buttonsToOpenInNewTab) {
            buttonForClicking.click();
            Set<String> allWindows = driver.getWindowHandles();
            for (String curWindow : allWindows) {
                driver.switchTo().window(curWindow);
            }
            driver.close();
            driver.switchTo().window(parentWindow);
        }
        driver.quit();
    }
}
