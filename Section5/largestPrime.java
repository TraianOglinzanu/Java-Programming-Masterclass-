public class LargestPrime{

	public static void main(String[] args) {
		System.out.println(getLargestPrime(217));
	}

	public static int getLargestPrime(int number){
		if(number < 0)
			return -1;

		int i;

		for(i = 2; i <= number; i++){
			if(number % i == 0){
				number /= i;
			}
		}
		int prime = (i - 1);
		return prime;
	}
}
