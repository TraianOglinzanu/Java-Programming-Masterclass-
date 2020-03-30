public class MegaBytesConverter{

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(5000);
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes){
		if(kiloBytes < 0){
			System.out.println("Invalid Value");
		} else if(kiloBytes > 0){
			int megaBytes = (kiloBytes / 1024);
			int remainingkiloBytes = (kiloBytes % 1024);
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " 
			+ remainingkiloBytes + "KB");
		} else{
			System.out.println("-1");
		}
	}
}
