package chapter07;

public class _08_Constructor {

    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox("black", "FHD", 200_000, "black");
        System.out.println(blackBox.getSerialNumber());
    }

}
