package net.eriknet.burger.model;

import net.eriknet.burger.exception.MaxToppingsException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Burger {

    public static final BigDecimal BASE_PRIZE = new BigDecimal("4.50");

    private String name;
    private int maxToppings;
    private final List<Topping> toppings = new ArrayList<>();
    private Meat meat;
    private Bread bread;


    public BigDecimal getTotalPrice() {

        BigDecimal toppingsTotal = Topping.SURCHARGE.multiply(new BigDecimal(toppings.size()));
        return BASE_PRIZE.add(toppingsTotal);
    }

    public void addTopping(Topping topping) {

        if (toppings.size() < maxToppings) {
            toppings.add(topping);
        }
        else {
            throw new MaxToppingsException(name, maxToppings);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxToppings() {
        return maxToppings;
    }

    public void setMaxToppings(int maxToppings) {
        this.maxToppings = maxToppings;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }
}
