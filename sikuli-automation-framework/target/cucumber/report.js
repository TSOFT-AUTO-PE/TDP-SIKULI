$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CRM_MasSimple.feature");
formatter.feature({
  "line": 1,
  "name": "CRM_MasSimple",
  "description": "",
  "id": "crm-massimple",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login CRM",
  "description": "",
  "id": "crm-massimple;login-crm",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@CRM_Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Se ingresa a la aplicacion CRM +Simple en el ambiente \"\u003ccaso_prueba\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Se ingresa el usuario \"\u003ccaso_prueba\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Se ingresa La contraseña \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "se da click en el boton Iniciar Session",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "se espera la carga correcta del login CRM +Simple",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "crm-massimple;login-crm;",
  "rows": [
    {
      "cells": [
        "caso_prueba"
      ],
      "line": 13,
      "id": "crm-massimple;login-crm;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 14,
      "id": "crm-massimple;login-crm;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 396475003,
  "status": "passed"
});
formatter.before({
  "duration": 4180486590,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login CRM",
  "description": "",
  "id": "crm-massimple;login-crm;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@CRM_Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Se ingresa a la aplicacion CRM +Simple en el ambiente \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Se ingresa el usuario \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Se ingresa La contraseña \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "se da click en el boton Iniciar Session",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "se espera la carga correcta del login CRM +Simple",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 55
    }
  ],
  "location": "CRM_Registros.seIngresaALaAplicacionCRMSimpleEnElAmbiente(String)"
});
formatter.result({
  "duration": 12872749759,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 23
    }
  ],
  "location": "CRM_Registros.seIngresaElUsuario(String)"
});
formatter.result({
  "duration": 4480141484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "CRM_Registros.seIngresaLaContraseña(String)"
});
