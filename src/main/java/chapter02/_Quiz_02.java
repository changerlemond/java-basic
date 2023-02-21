package chapter02;

public class _Quiz_02 {

    public static void main(String[] args) {

        int height = 120;

        String result = (height >= 120) ? "가능합니다" : "불가능합니다.";

        System.out.printf("키가 %dcm 이므로 탑승 %s", height, result);

    }

}
