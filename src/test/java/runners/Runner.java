package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class) // Especifica que se utilizará Cucumber con Serenity para ejecutar las pruebas
@CucumberOptions(
        features = "./src/test/resources/features", // Ruta a la carpeta donde se encuentran los archivos .feature de Cucumber
        glue = "stepdefinitions", // Paquete donde se encuentran las clases de paso (step definitions)
        tags = "@ejemplo", // Etiqueta que indica qué escenarios de prueba ejecutar (en este caso, los que tienen la etiqueta @ejemplo)
        snippets = SnippetType.CAMELCASE // Estilo de snippets (métodos de paso) generados por Cucumber en caso de ser necesarios
)
public class Runner {
}
