package chapter05;

public class _04_MultiArrayLoop {

    public static void main(String[] args) {

        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (String[] seat : seats) {
            for (String string : seat) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");

        String[][] seats3 = new String[10][15];
        String[] english = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = english[i] + (j + 1);
            }
        }

        seats3[7][8] = "__";
        seats3[7][9] = "___";

        for (String[] strings : seats3) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }

}
