package net.eriknet.burger.model;

import java.math.BigDecimal;

public class Topping {

    public final static BigDecimal SURCHARGE = new BigDecimal("0.50");

    private String description;

    public Topping(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
