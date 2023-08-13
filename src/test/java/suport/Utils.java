package suport;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunTest;

import java.security.SecureRandom;
import java.util.Random;

public class Utils extends RunTest {

    public void waitElementBePresent(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandonEmail(){
        String email_init = "luisqa";
        String email_final = "@teste.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public String getRandonPass(int len){
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";

        SecureRandom random =new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++){
            int radomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(radomIndex));
        }
        return sb.toString();
    }
}
