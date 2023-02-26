package chapter07;

import chapter07.camera.ActionCam;
import chapter07.camera.SlowActionCam;

public class _17_Final {

    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }

}
