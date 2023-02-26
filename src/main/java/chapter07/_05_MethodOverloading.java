package chapter07;

public class _05_MethodOverloading {

    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox("black", "FHD", 200_000, "black");

        blackBox.record(false, false, 10);
        blackBox.record(true, false, 3);
        blackBox.record(true, true, 5);
        blackBox.record();

    }

}
