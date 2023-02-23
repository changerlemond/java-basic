package chapter05;

public class _Quiz_05 {

    public static void main(String[] args) {
        
        int[] sizes = new int[10];

        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = 250 + (5 * i);
        }

        for (int size: sizes) {
            System.out.printf("사이즈 %d (재고 있음)%n", size);
        }

    }

}
