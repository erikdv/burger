package net.eriknet.burger.model;

import java.math.BigDecimal;

public class ComboBurger extends Burger {

    public static final BigDecimal SURCHARGE = new BigDecimal("2.00");
    public static final Boolean DRINKS = true;
    public static final Boolean CHIPS = true;

    public BigDecimal getTotalPrice() {
        return super.getTotalPrice().add(SURCHARGE);
    }
}
