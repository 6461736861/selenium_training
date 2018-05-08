package selenium_training;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginUnderAdinTestSimple extends TestBase {
    @Test
    public void assertYouAreLoggedIn() {
        loginUnderAdmin();
        Assert.assertEquals("You are now logged in as admin", driver.findElement(By.cssSelector(".success")).getText());
    }
}
