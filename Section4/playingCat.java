public class PlayingCat{

	public static void main(String[] args){
		isCatPlaying(false,36);
	}

	public static void isCatPlaying(boolean summer, int temperature){
		if(summer == true){
			if((temperature > 25) || (temperature < 45)){
				System.out.println("True");
			}
		}else if(summer == false){
			if((temperature > 25) || (temperature < 35)){
				System.out.println("True");
			}
		}else{
			System.out.println("Invalid");
		}
	}
}
