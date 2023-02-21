package chapter02;

public class _01_Operator1 {

    public static void main(String[] args) {

        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(5 % 2);

        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 (1이 더해진 후 print 수행.)
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 (print 수행 후 1이 더해진다.)
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        int waiting = 0;
        System.out.printf("대기 인원: %d %n", waiting++); // 0
        System.out.printf("대기 인원: %d %n", waiting++); // 1
        System.out.printf("대기 인원: %d %n", waiting++); // 2
        System.out.printf("총 대기 인원: %d %n", waiting); // 3

    }

}
