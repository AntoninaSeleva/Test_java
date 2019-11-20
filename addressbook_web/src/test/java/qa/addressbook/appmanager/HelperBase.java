package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By submit) {
        driver.findElement(submit).click();
    }

    protected void type(String name, By locator) {
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys(name);
    }
}
