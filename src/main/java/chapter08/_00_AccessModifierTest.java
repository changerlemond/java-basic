package chapter08;

import chapter07.BlackBoxRefurbish;

public class _00_AccessModifierTest {

    public static void main(String[] args) {
        BlackBoxRefurbish blackBoxRefurbish = new BlackBoxRefurbish();
        blackBoxRefurbish.modelName = "black";
//      blackBoxRefurbish.resolution("FHD"); // 불가
//      blackBoxRefurbish.price = 200_000; // 불가
//      blackBoxRefurbish.color = "black"; // 불가
    }

}
