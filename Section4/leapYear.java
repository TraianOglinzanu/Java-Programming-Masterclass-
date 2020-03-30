public class LeapYear{

    public static void main(String[] args)
    {
        System.out.println(isLeapYear(2008));
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;

        else if ((year % 4 == 0) && (year % 100 == 0))
            return true;

        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
            return true;

        else
            return false;

    }
}
