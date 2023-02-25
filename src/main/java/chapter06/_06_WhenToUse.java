package chapter06;

public class _06_WhenToUse {

    public static int getNumber(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNumber(2, 3));
    }

}
