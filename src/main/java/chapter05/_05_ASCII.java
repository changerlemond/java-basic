package chapter05;

public class _05_ASCII {

    public static void main(String[] args) {

        // 알파벳 대문자: 65부터, 소문자: 97부터, 숫자: 48부터 시작.

        char c = 'A';

        System.out.println(c);
        System.out.println((int)c);

        c = 'B';

        System.out.println(c);
        System.out.println((int)c);

        c++;

        System.out.println(c);
        System.out.println((int)c);

        String[][] seats3 = new String[10][15];
        char a = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(a) + (j + 1);
            }
            a++;
        }

        for (String[] strings : seats3) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }

}
