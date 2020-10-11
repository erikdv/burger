package net.eriknet.burger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComboBurgerResponseDto {

    private String surcharge;

    @JsonProperty("burger")
    private BurgerResponseDto burgerDto;

    private String drinks;

    private String chips;

    public String getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(String surcharge) {
        this.surcharge = surcharge;
    }

    public BurgerResponseDto getBurgerDto() {
        return burgerDto;
    }

    public void setBurgerDto(BurgerResponseDto burgerDto) {
        this.burgerDto = burgerDto;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }
}
