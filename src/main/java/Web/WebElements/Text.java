package Web.WebElements;

import Web.WebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Text extends WebComponent<Text> {
    public Text(WebDriver driver, By findByMethod) {
        super(driver, findByMethod);
    }

}
