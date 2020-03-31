public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
	}

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int number_original = number;

        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10;
            reverse = reverse + remainder;
            number = number / 10;
        }

        if(number_original == reverse){
            return true;
        }else{
            return false;
        }
    }
}
