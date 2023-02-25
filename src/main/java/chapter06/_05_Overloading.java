package chapter06;

public class _05_Overloading {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = getPower("3");
        System.out.println(number);

        System.out.println(getPower(3, 3));
    }

}
