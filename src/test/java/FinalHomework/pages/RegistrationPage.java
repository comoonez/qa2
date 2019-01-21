package FinalHomework.pages;

import org.openqa.selenium.By;

public class RegistrationPage {

    private BaseFunctions baseFunctions;
    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_INPUT = By.id("discount");
    private final By ADULTS_INPUT = By.id("adults");
    private final By CHILDREN_INPUT = By.id("children");
    private final By LUGGAGE_INPUT = By.id("bugs");
    private final By FLIGHT_DATE_DROPDOWN = By.id("flight");
    private final By GETPRICE_BUTTON = By.xpath(".//*[@id='fullForm']/span[@style='cursor: pointer;']");
    private final By BOOK_BUTTON = By.id("book3");
    private final By FLIGHT_PRICE = By.id("response");


    public RegistrationPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    public void fillPersonName(String name) {
        baseFunctions.getElement(NAME_INPUT).sendKeys(name);
    }

    public void fillPersonSurname(String surname) {
        baseFunctions.getElement(SURNAME_INPUT).sendKeys(surname);
    }

    public void fillDiscountCode(String discount) {
        baseFunctions.getElement(DISCOUNT_INPUT).sendKeys(discount);
    }

    public void fillAdultCount(int count) {
        baseFunctions.getElement(ADULTS_INPUT).sendKeys(String.valueOf(count));
    }

    public void fillChildrenCount(int count) {
        baseFunctions.getElement(CHILDREN_INPUT).sendKeys(String.valueOf(count));
    }

    public void fillLuggageCount(int count) {
        baseFunctions.getElement(LUGGAGE_INPUT).sendKeys(String.valueOf(count));
    }

    public void selectFlightDate(String date) {
        baseFunctions.selectFromDropdown(FLIGHT_DATE_DROPDOWN, date);
    }

    public void clickGetPriceButton(String button) {
        baseFunctions.click(GETPRICE_BUTTON);
    }

    public SeatPage clickOnBookButton() {
        baseFunctions.click(BOOK_BUTTON);
        return new SeatPage(baseFunctions);
    }
}