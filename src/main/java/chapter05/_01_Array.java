package chapter05;

public class _01_Array {

    public static void main(String[] args) {

        String coffeeRoss = "아메리카노";

        String coffeeRachel = "카페모카";

        String coffeeChandler = "카페라떼";

        String coffeeMonica = "카푸치노";

        System.out.printf("%s 하나 %n", coffeeRoss);
        System.out.printf("%s 하나 %n", coffeeRachel);
        System.out.printf("%s 하나 %n", coffeeChandler);
        System.out.printf("%s 하나 %n", coffeeMonica);
        System.out.println("주세요!");

        String[] coffeeList = new String[4];

        String coffees[] = new String[4];
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "카페라떼";
        coffees[3] = "카푸치노";

        String[] coffee = new String[] {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        String[] coffeeLists = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        System.out.printf("%s 하나 %n", coffeeLists[0]);
        System.out.printf("%s 하나 %n", coffeeLists[1]);
        coffeeLists[2] = "에스프레소";
        System.out.printf("%s 하나 %n", coffeeLists[2]);
        System.out.printf("%s 하나 %n", coffeeLists[3]);
        System.out.println("주세요!");

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        double[] doubles = new double[] {10.0, 11.2, 13.5};
        boolean[] booleans = {true, true, false};

    }

}
