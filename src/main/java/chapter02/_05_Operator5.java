package chapter02;

public class _05_Operator5 {

    public static void main(String[] args) {

        // 삼항 연산자
        int x = 5;

        int y = 3;

        int max = (x > y) ? x : y;

        System.out.println(max);

        int min = (x < y) ? x : y;

        System.out.println(min);

        boolean result = (x == y) ? true : false;

        System.out.println(result);

        String string = (x != y) ? "다르다" : "같다";

        System.out.println(string);

    }

}
