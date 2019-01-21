package nopcommercewithcucumber;

import org.openqa.selenium.By;

public class ShopingCartPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    By checkOutButton = By.id("checkout");
    By termsOfServiceButton = By.id("termsofservice");

    //Add
    public void clickCheckOutButton()

    {
        clickOnElement(checkOutButton);
    }

    public void clickOnTermsOfService(){clickOnElement(termsOfServiceButton);}
}
