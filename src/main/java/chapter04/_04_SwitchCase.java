package chapter04;

public class _04_SwitchCase {

    public static void main(String[] args) {

        // if-else: 여러 조건 또는 범위에 해당하는 조건
        int ranking = 1;

        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("#1 조회 완료");

        // switch: 명확한 케이스가 있는 경우

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("#2 조회 완료");

        int grade = 2;
        int price = 7000;

        switch (grade) {
            case 1:
                price += 1000;
                break;
            case 2:
                price += 500;
                break;
            case 3:
                price += 300;
                break;
        }
        System.out.printf("%d등급 제품의 가격 %d원", grade, price);
    }

}
