package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.MessagePage;
import runner.RunTest;
import suport.Utils;

public class MessageSteps extends RunTest {

    MessagePage messagePage = new MessagePage(getDriver());

    @Dado("^que estou na tela de mensagens$")
    public void que_estou_na_tela_de_mensagens() {
        messagePage.acessarMessage();
    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos() {
        messagePage.selecionaAssunto("Webmaster");
        messagePage.preencheEmail();
        messagePage.preencheMensagem("Minha mensagem");
        messagePage.uploadField("/home/luis/Java-Code/untitled/upload.png");
    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() {
        messagePage.clickSubmit();
    }

    @Entao("^retorna mensagem enviada com sucesso$")
    public void retorna_mensagem_enviada_com_sucesso() {
        Utils.waitElementBePresent(By.cssSelector("p[class='alert alert-success']"),10);
        String resultado_atual = getDriver().findElement(By.cssSelector("p[class='alert alert-success']")).getText();
        Assert.assertEquals("Your message has been successfully sent to our team.", resultado_atual);
        Utils.screenshot("Teste menssage");
    }
}
