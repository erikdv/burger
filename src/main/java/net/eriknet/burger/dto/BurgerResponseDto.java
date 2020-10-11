package net.eriknet.burger.dto;

import java.util.List;

public class BurgerResponseDto {

    String basePrice;
    String name;
    String meat;
    String bread;
    List<ToppingResponseDto> toppings;
    String totalPrice;

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public List<ToppingResponseDto> getToppings() {
        return toppings;
    }

    public void setToppings(List<ToppingResponseDto> toppings) {
        this.toppings = toppings;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
