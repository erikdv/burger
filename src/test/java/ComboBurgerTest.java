import net.eriknet.burger.model.Burger;
import net.eriknet.burger.model.ComboBurger;
import net.eriknet.burger.model.Topping;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComboBurgerTest {

    @Test
    public void totalPriceWithToppingsTest() {

        var burger = new ComboBurger();
        burger.setMaxToppings(5);
        burger.addTopping(new Topping("topping1"));
        burger.addTopping(new Topping("topping2"));
        burger.addTopping(new Topping("topping3"));
        BigDecimal expected = Burger.BASE_PRIZE
                .add(Topping.SURCHARGE.multiply(BigDecimal.valueOf(3)))
                .add(ComboBurger.SURCHARGE);
        BigDecimal actual = burger.getTotalPrice();
        assertEquals(expected, actual);
    }
}
