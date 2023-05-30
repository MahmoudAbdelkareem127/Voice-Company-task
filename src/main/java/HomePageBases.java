import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class HomePageBases {
        public HomePageBases(WebDriver webdriver) {
            PageFactory.initElements(webdriver, this);

        }


}
