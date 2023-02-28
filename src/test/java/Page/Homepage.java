package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy(id = "first-name")
    public WebElement first_name;

    @FindBy(xpath = "//input[@id='radio-button-2']")
    public WebElement college;
}
