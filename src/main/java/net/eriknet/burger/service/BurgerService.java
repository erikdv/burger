package net.eriknet.burger.service;

import net.eriknet.burger.model.Bread;
import net.eriknet.burger.model.Meat;
import net.eriknet.burger.model.Burger;
import net.eriknet.burger.model.ComboBurger;
import net.eriknet.burger.model.Topping;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BurgerService {

    private final static String BASIC_NAME = "Basic Hamburger";
    private final static int BASIC_MAX_TOPPINGS = 4;

    private final static String HEALTHY_NAME = "Healthy Hamburger";
    private final static int HEALTHY_MAX_TOPPINGS = 6;

    private final static String COMBO_BURGER_NAME = "Combo Hamburger";


    public Burger createBasicBurger(Meat meat, Bread bread, List<Topping> toppings) {

        var burger = createBurger(BASIC_NAME, BASIC_MAX_TOPPINGS, meat, bread);
        toppings.forEach(burger::addTopping);
        return burger;
    }

    public Burger createHealthyBurger(Meat meat, Bread bread, List<Topping> toppings) {

        var burger = createBurger(HEALTHY_NAME, HEALTHY_MAX_TOPPINGS, meat, bread);
        toppings.forEach(burger::addTopping);
        return burger;
    }

    public ComboBurger createComboBurger(Meat meat, Bread bread, List<Topping> toppings) {

        var burger = new ComboBurger();
        burger.setName(COMBO_BURGER_NAME);
        burger.setMaxToppings(BASIC_MAX_TOPPINGS);
        burger.setMeat(meat);
        burger.setBread(bread);
        toppings.forEach(burger::addTopping);
        return burger;
    }

    private Burger createBurger(String name, int maxToppings, Meat meat, Bread bread) {

        var burger = new Burger();
        burger.setName(name);
        burger.setMeat(meat);
        burger.setBread(bread);
        burger.setMaxToppings(maxToppings);
        return burger;
    }
}
