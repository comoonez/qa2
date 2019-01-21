package FinalHomework;

import FinalHomework.model.FormData;
import FinalHomework.pages.BaseFunctions;
import FinalHomework.pages.HomePage;
import FinalHomework.pages.RegistrationPage;
import FinalHomework.pages.SeatPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class ReservationStepDefinitions {

    private BaseFunctions baseFunc = new BaseFunctions();
    private HomePage homePage;
    private RegistrationPage registrationPage;
    private FormData formData;
    private SeatPage seatPage;
    private Map params;
    private final String URL = "qaguru.lv:8090/tickets";

    @Given("I am on home page")
    public void open_home_page() {
        baseFunc.openPage(URL);
        homePage = new HomePage(baseFunc);
    }

    @When("I selected departure airport (.*)")
    public void select_departure_airport(String departure) {
        homePage.selectDepartureAirport(departure);
    }

    @When("I selected arrival airport (.*)")
    public void select_arrival_airport(String arrival) {
        homePage.selectArrivalAirport(arrival);
    }

    @When("user data is:")
    public void fill_registration_form(Map<String, String> params) {
            formData.setPersonName(params.get("name"));
            formData.setPersonSurname(params.get("surname"));
            formData.setDiscount(params.get("discountCode"));
            formData.setAdultCount(Integer.valueOf(params.get("personCount")));
            formData.setChildrenCount(Integer.valueOf(params.get("childrenCount")));
            formData.setLuggageCount(Integer.valueOf(params.get("luggageCount")));
            formData.setFlightDate(params.get("flightDate"));
    }

    @When("I click on GO button")
    public void click_go_button() {
        registrationPage = homePage.clickOnGoButton();
    }

    @Then("registration page appears")
    public void check_registration_page() {
        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
    }

    @When("I fill registration form with given data")
    public void fill_registration_form() {
        registrationPage.fillPersonName((String) params.get(formData.getPersonName()));
        registrationPage.fillPersonSurname((String) params.get(formData.getPersonSurname()));
        registrationPage.fillDiscountCode((String) params.get(formData.getDiscount()));
        registrationPage.fillAdultCount((Integer) params.get(formData.getAdultCount()));
        registrationPage.fillChildrenCount((Integer) params.get(formData.getChildrenCount()));
        registrationPage.fillLuggageCount((Integer) params.get(formData.getLuggageCount()));
        registrationPage.selectFlightDate((String) params.get(formData.getFlightDate()));
    }

    @Then("I click on Get Price button")
    public void click_getprice_button(String button) {
        registrationPage.clickGetPriceButton(button);
    }

    @Then("I get price for current flight: (.*) EUR")
    public void check_price_for_current_flight(String price) {

    }

    @When("I click on Book button")
    public void click_book_button(String button) {
        seatPage = registrationPage.clickOnBookButton();
    }

    @Then("seat selection page appeared")
    public void check_seat_selection_page() {
        SeatPage seatPage = new SeatPage(baseFunc);
    }

}