package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import runner.RunTest;
import suport.Utils;

public class CadastroPage extends RunTest {

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By email_field = By.id("email");
    private By password_field = By.id("passwd");

    private By day_field = By.id("days");
    private By months_field = By.id("months");
    private By years_field = By.id("years");

    private By adress_field = By.id("adress1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postCode_field = By.id("postcode");
    private By phoneMobile_field = By.id("phone_mobile");

    private By submit_button = By.id("submitAccount");



    public void selectTitle(Integer type){
        Utils.waitElementBePresent(titleM, 20);

        if(type ==1){
            getDriver().findElement(titleM).click();
        }else if (type ==2){
            getDriver().findElement(titleF).click();
        }
    }
    public void preencheNome(){
        getDriver().findElement(first_name_field).sendKeys(Utils.getNomeAleatorio());
    }
    public void preencheSobrenome(){
        getDriver().findElement(last_name_field).sendKeys(Utils.getSobrenomeAleatorio());
    }
    public void preencheEmail(String email){
        getDriver().findElement(email_field).sendKeys(email);
    }
    public void preenchePassword(){
        getDriver().findElement(password_field).sendKeys(Utils.getRandonPass(10));
    }
    public void selecionaAniversario(Integer day, Integer months, String years){
        Select select_day = new Select(getDriver().findElement(day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(months_field));
        select_month.selectByIndex(months);

        Select select_years = new Select(getDriver().findElement(years_field));
        select_years.selectByValue(years);
    }

    public void preencheAddress(String address){
        getDriver().findElement(adress_field).sendKeys(address);
    }
    public void preencheCity(String city){
        getDriver().findElement(city_field).sendKeys(city);
    }
    public void selecionaState(String state){
        Select select_state = new Select(getDriver().findElement(state_field));
        select_state.selectByVisibleText(state);
    }
    public void preenchePostalCode(String postalcode){
        getDriver().findElement(postCode_field).sendKeys(postalcode);
    }
    public void preenchePhoneMobile(String phone){
        getDriver().findElement(phoneMobile_field).sendKeys(phone);
    }
    public void clickRegister(){
        getDriver(). findElement(submit_button).click();
    }
    public void validaCadastro(){
        Utils.waitElementBePresent(By.cssSelector("p[class='alert alert-success']"), 10);
        String resultado_atual = getDriver().findElement(By.cssSelector("p[class='alert alert-success']")).getText();
        Assert.assertEquals("Your account has been created.", resultado_atual);
    }
}
