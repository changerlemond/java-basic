package chapter06;

public class _02_Parameter {

    public static void power(int number) { // Parameter 매개변수
        int result = number * number;
        System.out.println(result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.printf("%d의 %d승은 %d %n", number, exponent, result);
    }

    public static void main(String[] args) {
        // Argument 전달
        power(2);
        power(3);

        powerByExp(2,3);
        powerByExp(3,3);
    }

}
