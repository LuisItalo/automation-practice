$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de usuario",
  "description": "",
  "id": "cadastro-de-usuario",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Registrar novo usuario com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;registrar-novo-usuario-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "acesso o cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "vejo a mensagem de cadastro realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 6073038935,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_o_cadastro_de_usuario()"
});
formatter.result({
  "duration": 476094038,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.eu_preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "duration": 11769648222,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 41892,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.vejo_a_mensagem_de_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 63323,
  "status": "passed"
});
});