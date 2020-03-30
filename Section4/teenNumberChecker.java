public class TeenNumberChecker{

	public static void main(String[] args) {
		System.out.println(hasTeen(9,99,19));
		System.out.println(isTeen(9));
	}

	public static boolean hasTeen(int one, int two, int three){
		if(one > 13 || one < 19){
			return true;
		}else if (two > 13 || two < 19){
			return true;
		}else if (three > 13 || three < 19){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isTeen(int age){
		if(age > 13 && age < 19){
			return true;
		}else{
			return false;
		}
	}
}
