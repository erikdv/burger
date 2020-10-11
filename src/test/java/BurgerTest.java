import net.eriknet.burger.exception.MaxToppingsException;
import net.eriknet.burger.model.Burger;
import net.eriknet.burger.model.Topping;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


public class BurgerTest {

    @Test
    public void maxToppingsExceptionTest() {

        Burger burger = new Burger();
        burger.setMaxToppings(2);
        burger.addTopping(new Topping("topping1"));
        burger.addTopping(new Topping("topping2"));

        assertThrows(MaxToppingsException.class, () -> burger.addTopping(new Topping("topping3")));
    }

    @Test
    public void totalPriceWithToppingsTest() {

        Burger burger = new Burger();
        burger.setMaxToppings(5);
        burger.addTopping(new Topping("topping1"));
        burger.addTopping(new Topping("topping2"));
        burger.addTopping(new Topping("topping3"));
        BigDecimal expected = Burger.BASE_PRIZE.add(Topping.SURCHARGE.multiply(BigDecimal.valueOf(3)));
        BigDecimal actual = burger.getTotalPrice();
        assertEquals(expected, actual);
    }


}
