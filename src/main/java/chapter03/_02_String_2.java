package chapter03;

public class _02_String_2 {

    public static void main(String[] args) {
        String string = "I like Java and Kotlin!";
        System.out.println(string.replace(" and", ",")); // and 를 , 로 바꿔준다.
        System.out.println(string.substring(7, 15)); // 7번째 위치부터 15번째 위치까지 출력한다.
        System.out.println(string.substring(string.indexOf("Java"))); // 자바 시작 위치부터 끝까지
        System.out.println(string.substring(string.indexOf("Java"), string.indexOf("!"))); // 시작 위치부터 끝 위치 직전까지

        String string2 = "       I Love Java       ";
        System.out.println(string2);
        System.out.println(string2.trim());

        String string1 = "Java";
        String string3 = "Kotlin";
        System.out.println(string1 + string3);
        System.out.println(string1 + ", " + string3);
        System.out.println(string1.concat(", ").concat(string3));
    }

}
