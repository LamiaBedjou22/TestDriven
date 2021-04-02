package homepage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homepage.AirbnbHomepageLocators.*;
import static homepage.AirbnbHomepageLocators.webElementSearchButton;

public class AirbnbHomepage extends BaseAPI{

    @FindBy (css = webElementWhereAreYouGoingInput)
    WebElement whereAreYouGoingInput;

    @FindBy (xpath = webElementCheckInAddDates)
    WebElement checkInAddDates;

    @FindBy (css = webElementIAmFlexible)
    WebElement iAmFlexible;

    @FindBy (xpath = webElementCheckOutAddDates)
    WebElement checkOutAddDates;

    @FindBy (xpath = webElementAddGuests)
    WebElement addGuests;

    @FindBy (css = webElementIncreaseAdultGuest)
    WebElement increaseAdultGuest;

    @FindBy (css = webElementSearchButton)
    WebElement searchButton;

    public AirbnbHomepage()  {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToDestination(String keysToSend) {
        whereAreYouGoingInput.sendKeys(keysToSend);
    }


    public void createFlexibleSearch() {
        checkInAddDates.click();
        iAmFlexible.click();
        addGuests.click();
        increaseAdultGuest.click();
        searchButton.click();
    }


}
