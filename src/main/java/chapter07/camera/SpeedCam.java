package chapter07.camera;

public class SpeedCam extends Camera {

    public SpeedCam() {
//        this.name = "과속 단속 카메라";
        super("과속 단속 카메라");
    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.printf("%s의 주요 기능: 속도 측정, 차량 번호 인식 %n", this.name);
    }

}
