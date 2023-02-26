package chapter07;

public class BlackBox {

    private String modelName;

    private String resolution;

    private int price;

    private String color;

    private int serialNumber;

    static int counter = 0;

    static boolean canAutoReport = false;

    public BlackBox(String modelName, String resolution, int price, String color) {
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
        this.serialNumber = ++counter;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고됩니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.printf("용량은 %d GB입니다. %n", capacity);
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.printf("영상은 %d분 단위로 기록됩니다.", min);
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터 (1588-0000)으로 연결합니다.");
    }

    public String getModelName() {
        return modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요!";
        }
        return resolution;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setPrice(int price) {
        this.price = Math.max(price, 100_000);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void appendModelName(String modelName) {
        this.modelName += modelName;
    }

}
