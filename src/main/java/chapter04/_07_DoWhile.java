package chapter04;

public class _07_DoWhile {

    public static void main(String[] args) {

        int distance = 25;

        int move = 0;

        int height = 2;

        while (move < distance) {
            System.out.printf("현재 이동 거리: %d%n", move);
            move += 3;
        }
        System.out.println("도착!");

        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.printf("현재 이동 거리: %d%n", move);
            move += 3;
        }
        System.out.println("도착!");

        do {
            System.out.printf("현재 이동 거리: %d%n", move);
            move += 3;
        } while (move < distance);
        System.out.println("도착!");
    }

}
