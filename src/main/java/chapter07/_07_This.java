package chapter07;

public class _07_This {

    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox("black", "FHD", 200_000, "black");
        blackBox.appendModelName("(최신형)");
        System.out.println(blackBox.getModelName());
    }

}
