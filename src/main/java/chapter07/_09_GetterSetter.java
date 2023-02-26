package chapter07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox("black", "", 200_000, "black");
        blackBox.setPrice(90_000);
        System.out.println(blackBox.getResolution());
        System.out.println(blackBox.getPrice());
    }
}
