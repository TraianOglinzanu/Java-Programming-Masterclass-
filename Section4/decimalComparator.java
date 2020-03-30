public class DecimalComparator{

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.175,-3.175));
	}

	public static boolean areEqualByThreeDecimalPlaces(double one, double two){
		if((one * 1000)==(two * 1000)){
			return true;
		}else{
			return false;
		}
	}
}
