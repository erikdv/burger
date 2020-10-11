import net.eriknet.burger.model.Bread;
import net.eriknet.burger.model.Meat;
import net.eriknet.burger.model.Burger;
import net.eriknet.burger.model.Topping;
import net.eriknet.burger.service.BurgerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = BurgerService.class)
public class BurgerServiceTest {

    @Autowired
    BurgerService service;

    @Test
    public void createBasicBurgerHasToppingsTest() {

        List<Topping> toppings = Stream.of("topping1", "topping2").map(Topping::new).collect(Collectors.toList());
        Burger burger = service.createBasicBurger(Meat.BLACK_ANGUS, Bread.WHOLEGRAIN, toppings);
        assertEquals(2, burger.getToppings().size());
    }

}
