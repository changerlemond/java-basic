package chapter07;

public class _04_Method {

    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox("black", "FHD", 200_000, "black");
        BlackBox.canAutoReport = true;
        blackBox.autoReport();
        blackBox.insertMemoryCard(256);
        int fileCount = blackBox.getVideoFileCount(1);
        System.out.printf("일반 영상 파일 수는 %d개 %n", fileCount);
    }

}
