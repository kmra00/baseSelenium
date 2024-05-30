package drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "Y:\\Curso_Selenium\\automationframework\\automationframework\\src\\main\\resources/geckodriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
