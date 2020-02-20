$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CRM_MasSimple.feature");
formatter.feature({
  "line": 1,
  "name": "CRM_MasSimple",
  "description": "",
  "id": "crm-massimple",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Crear Cliente Residencial con DNI",
  "description": "",
  "id": "crm-massimple;crear-cliente-residencial-con-dni",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@CRM_CrearClienteResidencial_DNI"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Se ingresa a la aplicacion CRM +Simple en el ambiente \"\u003ccaso_prueba\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Se ingresa el usuario \"\u003ccaso_prueba\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Se ingresa La contraseña \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "se da click en el boton Iniciar Session",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "se espera la carga correcta del login CRM +Simple",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "se ingresa a crear cliente",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "se selecciona cliente residencial",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "se ingresa el DNI del cliente \"\u003ccaso_prueba\u003e\" y se valida",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "se verifica la direccion para dar de alta",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "se da click en guardar para finalizar el registro del cliente residencial",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "crm-massimple;crear-cliente-residencial-con-dni;",
  "rows": [
    {
      "cells": [
        "caso_prueba"
      ],
      "line": 31,
      "id": "crm-massimple;crear-cliente-residencial-con-dni;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 32,
      "id": "crm-massimple;crear-cliente-residencial-con-dni;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2741946300,
  "status": "passed"
});
formatter.before({
  "duration": 77266900,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Crear Cliente Residencial con DNI",
  "description": "",
  "id": "crm-massimple;crear-cliente-residencial-con-dni;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@CRM_CrearClienteResidencial_DNI"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Se ingresa a la aplicacion CRM +Simple en el ambiente \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Se ingresa el usuario \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Se ingresa La contraseña \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "se da click en el boton Iniciar Session",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "se espera la carga correcta del login CRM +Simple",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "se ingresa a crear cliente",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "se selecciona cliente residencial",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "se ingresa el DNI del cliente \"1\" y se valida",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "se verifica la direccion para dar de alta",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "se da click en guardar para finalizar el registro del cliente residencial",
  "keyword": "Then "
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
  "duration": 5581555400,
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
  "duration": 19223313700,
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
formatter.result({
  "duration": 2154798500,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Registros.seDaClicEnElBotonIniciarSession()"
});
formatter.result({
  "duration": 1778235200,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Registros.seEsperaLaCargaCorrectaDelLoginCRMSimple()"
});
formatter.result({
  "duration": 35076836900,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Registros.seIngresaACrearCliente()"
});
formatter.result({
  "duration": 5815582200,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Registros.seSelecionaClienteResidencial()"
});
formatter.result({
  "duration": 6510142300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "CRM_Registros.seIngresaElDNIDelClienteYSeValida(String)"
});
formatter.result({
  "duration": 15437108100,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Registros.seVerificaLaDireccion()"
});
formatter.result({
  "duration": 64516917300,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Registros.seDaClickEnGuardarParaFinalizarElRegistroDelCliente()"
});
formatter.result({
  "duration": 4244688700,
  "status": "passed"
});
formatter.after({
  "duration": 768581600,
  "status": "passed"
});
});