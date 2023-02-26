package chapter08;

import chapter08.camera.FactoryCam;
import chapter08.camera.SpeedCam;

public class _01_AbstractClass {

    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }

}
