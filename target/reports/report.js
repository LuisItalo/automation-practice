$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("message.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Enviar mensagem",
  "description": "",
  "id": "enviar-mensagem",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@message"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Enviar uma mensagem com sucesso",
  "description": "",
  "id": "enviar-mensagem;enviar-uma-mensagem-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@enviar-mensagem-sucesso"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que estou na tela de mensagens",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "preencho todos os campos",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "clico em enviar mensagem",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "retorna mensagem enviada com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "MessageSteps.que_estou_na_tela_de_mensagens()"
});
formatter.result({
  "duration": 18442609117,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.preencho_todos_os_campos()"
});
formatter.result({
  "duration": 2674362630,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.clico_em_enviar_mensagem()"
});
formatter.result({
  "duration": 12671660507,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.retorna_mensagem_enviada_com_sucesso()"
});
formatter.result({
  "duration": 697156276,
  "status": "passed"
});
});