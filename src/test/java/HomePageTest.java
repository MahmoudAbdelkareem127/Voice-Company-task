import org.testng.annotations.Test;

public class HomePageTest extends HomePageTestBases {

    @Test
    public void testCase1() throws InterruptedException {
        HomePage homePage= new HomePage(webDriver);
        homePage.happyScenario();


    }


}
