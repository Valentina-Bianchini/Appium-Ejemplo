package userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UISauceLabs {
    // Define un Target utilizando xpath o accessibilityId
    public static final Target LOGO_SWAGLABS = Target
            .the("imagen de la marca Swag Labs")
            .located(MobileBy
                    .xpath("//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]"));
    public static final Target USUARIO = Target
            .the("campo usuario")
            .located(MobileBy
                    .AccessibilityId("test-Usuario"));
    public static final Target CONTRASENIA = Target
            .the("campo contraseña")
            .located(MobileBy
                    .AccessibilityId("test-Contraseña"));
    public static final Target BTN_LOGIN = Target
            .the("boton login")
            .located(MobileBy
                    .xpath("//*[@class= 'android.view.ViewGroup' and @content-desc='test-LOGIN']"));
    public static final Target MENU_PRINCIPAL = Target
            .the("menu principal de Home")
            .located(MobileBy
                    .AccessibilityId("test-Menu"));
    public static final Target CARRITO = Target
            .the("carrito de compras de Home")
            .located(MobileBy
                    .AccessibilityId("test-Carrito"));
    public static final Target PRODUCTO = Target
            .the("producto en Home")
            .located(MobileBy
                    .xpath("//*[@content-desc='test-Articulo']"));
}
