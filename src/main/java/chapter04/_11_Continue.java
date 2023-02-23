package chapter04;

public class _11_Continue {

    public static void main(String[] args) {

        int max = 20;

        int sold = 0;

        int noShow = 17;

        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d번 손님, 주문하신 치킨 나왔습니다. %n", i);
            if (i == noShow) {
                System.out.printf("%d번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다. %n", i);
                continue;
            }

            sold++;

            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        int index = 1;

        sold = 0;

        index = 0;

        while (true) {
            index++;
            System.out.printf("%d번 손님, 주문하신 치킨 나왔습니다. %n", index);
            if (noShow == index) {
                System.out.printf("%d번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다. %n", index);
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

    }

}
