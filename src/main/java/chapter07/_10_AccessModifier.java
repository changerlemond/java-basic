package chapter07;

public class _10_AccessModifier {

    public static void main(String[] args) {
        BlackBoxRefurbish blackBoxRefurbish = new BlackBoxRefurbish();

        blackBoxRefurbish.setPrice(90_000);
        blackBoxRefurbish.setColor("black");
        blackBoxRefurbish.setModelName("black");
        blackBoxRefurbish.setResolution("FHD");

        System.out.println(blackBoxRefurbish.getPrice());
    }

}
