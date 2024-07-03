# README

Proyecto de Testing Automation con Serenity BDD, JUnit 5 y Cucumber

¡Bienvenido al repositorio del proyecto de automatización de pruebas con Appium!
Este proyecto utiliza Java con Appium, Serenity BDD, JUnit 5 y Cucumber para automatizar pruebas de software siguiendo prácticas de BDD (Behavior-Driven Development).

## Requisitos previos
Para trabajar en este proyecto, asegúrate de tener instalado lo siguiente:

- Java JDK 11 o superior
- Maven
- Appium Desktop
- IDE (recomendado: IntelliJ IDEA)

## Configuración del Entorno

1. **Clonar el repositorio:**

Clona este repositorio a tu máquina local usando el siguiente comando:

<pre>
git clone https://github.com/Valentina-Bianchini/Appium-Ejemplo.git
</pre>

2. **Abrir el proyecto en IntelliJ IDEA:**

- Abre IntelliJ IDEA.
- Selecciona "Open" y navega hasta la ubicación del repositorio clonado. Haz clic en "Open".

3. **Importar dependencias:**

- IntelliJ debería detectar automáticamente el archivo pom.xml. Si no, ábrelo manualmente.
- Espera a que IntelliJ descargue y configure las dependencias definidas en el archivo pom.xml.

## Ejecución de Pruebas

Para ejecutar las pruebas del proyecto, sigue estos pasos:

**1. Preparación:**

    - Conecta un dispositivo Android.
    - Inicia Appium en la terminal con el comando.
<pre>
appium
</pre>

**2. Ejecución de pruebas:**

Abre una terminal en la raíz del proyecto y ejecuta el siguiente comando:

<pre>
mvn clean verify
</pre>

Este comando realizará las siguientes acciones:

- Limpiará el proyecto.
- Compilará el código fuente.
- Ejecutará las pruebas automatizadas.

## Estructura del Proyecto:

Explora la estructura del proyecto para familiarizarte con su organización:

<pre>
.
├── src
│   ├── main
│   │   └── java (código fuente del proyecto)
│   │       ├── configurations
│   │       │   └── (configuraciones de los dispositivos reales o emulados)
│   │       └── tasks
│   │           └── (tareas que realizara el actor)
│   │       └── userinterfaces
│   │           └── (targets UI de la aplicacion)
│   └── test
│       ├── java (pruebas automatizadas en Java)
│       │   ├── runners
│       │   │    └── (clases que ejecutan las pruebas)
│       │   └── stepdefinitions
│       │        └── (definiciones de pasos en Cucumber)
│       └── resources
│           └── features
│               └── (archivos de definiciones de características en Cucumber)
└── pom.xml
</pre>

# Features y tags

Solo existe una feature relacionada a un login de la aplicacion de Sauce Labs y es @ejemplo.

# ¡Gracias por tu interés en este proyecto!

Esperamos que esta guía te ayude a poner en marcha el proyecto de testing automation utilizando Serenity BDD, JUnit 5, Cucumber y Appium. Si tienes alguna sugerencia o mejora para este README, ¡no dudes en compartirla!
