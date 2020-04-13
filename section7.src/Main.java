package com.example.oopChallenge;

public class Main {
    public static void main(String[] args){
        Hamburger hamburger = new Hamburger("White", "Turkey");
        hamburger.order();
        hamburger.getOnionRings();
        hamburger.isLettuce();
        hamburger.isTomato();
        hamburger.cost(3);
        hamburger.totalCost();
    }
}
