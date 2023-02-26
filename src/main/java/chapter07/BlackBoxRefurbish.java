package chapter07;

public class BlackBoxRefurbish {

    public String modelName;

    private String resolution;

    private int price;

    private String color;

    public String getModelName() {
        return modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            System.out.println("판매자에게 문의하세요!");
        }
        return resolution;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
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
}
