package co.com.demoblaze.userinterfaces.shoppingproduct;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PlaceOrder {

    public static final Target NAME = Target.the("NAME").located(By.xpath("//input[@id='name']"));
    public static final Target COUNTRY = Target.the("COUNTRY").located(By.xpath("//input[@id='country']"));
    public static final Target CITY = Target.the("CITY").located(By.xpath("//input[@id='city']"));
    public static final Target CREDIT_CARD = Target.the("CREDIT_CARD").located(By.xpath("//input[@id='card']"));
    public static final Target MONTH = Target.the("MONTH").located(By.xpath("//input[@id='month']"));
    public static final Target YEAR = Target.the("YEAR").located(By.xpath("//input[@id='year']"));
    public static final Target PURCHASE = Target.the("PURCHASE").located(By.xpath("//button[contains(text(),'Purchase')]"));
    public static final Target CONFIRM_PURCHASE = Target.the("CONFIRM_PURCHASE").located(By.xpath("//button[contains(text(),'OK')]"));


}
