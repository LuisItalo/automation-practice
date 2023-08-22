package steps;


import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunTest;

public class CadastroSteps extends RunTest {

    CadastroPage cadastroPage = new CadastroPage();


    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome();
        cadastroPage.preencheSobrenome();
        cadastroPage.preenchePassword();
        cadastroPage.selecionaAniversario(20,5,"1991");
//        cadastroPage.preencheAddress("Rua da casa italo, 123");
//        cadastroPage.selecionaState("colorado");
//        cadastroPage.preencheCity("fortaleza");
//        cadastroPage.preenchePostalCode("888800");
//        cadastroPage.preenchePhoneMobile("+5504891919191");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clickRegister();
    }

    @Entao("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        cadastroPage.validaCadastro();
    }

}
