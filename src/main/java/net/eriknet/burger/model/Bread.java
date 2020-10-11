package net.eriknet.burger.model;


public enum Bread {

    WHOLEGRAIN("Wholegrain"),
    WHITE("White"),
    BRIOCHE("Brioche"),
    CIABATTA("Ciabatta");

    public final String description;

    Bread(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
