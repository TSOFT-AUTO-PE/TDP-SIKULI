Feature: CRM_MasSimple

  @CRM_Login
  Scenario Outline: Login CRM

    Given Se ingresa a la aplicacion CRM +Simple en el ambiente "<caso_prueba>"
    When Se ingresa el usuario "<caso_prueba>"
    And Se ingresa La contraseña "<caso_prueba>"
    Then se da click en el boton Iniciar Session
    And se espera la carga correcta del login CRM +Simple

    Examples:
      | caso_prueba |
      |           1 |

  @CRM_CrearClienteResidencial_DNI
  Scenario Outline: Crear Cliente Residencial con DNI

    Given Se ingresa a la aplicacion CRM +Simple en el ambiente "<caso_prueba>"
    When Se ingresa el usuario "<caso_prueba>"
    And Se ingresa La contraseña "<caso_prueba>"
    Then se da click en el boton Iniciar Session
    And se espera la carga correcta del login CRM +Simple
    When se ingresa a crear cliente
    And se selecciona cliente residencial
    And se ingresa el DNI del cliente "<caso_prueba>" y se valida
    And se verifica la direccion para dar de alta
    Then se da click en guardar para finalizar el registro del cliente residencial

    Examples:
      | caso_prueba |
      |           1 |

  @CRM_CrearClienteCorporativo_RUC
  Scenario Outline: Crear Cliente Corporativo con RUC y Acuerdo Comercial

    Given Se ingresa a la aplicacion CRM +Simple en el ambiente "<caso_prueba>"
    When Se ingresa el usuario "<caso_prueba>"
    And Se ingresa La contraseña "<caso_prueba>"
    Then se da click en el boton Iniciar Session
    And se espera la carga correcta del login CRM +Simple
    When se ingresa a crear cliente
    And se selecciona cliente corporativo
    And se ingresa el DNI del cliente "<caso_prueba>" y se valida
    And se ingresa el RUC del cliente "<caso_prueba>" y se valida
    And se verifica la direccion para dar de alta
    Then se cambia el subtipo de cliente a empresas oro permitiendo acuerdo comercial
    And se da click en guardar para finalizar el registro del cliente corporativo

    Examples:
      | caso_prueba |
      |           1 |