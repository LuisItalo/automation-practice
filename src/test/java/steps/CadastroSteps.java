package steps;


import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunTest;

public class CadastroSteps extends RunTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome("Italo");
        cadastroPage.preencheSobrenome("QA");
        cadastroPage.preenchePassword();
        cadastroPage.selecionaAniversario(20,5,"1991");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {

    }

    @Entao("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {

    }

}
