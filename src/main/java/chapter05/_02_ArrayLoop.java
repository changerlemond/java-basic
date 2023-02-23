package chapter05;

public class _02_ArrayLoop {

    public static void main(String[] args) {

        String[] coffeeLists = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        for (int i = 0; i < coffeeLists.length; i++) {
            System.out.printf("%s 하나 %n", coffeeLists[i]);
        }
        System.out.println("주세요!");

        // enhanced for
        for (String coffee : coffeeLists) {
            System.out.printf("%s 하나 %n", coffee);
        }
        System.out.println("주세요!");

    }

}
