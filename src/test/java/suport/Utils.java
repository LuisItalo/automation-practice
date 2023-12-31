package suport;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunTest;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utils extends RunTest {

    public static void waitElementBePresent(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void screenshot(String nomeEvidencia){
        TakesScreenshot scrShot = (TakesScreenshot) getDriver();
        File srcFile = scrShot.getScreenshotAs((OutputType.FILE));
        File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getRandonEmail(){
        String email_init = "luisqa";
        String email_final = "@teste.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public static String getRandonPass(int len){
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";

        SecureRandom random =new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++){
            int radomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(radomIndex));
        }
        return sb.toString();
    }

    public static StringBuilder getNomeAleatorio(){
        ThreadLocalRandom gerador = ThreadLocalRandom.current();

        int tamanhoNome = gerador.nextInt(3, 10);

        char primeiraLetraNome = (char) gerador.nextInt(65, 90);

        StringBuilder nome = new StringBuilder().append(primeiraLetraNome);

        for (int i = 1; i < tamanhoNome; i++){
            char letra = (char) gerador.nextInt(97, 122);
            nome.append(letra);
        }

        return nome;
    }
    public static String getSobrenomeAleatorio() {
        ThreadLocalRandom gerador = ThreadLocalRandom.current();

        int tamanhoSobrenome = gerador.nextInt(3, 10);

        char primeiraLetraSobreNome = (char) gerador.nextInt(65, 90);

        StringBuilder sobreNome = new StringBuilder().append(primeiraLetraSobreNome);

        for (int i = 1; i < tamanhoSobrenome; i++) {
            char letra = (char) gerador.nextInt(97, 122);
            sobreNome.append(letra);
        }
        return sobreNome + "QA";
    }
}
