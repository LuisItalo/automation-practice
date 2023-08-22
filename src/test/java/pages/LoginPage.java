package pages;

import org.openqa.selenium.By;
import runner.RunTest;
import suport.Utils;

public class LoginPage extends RunTest {


    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");



    public void acessarTelaLogin(){
        getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        Utils.waitElementBePresent(create_email_field, 20);
    }

    public void fillEmailCreate(){
        getDriver().findElement(create_email_field).sendKeys(Utils.getRandonEmail());
    }

    public void clickCreateCount(){
        getDriver().findElement(create_email_button).click();
    }
}
