public class FirstAndLastDigitSum{

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
	}

	public static int sumFirstAndLastDigit(int number){
		if(number < 0)
			return -1;

		int firstDigit, lastDigit; 

		/* Last Digit */

		lastDigit = number % 10;

		/* First Digit */

		firstDigit = number;

		while(firstDigit >= 10){
			firstDigit /= 10;
		}

		return (firstDigit + lastDigit);
	}
}
