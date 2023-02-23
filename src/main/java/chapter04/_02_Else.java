package chapter04;

public class _02_Else {

    public static void main(String[] args) {

        int hour = 10;

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        } else {
            System.out.println("디카페인 아이스 아메리카노 +1");
        }

        System.out.println("#1 커피 주문 완료");

        hour = 15;

        boolean morningCoffee = true;

        if (hour >= 14 || morningCoffee) {
            System.out.println("디카페인 아이스 아메리카노 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }

        System.out.println("#2 커피 주문 완료");

    }

}
