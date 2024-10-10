package co.com.demoblaze.userinterfaces.shoppingproduct;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingTest {

    public static final Target PHONE_SAMSUNG = Target.the("PHONE_SAMSUNG").located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
    public static final Target ADD_TO_CART = Target.the("ADD_TO_CART").located(By.xpath("//a[contains(text(),'Add to cart')]"));
    public static final Target BUTTON_CART = Target.the("BUTTON_CART").located(By.xpath("//a[@id='cartur']"));
    public static final Target PLACE_ORDER = Target.the("PLACE_ORDER").located(By.xpath("//button[contains(text(),'Place Order')]"));


}
