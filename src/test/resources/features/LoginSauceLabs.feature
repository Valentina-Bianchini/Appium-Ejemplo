##Este es un archivo .feature de Cucumber que describe el escenario de prueba
Feature: Validacion de login de App Sauce Labs

  @ejemplo
  Scenario Outline: Ingreso mediante formulario de login con credenciales correctas
    Given usuario anonimo ingresa en la App Sauce Labs
    When ingresa sus credenciales de la App Sauce Labs
      | <usuario> | <contrasenia> |
    Then visualiza la pantalla Home de la App Sauce Labs

    Examples:
      | usuario       | contrasenia  |
      | standard_user | secret_sauce |