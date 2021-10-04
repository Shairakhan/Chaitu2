package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverFactory;

public class HomePageClass
{
    WebDriver driver;
   @FindBy(linkText = "Register")
    WebElement registerlink;
   @FindBy(linkText = "Log in")
    WebElement loginlink;
   @FindBy(linkText = "Wishlist")
    WebElement wishlistlink;
   @FindBy(linkText = "Shopping cart")
    WebElement shoppingcart;
   @FindBy(id="small-searchterms")
   WebElement searchbox;
   @FindBy(linkText = "Search")
   WebElement searchbutton;
   @FindBy(linkText = "Computers ")
    WebElement computerElectronic;
   public void HomePageClass(WebDriver driver) {
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }
       //action
   public void navigateToUrl(String url)
       {
           driver.navigate().to("url");
       }

   public void clickOnRegisterLink()
   {
       driver.findElement(By.linkText("Register")).click();
   }
   public void clickOnLoginLink()
   {
       driver.findElement(By.id("Log in")).click();
   }
   public void clickwishList()
   {
    driver.findElement(By.linkText("Wishlist")).click();
   }
    public void clickShoppingCart()
    {
        driver.findElement(By.linkText("Shopping cart")).click();
    }
  public void enterSearchBox(String Laptop)
       {
           driver.findElement(By.linkText("Search")).sendKeys("Laptop");
       }


       public String pageTitle()
       {
           String pageTitle=DriverFactory.driver.getTitle();
           return pageTitle;

       }


}
