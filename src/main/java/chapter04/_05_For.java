package chapter04;

public class _05_For {

    public static void main(String[] args) {

        // 반복문
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요, 환영합니다. " + i);
        }

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.printf("현재까지 총합은 %d입니다.%n", sum);
        }

    }

}
