package chapter04;

public class _Quiz_04 {

    public static void main(String[] args) {
        int price = 4000;
        int hour = 5;
        int fee = price * hour;

        boolean isSmallCar = false;

        boolean withDisabledPerson = false;

        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisabledPerson) {
            fee /= 2;
        }

        System.out.printf("주차 요금은 %d 원입니다.", fee);
    }

}
