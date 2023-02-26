package chapter07.camera;

public class ActionCam extends Camera {

    public final String lens;

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() {
        System.out.printf("%s: %s로 촬영한 영상을 통해 멋진 비디오를 제작합니다. %n", this.lens, this.name);
    }

}
