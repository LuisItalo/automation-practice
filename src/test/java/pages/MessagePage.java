package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import suport.Utils;

public class MessagePage extends Utils {
    WebDriver driver;

    private By subject_field = By.id("id_contact");
    private By message_field = By.id("message");
    private By upload_field = By.id("fileUpload");
    private By email_field = By.id("email");
    private By submit_button = By.id("submitMessage");


    public void acessarMessage(){
        driver.get("http://www.automationpractice.pl/index.php?controller=contact");
        waitElementBePresent(message_field,10);
    }

    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selecionaAssunto(String assunto){
        Select select_assunto = new Select(driver.findElement(subject_field));
        select_assunto.selectByVisibleText(assunto);
    }

    public void preencheMensagem(String message){
        driver.findElement(message_field).sendKeys(message);
    }

    public void preencheEmail(){
        driver.findElement(email_field).sendKeys(Utils.getRandonEmail());
    }

    public void uploadField(String caminhoArqivo){
        driver.findElement(upload_field).sendKeys(caminhoArqivo);
    }

    public void clickSubmit(){
        driver.findElement(submit_button).click();
    }
}
