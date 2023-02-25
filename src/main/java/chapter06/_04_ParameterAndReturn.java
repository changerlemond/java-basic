package chapter06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        int number = getPower(2);
        System.out.println(number);

        int returnValue = getPowerByExp(3, 3);
        System.out.println(returnValue);
    }

}
