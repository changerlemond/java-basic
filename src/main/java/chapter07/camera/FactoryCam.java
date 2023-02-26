package chapter07.camera;

public class FactoryCam extends Camera {

    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라");
    }

    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.printf("%s의 주요 기능: 화재 감지 %n", this.name);
    }

}
