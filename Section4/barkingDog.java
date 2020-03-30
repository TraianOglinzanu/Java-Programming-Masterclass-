public class BarkingDog{

	public static void main(String[] args){
		shouldWakeup(true, 1);
	}

	public static void shouldWakeup(Boolean bark, int hourofday){
		if((hourofday > 8) && (bark == true)){
			System.out.println("True");
		} else if ((hourofday < 23 && hourofday > 9) && (bark == true)){
			System.out.println("True");
		} else{
			System.out.println("False");
		}
	}
}
