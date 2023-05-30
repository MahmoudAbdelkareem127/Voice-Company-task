import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class HomePageTestBases {
    WebDriver webDriver;
    @BeforeTest
    public void openUrl() {
        webDriver = new EdgeDriver();
        webDriver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        webDriver.manage().window().maximize();
    }

    @AfterTest(enabled = false)
    public void close() {
        webDriver.close();

    }
}
