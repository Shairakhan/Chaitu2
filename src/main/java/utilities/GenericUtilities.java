package utilities;

public class GenericUtilities
{

    public void navigatetourl()
    {
        DriverFactory.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    public void refreshPage()
    {
        DriverFactory.driver.navigate().refresh();
    }
    public void getPageTitle()
    {
       String pagetitle= DriverFactory.driver.getTitle();
        System.out.println(pagetitle);
    }

}
