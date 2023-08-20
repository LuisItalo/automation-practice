package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import suport.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;

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


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type){
        waitElementBePresent(titleM, 20);

        if(type ==1){
            driver.findElement(titleM).click();
        }else if (type ==2){
            driver.findElement(titleF).click();
        }
    }
    public void preencheNome(){
        driver.findElement(first_name_field).sendKeys(getNomeAleatorio());
    }
    public void preencheSobrenome(){
        driver.findElement(last_name_field).sendKeys(getSobrenomeAleatorio());
    }
    public void preencheEmail(String email){
        driver.findElement(email_field).sendKeys(email);
    }
    public void preenchePassword(){
        driver.findElement(password_field).sendKeys(getRandonPass(10));
    }
    public void selecionaAniversario(Integer day, Integer months, String years){
        Select select_day = new Select(driver.findElement(day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(driver.findElement(months_field));
        select_month.selectByIndex(months);

        Select select_years = new Select(driver.findElement(years_field));
        select_years.selectByValue(years);
    }

    public void preencheAddress(String address){
        driver.findElement(adress_field).sendKeys(address);
    }
    public void preencheCity(String city){
        driver.findElement(city_field).sendKeys(city);
    }
    public void selecionaState(String state){
        Select select_state = new Select(driver.findElement(state_field));
        select_state.selectByVisibleText(state);
    }
    public void preenchePostalCode(String postalcode){
        driver.findElement(postCode_field).sendKeys(postalcode);
    }
    public void preenchePhoneMobile(String phone){
        driver.findElement(phoneMobile_field).sendKeys(phone);
    }
    public void clickRegister(){
        driver. findElement(submit_button).click();
    }
    public void validaCadastro(){
        waitElementBePresent(By.cssSelector("p[class=\"alert alert-success\"]"), 10);
        String resultado_atual = driver.findElement(By.cssSelector("p[class=\"alert alert-success\"]")).getText();
        Assert.assertEquals("Your account has been created.", resultado_atual);
    }
}
