package basepage;

import pageobjectmodel.HomePageClass;
import pageobjectmodel.LoginPageClass;
import utilities.DriverFactory;
import utilities.GenericUtilities;

public class BasePage
{
    public static HomePageClass homePageClass;
    public static LoginPageClass loginPageClass;
    public static GenericUtilities genericUtilities;




    public static void pageInitalization()
    {
        homePageClass=new HomePageClass();
        loginPageClass=new LoginPageClass();
        genericUtilities=new GenericUtilities();


    }
}
