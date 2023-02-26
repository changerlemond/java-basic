package chapter07;

import static chapter07.BlackBox.callServiceCenter;

public class _06_ClassMethod {

    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox("black", "FHD", 200_000, "black");
        callServiceCenter();
    }

}
