public class SharedDigit{

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
	}

	public static boolean hasSharedDigit(int one, int two){
		if((one < 10 && one > 99)||(two < 10 && two > 99))
			return false;

		int a, b; //one
		int c, d; //two


		b = one % 10;
		a = one;

		while(a >= 10){
			a /= 10;
		}

		d = two % 10;
		c = two;

		while(c >= 10){
			c /= 10;
		}

		if((a == c)||(a == d)||(b == c)||(b == d))
			return true;
		else
			return false;
	}
}
