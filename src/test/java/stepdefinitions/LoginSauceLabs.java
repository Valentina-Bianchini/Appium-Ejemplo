package stepdefinitions;

import configurations.AndroidReal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.LoginUserPassSauceLabs;

import java.net.MalformedURLException;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.UISauceLabs.*;

public class LoginSauceLabs {
    AndroidDriver driver; // Driver de Android para interactuar con la aplicación
    private final Actor actor = Actor.named("Usuario"); // Actor para representar al usuario en las pruebas
    private static final int WAIT_TIMEOUT_SECONDS = 20; // Tiempo máximo de espera en segundos

    @Given("^usuario anonimo ingresa en la App Sauce Labs$")
    public void usuarioAnonimoIngresaEnLaAppSauceLabs() throws MalformedURLException {
        // Configura el driver para Android real utilizando un método definido en otra clase
        driver = new AndroidReal().ConfigReal();
        // El actor puede navegar por la web utilizando el driver configurado
        actor.can(BrowseTheWeb.with(driver));
    }

    @When("^ingresa sus credenciales de la App Sauce Labs$")
    public void ingresaSusCredencialesDeLaAppSauceLabs(List<String> datos) {
        // El actor intenta esperar hasta que el logo de Swag Labs sea visible
        actor.attemptsTo(WaitUntil.the(LOGO_SWAGLABS, isVisible()).forNoMoreThan(WAIT_TIMEOUT_SECONDS).seconds());

        // El actor verifica que el logo de Swag Labs esté presente
        actor.should(seeThat(the(LOGO_SWAGLABS), isPresent()));

        // Verifica la visibilidad del botón de login utilizando Visibility.of
        if (Visibility.of(BTN_LOGIN).viewedBy(actor).asBoolean()) {
            // Si el botón de login es visible, el actor puede realizar el inicio de sesión con las credenciales proporcionadas
            actor.wasAbleTo(
                    LoginUserPassSauceLabs.conDatos(datos.get(0), datos.get(1))
            );
        }
    }

    @Then("^visualiza la pantalla Home de la App Sauce Labs$")
    public void visualizaLaPantallaHomeDeLaAppSauceLabs() {
        // Arreglo de elementos que se deben verificar en la pantalla Home
        Target[] elementos = {MENU_PRINCIPAL, CARRITO, PRODUCTO};

        // Itera sobre cada elemento y verifica su presencia en la pantalla
        for (Target elemento : elementos) {
            System.out.println("Verificando el elemento: " + elemento);

            // El actor intenta esperar hasta que el elemento sea visible
            actor.attemptsTo(WaitUntil.the(elemento, isVisible()).forNoMoreThan(WAIT_TIMEOUT_SECONDS).seconds());
            // El actor verifica que el elemento esté presente
            actor.should(seeThat(the(elemento), isPresent()));
        }
    }
}

