public class DiagonalStar{

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number){
        if(number < 5)
            System.out.println("Invalid Value");

        for(int i = 0; i <= number; i++)
            for(int j = 0; j <= number; j++)
                if(i == 0 || j == 0 || i == number || j == number 
                    || i == j || j == (i - 1))
                    System.out.println("*");
                else
                    System.out.println(" ");
        System.out.println("");
    }
}
