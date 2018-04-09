package selenium_training;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FirstTest extends TestBase {
    @Test
    public void myFirstTest() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnK")).click();
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.partialLinkText("webdriver")).sendKeys(selectLinkOpeninNewTab);
    }
}
