package com.example.oopChallenge;

public class Hamburger {
    private String breadRoll;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean mustard;
    private double onionRings;
    //private int sum;

    public void order() {
        System.out.println("Your order was standard burger on " + breadRoll + " breadroll with " + meat +
                " meat ");
    }

    public void totalCost(){
        System.out.println("Total cost of burger comes to: " + cost(3) + " $ ");
    }

    public double cost(double sum){  //adds up the total cost of the burger
        //sum = 3; //base price of burger
        if(this.lettuce == true){
            sum += 0.50; //cost of lettuce
        }
        if(this.tomato == true){
            sum += 0.60; //cost of tomato
        }
        if(this.mustard == true){
            sum += 0.75; // cost of mustard
        }
        if(this.onionRings > 0){
            sum += (onionRings * 1.5); //cost of onion rings
        }
        return sum;
    }

    public Hamburger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.lettuce = true;
        this.tomato = true;
        this.mustard = false;
        this.onionRings = 2;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isLettuce() {
        System.out.println("Added lettuce for 0.50$");
        return lettuce;
    }

    public boolean isTomato() {
        System.out.println("Added tomato for 0.60$");
        return tomato;
    }

    public boolean isMustard() {
        System.out.println("Added mustard for 0.75$");
        return mustard;
    }

    public double getOnionRings() {
        System.out.println("Added Onion Rings");
        return onionRings;
    }
}
