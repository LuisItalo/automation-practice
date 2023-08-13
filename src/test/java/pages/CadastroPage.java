package pages;

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
    public void preencheNome(String name){
        driver.findElement(first_name_field).sendKeys(name);
    }
    public void preencheSobrenome(String sobrenome){
        driver.findElement(last_name_field).sendKeys(sobrenome);
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
}
