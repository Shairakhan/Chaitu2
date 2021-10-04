package utilities;

import basepage.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory
{

   public static WebDriver driver;//static variable



    public static WebDriver getDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        BasePage.pageInitalization();

        return driver;
    }


    public static void closedirver(){
        driver.quit();
    }
}