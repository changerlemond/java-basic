package chapter04;

public class _10_Break {

    public static void main(String[] args) {

        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d번 손님, 주문하신 치킨 나왔습니다. %n", i);
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        int index = 1;
        while (index <= 50) {
            System.out.printf("%d번 손님, 주문하신 치킨 나왔습니다. %n", index);
            if (index == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }

}
