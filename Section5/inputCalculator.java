import java.util.Scanner;

public class InputCalculator{

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		boolean hasNextInt = scanner.hasNextInt();

		int sum = 0;
		int count = 0;

		while(true){
			if(hasNextInt){
				int number = scanner.nextInt();
				scanner.nextLine();
				sum += number;
				count++;

			}else{
				System.out.println("Invalid");
				break;
			}
		}
		int average = Math.round(sum / count);
		System.out.println("Sum = " + sum + "Average = " + average);
		scanner.close();
	}
}
