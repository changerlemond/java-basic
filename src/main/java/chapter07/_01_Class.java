package chapter07;

public class _01_Class {

    public static void main(String[] args) {

        String modelName = "black";

        String resolution = "FHD";

        int price = 200_000;

        String color = "black";

        //
        BlackBox blackBox = new BlackBox("black", "FHD", 200_000, "black");
        System.out.println(blackBox.getColor());
        System.out.println(blackBox.getModelName());

    }

}
