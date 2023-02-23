package chapter04;

public class _06_While {

    public static void main(String[] args) {

        int distance = 25;

        int move = 0;

        while (move < distance) {
            System.out.printf("현재 이동 거리는 %d입니다.%n", move);
            move += 3;
        }
        System.out.println("도착!");

        // 무한루프 주의
        move = 0;

        while (move < distance) {
            System.out.printf("현재 이동 거리는 %d입니다.%n", move);
        }
        System.out.println("도착!");
    }

}
