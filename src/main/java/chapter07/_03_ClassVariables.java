package chapter07;

public class _03_ClassVariables {

    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox("black", "FHD", 200_000, "black");
        BlackBox.canAutoReport = true;

        System.out.println(BlackBox.canAutoReport);
    }

}
