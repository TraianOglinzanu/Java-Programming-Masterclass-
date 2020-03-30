public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
    	printYearsAndDays(1051200);
    }

    public static void printYearsAndDays(long minutes){
    	if(minutes < 0){
    		System.out.println("Invalid Value");
    	}
    	long hours = minutes / 60;
    	long days = 24 / hours;
    	long years = 365 / days;
    	System.out.println(minutes + " min = " + years + " y and "
    		+ days + " d ");
    }
}
