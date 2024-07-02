package configurations;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidReal {
    public AndroidDriver<MobileElement> ConfigReal() throws MalformedURLException {
        // Crear un objeto DesiredCapabilities para especificar las capacidades del dispositivo
        DesiredCapabilities cap = new DesiredCapabilities();

        // Especificar la plataforma como Android
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        // Especificar la versión del sistema operativo Android
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        // Especificar el nombre del dispositivo
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto one action");
        // Especificar el nombre del framework de automatización a usar (UiAutomator2)
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        // Especificar la ruta de la aplicación que se va a probar
        cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/src/test/resources/app/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        // Especificar la actividad principal de la aplicación
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".MainActivity");
        // Especificar el paquete de la aplicación
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.swaglabsmobileapp");

        // Crear y devolver un nuevo AndroidDriver con las capacidades especificadas
        return new AndroidDriver<>(new URL("http://localhost:4723/"), cap);
    }
}
