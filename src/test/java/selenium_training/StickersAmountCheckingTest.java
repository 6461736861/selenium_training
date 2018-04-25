package selenium_training;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class StickersAmountCheckingTest extends TestBase {
    @Test
    public void checkThatEachItemHasOnlyOneSticker() {
        driver.get("http://localhost:8888/litecart/");
        List<WebElement> items = driver.findElements(By.cssSelector(".link"));
        for (WebElement item : items) {
            assertThat(item.findElements(By.cssSelector(".sticker")).size(), lessThanOrEqualTo(1));
        }
    }
}
