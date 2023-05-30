import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class HomePage extends HomePageBases {
    WebDriver webDriver;
    public HomePage(WebDriver webdriver) {
        super(webdriver);
    }
    @FindBy(xpath ="//*[@id=\"routeSlider\"]/div/a[2]")
    WebElement switchButton;
    @FindBy(xpath ="//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")
    WebElement rout;
    @FindBy(xpath="//*[@id=\"txtJourneyDate\"]")
    WebElement datePicker;
    @FindBy(xpath ="//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")
    WebElement searchButton;
    @FindBy(xpath ="//div[@id=\"ui-datepicker-div\"]/table[1]//td")
    List<WebElement> dates;
    @FindBy(xpath="//*[@id=\"ForwardResults\"]/div[2]/div[1]/div[1]/div[3]/div")
    WebElement selectSeatsButton;

    /////////////////////////////Chang it with available Seat//////////////////////////////
    @FindBy(xpath ="//*[@id=\"Forward88\"]")
    WebElement selectedSeat;
    @FindBy(xpath ="//*[@id=\"passengerNameForward0\"]")
    WebElement nameField;
    @FindBy(xpath ="//*[@id=\"cardNumberForward0\"]")
    WebElement idField;
    @FindBy(id ="passengerAgeForward0")
    WebElement ageField;
    @FindBy(xpath ="//*[@id=\"PgBtn\"]")
    WebElement makePaymentButton;
    @FindBy(xpath ="//*[@id=\"ForwardAvailableServicesDiv\"]/div[2]/div[2]/div/div/div[4]/div[2]/div/span[2]")
    WebElement boardingPoint ;
    @FindBy(id ="BoardingPoint885")
    WebElement boardingPointSel ;
    @FindBy(xpath ="//*[@id=\"ForwardAvailableServicesDiv\"]/div[2]/div[2]/div/div/div[4]/div[3]/div/span[2]")
    WebElement droppingPoint ;
    @FindBy(id ="DroppingPoint559")
    WebElement droppingPointSel;
    @FindBy(id ="Forwardprofile-tab")
    WebElement mobileButton;
    @FindBy(id ="email")
    WebElement emailField;
    @FindBy(id ="mobileNo")
    WebElement mobileField;
    @FindBy(xpath ="//*[@id=\"genderCodeIdForward0\"]")
    WebElement gender ;
    @FindBy(xpath ="//*[@id=\"concessionIdsForward0\"]")
    WebElement concession ;
    @FindBy(id ="Forwarddroping-tab")
    WebElement dropPointField;
    @FindBy(id ="Forward-1467467616730")
    WebElement dropPointFieldSel;
    @FindBy(xpath ="//*[@id=\"form-common\"]/div[1]/div[1]/div")
    WebElement paymentPage ;
    @FindBy(xpath ="//*[@id=\"form-common\"]/div[1]/div[1]/div/div/div[2]/div/button[1]/div")
    WebElement cardMethodButton;
    @FindBy(id ="card_number")
    WebElement cardNumberField;
    @FindBy(id ="card_expiry")
    WebElement expiryDateField;
    @FindBy(id ="card_cvv")
    WebElement cvvField;


    public  void happyScenario() throws InterruptedException {
        Thread.sleep(1000);
        switchButton.click();
        Thread.sleep(1000);
        rout.click();
        Thread.sleep(1000);
        selectArrivalDate();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(2000);
        selectSeatsButton.click();
        Thread.sleep(2000);
        selectedSeat.click();
        Thread.sleep(1000);
        selectBoardingPoint();
        Thread.sleep(1000);
        selectDroppingPoint();
        setCustomerInfo("21","24","Mahmoud","0000000000","6789125987","1234@gmail.com");
        Thread.sleep(1000);
        makePaymentButton.click();
        Thread.sleep(7000);
       //paymentPage;
        Thread.sleep(1000);
        webDriver.switchTo().frame(1);//window("home-methods svelte-1ovguqh");
        Thread.sleep(1000);
        cardMethodButton.click();
        cardInfo("9755859","0929","000");

    }
    private void cardInfo(String cardNumber,String cardExpiryDate,String cardCVV) {
        cardNumberField.sendKeys(cardNumber);
        expiryDateField.sendKeys(cardExpiryDate);
        cvvField.sendKeys(cardCVV);
    }
    public void selectBoardingPoint(){
        boardingPoint.click();
//        Select select = new Select(boardingPoint);
//        select.selectByVisibleText("CHIKKAMAGALURU BUS STAND");
        boardingPointSel.click();
        boardingPoint.click();


    }
    public void selectDroppingPoint() throws InterruptedException {
        droppingPoint.click();
//        Select select = new Select(droppingPoint);
//        select.selectByValue("2492");
        droppingPointSel.click();
        Thread.sleep(500);
        droppingPoint.click();
        Thread.sleep(500);
        dropPointField.click();
        Thread.sleep(500);
        dropPointFieldSel.click();
        Thread.sleep(500);
    }
    public void selectArrivalDate() throws InterruptedException {
        datePicker.click();
        Thread.sleep(500);
        for(WebElement webElement:dates) {
            String date= webElement.getText();
            if(date.equalsIgnoreCase("26"))
            {
                webElement.click();
                break;
            }
        }
    }
    private void setCustomerInfo(String customerAge,String customerGenderValue,String customerName,String customerID,String customerNumber,String customerEmail) throws InterruptedException {
        mobileButton.click();
        Thread.sleep(1000);
        mobileField.sendKeys(customerNumber);
        Thread.sleep(500);
        emailField.sendKeys(customerEmail);
        Thread.sleep(500);
        nameField.sendKeys(customerName);
        Thread.sleep(500);
        Select selectGender = new Select(gender);
        selectGender.selectByValue(customerGenderValue);
        Thread.sleep(500);
       ageField.click();
        ageField.sendKeys(customerAge);
        Thread.sleep(500);
        Select selectID = new Select(concession);
        selectID.selectByValue("1466060086837");
        idField.sendKeys(customerID);
    }



}
