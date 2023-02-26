package chapter08;

import chapter08.camera.FactoryCam;
import chapter08.detector.AdvancedFireDetector;
import chapter08.detector.Detectable;
import chapter08.detector.FireDetector;
import chapter08.reporter.NormalReporter;
import chapter08.reporter.Reportable;
import chapter08.reporter.VideoReporter;

public class _02_Interface {

    public static void main(String[] args) {
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);
        factoryCam.detect();
        factoryCam.report();
    }

}
