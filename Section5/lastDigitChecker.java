public class LastDigitChecker{

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
	}

	public static boolean hasSameLastDigit(int x, int y, int z){
		if((x < 10 && x > 1000)||(y < 10 && y > 1000)||(z < 10 && z > 1000))
			return false;

		int a,b,c;

		a = x % 10;
		b = y % 10;
		c = z % 10;

		if((a == b)||(a == c)||(b == c))
			return true;
		else
			return false;
	} 
}
