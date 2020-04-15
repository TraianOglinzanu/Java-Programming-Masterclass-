package com.example.oopChallenge;

public class DeluxeBurger extends Hamburger {
    private double drink;
    private boolean chips;

    @Override
    public void order() {
        super.order();
    }

    @Override
    public void totalCost() {
        super.totalCost();
    }

    public DeluxeBurger(String breadRoll, String meat, double drink, boolean chips) {
        super(breadRoll, meat);
        this.drink = drink;
        this.chips = chips;
    }
}

