package qa.addressbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.HashMap;
import java.util.Map;
public class TestAddressTest {
    //private WebDriver driver;
    //private Map<String, Object> vars;
    //JavascriptExecutor js;
   /* @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }*/
    @Test
    public void testAddress() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aseleva\\Documents\\GitHub\\Test_java\\addressbook_web\\src\\test\\java\\qa\\addressbook\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
