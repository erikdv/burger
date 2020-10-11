package net.eriknet.burger.exception;

public class MaxToppingsException extends RuntimeException {

    public MaxToppingsException(String burgerName, int limit) {
        super(String.format("Max toppings for %s is: %d", burgerName, limit));
    }
}
