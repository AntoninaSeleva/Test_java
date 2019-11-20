package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroup() {
        driver.get("http://localhost/addressbook/group.php");
        //click(By.linkText("groups"));
    }
}
