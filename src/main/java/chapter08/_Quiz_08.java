package chapter08;

import chapter08.camera.SpeedCam;
import chapter08.detector.AccidentDetector;
import chapter08.reporter.VideoReporter;

public class _Quiz_08 {

    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }

}
