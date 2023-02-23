package chapter03;

public class _03_StringCompare {

    public static void main(String[] args) {

        String string1 = "Java";
        String string2 = "Kotlin";

        System.out.println(string1.equals(string2)); // false
        System.out.println(string1.equals("Java")); // true
        System.out.println(string2.equals("kotlin")); // false - 대소문자 구분 O
        System.out.println(string2.equalsIgnoreCase("kotlin")); // true - 대소문자 구분 X

        String string3 = "1234";
        String string4 = "1234";
        System.out.println(string3.equals(string4)); // true ( 내용 비교)
        System.out.println(string3 == string4); // true (참조 비교)

        String string5 = new String("1234"); // true
        String string6 = new String("1234"); // true

        System.out.println(string5.equals(string6)); // true
        System.out.println(string5 == string6); // false

    }

}
