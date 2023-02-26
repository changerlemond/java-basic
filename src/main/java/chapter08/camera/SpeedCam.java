package chapter08.camera;

import chapter08.detector.Detectable;
import chapter08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {

    private Detectable detector;

    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
