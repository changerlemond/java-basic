package chapter03;

public class _01_String1 {

    public static void main(String[] args) {
        String string = "I like Java and Kotlin!";
        System.out.println(string);

        // 문자열의 길이
        System.out.println(string.length());
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.contains("Java")); // true
        System.out.println(string.contains("Python")); // false
        System.out.println(string.indexOf("Java")); // 처음 일치하는 위치 출력
        System.out.println(string.indexOf("Python")); // 포함되지 않은 경우 -1이 출력
        System.out.println(string.lastIndexOf("and")); // 마지막에서 일치하는 위치 정보
        System.out.println(string.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(string.endsWith("!")); // 이 문자열로 끝나면 true
    }

}
