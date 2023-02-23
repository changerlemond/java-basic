package chapter04;

public class _01_If {

    public static void main(String[] args) {
        int hour = 15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("#1 커피 주문 완료!");

        hour = 10;
        boolean morningCoffee = false;
        if (hour < 14 && morningCoffee == false) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("#2 커피 주문 완료!");

        hour = 15;
        morningCoffee = true;

        if (hour >= 14 || morningCoffee) {
            System.out.println("디카페인 아이스 아메리카노 +1");
        }
        System.out.println("#3 디카페인 커피 주문 완료!");
    }

}
