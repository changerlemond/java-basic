package chapter02;

public class _04_Operator4 {

    public static void main(String[] args) {

        boolean 김치찌개 = false;

        boolean 계란말이 = true;

        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // or 조건 - true

        System.out.println(김치찌개 && 계란말이 && 제육볶음); // and 조건 - false

        System.out.println((5 > 3) && (3 > 1)); // true

        System.out.println((5 > 3) && (3 < 1)); // false

        System.out.println((5 > 3) || (3 > 1)); //true

        System.out.println((5 > 3) || (3 < 1)); // true

        System.out.println((5 < 3) || (3 < 1)); // false

//        System.out.println(1 < 3 < 5); 이런 연산은 불가
        System.out.println(!true); // false

        System.out.println(!false); // true

        System.out.println(!(5 == 5)); // false

        System.out.println(!(5 == 3)); // true

    }

}
