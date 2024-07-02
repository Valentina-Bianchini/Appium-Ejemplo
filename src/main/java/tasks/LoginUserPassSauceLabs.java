package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static userinterfaces.UISauceLabs.*;

// La clase implementa la interfaz Task de Serenity BDD, lo que permite definir tareas reutilizables
public class LoginUserPassSauceLabs implements Task {
    // Variables privadas para almacenar el usuario y la contraseña

    private final String usuario;
    private final String contrasenia;

    // Constructor para inicializar las variables de usuario y contraseña
    public LoginUserPassSauceLabs (String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    // Método performAs sobrescribe la interfaz Task y define las acciones a realizar por el actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Ingresar el valor del usuario en el campo correspondiente
                Enter.theValue(usuario).into(USUARIO),
                // Ingresar el valor de la contraseña en el campo correspondiente
                Enter.theValue(contrasenia).into(CONTRASENIA),
                // Hacer clic en el botón de inicio de sesión
                Click.on(BTN_LOGIN)
        );
    }

    // Método estático para crear una instancia de la clase con los datos proporcionados
    public static LoginUserPassSauceLabs conDatos(String s, String s1){
        // Utiliza el método instrumented de Serenity BDD para instanciar la clase con los parámetros dados
        return instrumented(LoginUserPassSauceLabs.class,s,s1);
    }
}
