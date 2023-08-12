package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaLogin(){
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        waitElementBePresent(create_email_field, 20);
    }

    public void fillEmailCreate(){
        driver.findElement(create_email_field).sendKeys(getRandonEmail());
    }

    public void clickCreateCount(){
        driver.findElement(create_email_button).click();
    }
}
