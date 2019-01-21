package nopcommercewithcucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyStepdefs extends Utils {
    RegistrationPage register = new RegistrationPage();
    RegisterResultContinuePage registerResultContinuePage = new RegisterResultContinuePage();
    HomePage homePage = new HomePage();
    EmailAFriendPage emailAFriend = new EmailAFriendPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ClothingPage productPage = new ClothingPage();
    AddToCartPage addToCartPage = new AddToCartPage();
    JewelryPage jewelryPage = new JewelryPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ClothingPage clothingPage = new ClothingPage();
    ProductPageForHomePageProducts productPageForHomePageProducts = new ProductPageForHomePageProducts();

    @Given("^user is on the registration page$")
    public void userIsOnTheRegistrationPage() {


    }

    @When("^user enter all the personal detail and click on Register button$")
    public void userEnterAllThePersonalDetailAndClickOnRegisterButton() {
        homePage.clickOnRegistrationButton();
        register.registration();
    }


    @Then("^user should be able to register successfully$")
    public void userShouldBeAbleToRegisterSuccessfully() {
        Utils.assertByGetText("Your registration completed", By.xpath("//div[contains(text(),'Your registration completed')]"), "Sorry your registration is not successful");

    }

    //To Verify Registered User Should Be Able To Send Email With Product Successfully
    @Given("^Registered user is on the main page of website$")
    public void registeredUserIsOnTheMainPageOfWebsite() {
    }
    @When("^registered user select product apple mac book from home page$")
    public void registeredUserSelectProductAppleMacbookFromHomePage() {
        homePage.clickOnRegistrationButton();
        register.registration();
        registerResultContinuePage.clickOnRegisterContinueButton();
        homePage.clickOnAppleMacBookPro13_Inch();
    }
    @And("^navigate to apple macbook product page$")
    public void navigateToAppleMacbookProductPage() {
        productPageForHomePageProducts.AppleMacBookPro13_Inch();
    }
    @And("^click on email a friend button to enter all detail with personal message$")
    public void clickOnEmailAFriendButtonToEnterAllDetailWithPersonalMessage() {
        emailAFriend.emailAFriendForRegisterUser();
    }
    @Then("^user should be able to send email with product successfully$")
    public void userShouldBeAbleToSendEmailWithProductSuccessfully() {
        Utils.assertByGetText("Your message has been sent.", By.xpath("//div[@class= 'result']"), "Sorry You are not able to send email successfully");
    }
    //To verify user should be able to buy any single product successfully


    @And("^add product in basket and accept terms and condition$")
    public void addProductInBasketAndAcceptTermsAndCondition() {

    }

    @And("^click on  check out button$")
    public void clickOnCheckOutButton() {

    }

    @And("^proceed check out with required detail$")
    public void proceedCheckOutWithRequiredDetail() {

    }

    @Then("^registered user should be able to buy any product successfully$")
    public void registeredUserShouldBeAbleToBuyAnyProductSuccessfully() {

    }


    
}
