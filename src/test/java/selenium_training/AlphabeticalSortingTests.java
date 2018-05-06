package selenium_training;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class AlphabeticalSortingTests extends TestBase {
    @Test
    public void checkOpeningAllMenuSubmenuWorks() {
        driver.get("http://admin:admin@localhost:8888/litecart/admin/?app=countries&doc=countries");

    }
}
