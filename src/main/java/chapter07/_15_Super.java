package chapter07;

import chapter07.camera.Camera;
import chapter07.camera.FactoryCam;
import chapter07.camera.SpeedCam;

public class _15_Super {

    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        speedCam.takePicture();

        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);
    }

}
