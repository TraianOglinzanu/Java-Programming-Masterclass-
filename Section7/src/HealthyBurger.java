package com.example.oopChallenge;

public class HealthyBurger extends Hamburger {
    private String meat;
    private boolean kale;
    private boolean cucumbers;

    @Override
    public void order() {
        System.out.println("Your order was healthy burger on brown rye breadroll with " + meat +
                " meat ");
    }

    @Override
    public void totalCost() {
        System.out.println("Total cost of healthy burger comes to: " + cost(4.50) + " $ ");
    }

    @Override
    public double cost(double sum) {
        //return super.cost(sum);

        if(this.kale == true){
            sum += 0.75;
        }
        if(this.cucumbers == true){
            sum += 0.40;
        }
        return sum;
    }

    public HealthyBurger(String meat) {
        super("Brown Rye", meat); //Healthy burger has only Brown Rye breadroll
    }

    public boolean isKale() {
        System.out.println("Added kale for 0.75$");
        return kale;
    }

    public boolean isCucumbers() {
        System.out.println("Added cucumbers for 0.40$");
        return cucumbers;
    }
}
