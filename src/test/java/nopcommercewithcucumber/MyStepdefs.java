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
    @Given("^user is on the main page of website$")
    public void userIsOnTheMainPageOfWebsite() {
    }
    @When("^user proceed registration successfully$")
    public void userProceedRegistrationSuccessfully() {
        homePage.clickOnRegistrationButton();
        register.registration();
    }
    @And("^click on register continue button$")
    public void clickOnRegisterContinueButton() {
        registerResultContinuePage.clickOnRegisterContinueButton();
    }
    @And("^select hct one m android lollipop product from home page$")
    public void selectHctOneMAndroidLollipopProductFromHomePage() {
        homePage.clickOnHTCOneM8AndroidL50Lollipop();
    }
    @And("^navigate to product page$")
    public void navigateToProductPage() {
        productPageForHomePageProducts.HTCOneM8AndroidL5_0Lollipop();
    }
    @And("^add product in basket and accept terms and condition$")
    public void addProductInBasketAndAcceptTermsAndCondition() {
        shoppingCartPage.clickOnTermsOfService();
    }
    @And("^click on  check out button$")
    public void clickOnCheckOutButton() {
        shoppingCartPage.clickCheckOutButton();
    }
    @And("^proceed check out with required detail$")
    public void proceedCheckOutWithRequiredDetail() {
        checkOutPage.userIsAbleToBuyProductSuccessfully();
    }
    @Then("^registered user should be able to buy any product successfully$")
    public void registeredUserShouldBeAbleToBuyAnyProductSuccessfully() {
        Utils.assertByGetText("Your order has been successfully processed!", By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"), "You are not able to buy product successfully, test failed");
    }
    //user must have to accept terms and condition for buy any product successfully

    @Given("^user is on home page of website$")
    public void userIsOnHomePageOfWebsite() {

    }

    @When("^user click on register button from homepage$")
    public void userClickOnRegisterButtonFromHomepage() {
        homePage.clickOnRegistrationButton();
    }

    @And("^select product build your own computer from home page$")
    public void selectProductBuildYourOwnComputerFromHomePage() {
        homePage.clickOnBuildYourOwnComputer();
    }

    @And("^navigate to build your own computer product page$")
    public void navigateToBuildYourOwnComputerProductPage() {
        productPageForHomePageProducts.buildYourOwnComputer();
    }

    @And("^add product to basket and proceed checkout without accepting terms and condition$")
    public void addProductToBasketAndProceedCheckoutWithoutAcceptingTermsAndCondition() {
        shoppingCartPage.clickCheckOutButton();
    }

    @Then("^user should not be able to buy that product successfully$")
    public void userShouldNotBeAbleToBuyThatProductSuccessfully() {
        Utils.assertByGetText("Please accept the terms of service before the next step.", By.xpath("//p[contains(text(),'Please accept the terms of service before the next step.')]"), "Display message is not as per expected, Test failed"
        );

    }
    //unregistered user should not be able to send email
    @When("^click on product apple mac book from home page$")
    public void clickOnProductAppleMacBookFromHomePage() {
        homePage.clickOnAppleMacBookPro13_Inch();
    }

    @And("^click on email a friend button for product apple mac book$")
    public void clickOnEmailAFriendButtonForProductAppleMacBook() {
        emailAFriend.emailAFriendForUnRegisterUser();
    }

    @Then("^user should not be able to send email successfully$")
    public void userShouldNotBeAbleToSendEmailSuccessfully() {
        Utils.assertByGetText("Only registered customers can use email a friend feature", By.xpath("//li[contains(text(),'Only registered customers can use email a friend feature')]"), "Display Message is not as per expected, test is failed");
    }
}
