package net.eriknet.burger.model;

public enum Meat {

    BLACK_ANGUS("Black angus patty"),
    KOBE_BEEF("Kobe beef patty"),
    VEGAN("Vegan patty"),
    FISH("Fish patty");

    public final String description;

    private Meat(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
